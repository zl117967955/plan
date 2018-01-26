package p2p.server;

import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import p2p.pub.CUtil;
import p2p.pub.IConfigInfo;
import p2p.pub.SceneFile;
import p2p.pub.SmsSequence;
import p2p.query.SmsDepotFailed;
import p2p.query.SmsDepotSuccess;
import p2p.work.WorkManager;
import p2p.work.WorkSmsPost;
import p2p.work.WorkSmsQuery;

public class Server {

	
	private static Logger logger = Logger.getLogger(Server.class);

	
	public void init(String[] args) throws IOException{


		//log4j初始化
		PropertyConfigurator.configure(IConfigInfo.LOG_4_J_CFG_PATH);
		
		//装载主服务参数
		ServerConfig cfg = new ServerConfig(IConfigInfo.SERVER_CFG_PATH);
		
		ServerContext.getInstance().setArgs(args);
		ServerContext.getInstance().setCfg(cfg);
		ServerContext.getInstance().setParameter("basicDir", System.getProperty("user.dir"));
		//创建资源
		SceneFile.createDir("data");

		//环境检测
		logger.info("java.class.path = " + System.getProperty("java.class.path"));
		logger.info("usr.dir = " + System.getProperty("user.dir"));
		
		
		logger.info("###################################################");
		logger.info("###  p2psmspost server process is starting  v.1 ###");
		logger.info("###################################################");

	}
	
	public void start() throws Exception{
		
		System.out.println("[Server.start] service is start");
		
		int index = 0;
		String date = "";
		String timeBegin = "";
		String timeEnd = "";
		
		if(ServerContext.getInstance().getArgs().length == 2){
			
			date = ServerContext.getInstance().getArgs()[0];
			index = Integer.parseInt(ServerContext.getInstance().getArgs()[1]);
			
			
			String year = date.substring(0, 4);
			String month = date.substring(4, 6);
			String day = date.substring(6, 8);
			
			timeBegin = year + "-" + month + "-" + day + " " + String.format("%02d:00:00", index);
			timeEnd = year + "-" + month + "-" + day + " " + String.format("%02d:59:59", index);
		}else{
			
			SmsSequence ssq = new SmsSequence();
			ssq.build();
			date = ssq.getDate();
			index = ssq.getIndex();
			timeBegin = CUtil.getDate() + " " + String.format("%02d:00:00", index);
			timeEnd = CUtil.getDate() + " " + String.format("%02d:59:59", index);
			
			
			//index = SmsSequence.getNext();
		}
		
		ServerContext.getInstance().setParameter("date", date);
		ServerContext.getInstance().setParameter("index", index + "");
		
//		ServerContext.getInstance().setParameter("date", value);
//		ServerContext.getInstance().setParameter("index", index + "");
//		ServerContext.getInstance().setParameter("timeBegin", timeBegin);
//		ServerContext.getInstance().setParameter("timeEnd", timeEnd);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//短信查询列表
		SmsDepotSuccess SmsSuccessDepot = new SmsDepotSuccess();
		SmsDepotFailed qrySmsFailedDepot = new SmsDepotFailed();
		
		String bizcodes3 = ServerContext.getInstance().getCfg().getValue("scene3_busicode");
		String bizcodes4 = ServerContext.getInstance().getCfg().getValue("scene4_busicode");
		String bizcodes5 = ServerContext.getInstance().getCfg().getValue("scene5_busicode");
		String bizcodes = bizcodes3 + "," + bizcodes4 + "," + bizcodes5;
		bizcodes = bizcodes.replaceAll(",", "\',\'");
		bizcodes = "'"  + bizcodes + "'";
		
		logger.info("timeBegin=" + timeBegin + " timeEnd=" + timeEnd + " bizcodes=" + bizcodes);
		
		//这里认为一个小时之内成功或者失败的短信总量不会超过10W，如果查过，那么查询类重构为分页方式
		SmsSuccessDepot.setRownumStart(0);
		SmsSuccessDepot.setRownumCount(100000);
		SmsSuccessDepot.putCond("timeBegin", format.parse(timeBegin));
		SmsSuccessDepot.putCond("timeEnd", format.parse(timeEnd));
		SmsSuccessDepot.putCond("bizcodes", bizcodes);
		
		qrySmsFailedDepot.setRownumStart(0);
		qrySmsFailedDepot.setRownumCount(100000);
		qrySmsFailedDepot.putCond("timeBegin", format.parse(timeBegin));
		qrySmsFailedDepot.putCond("timeEnd", format.parse(timeEnd));
		qrySmsFailedDepot.putCond("bizcodes", bizcodes);
		
		//创建短信查询任务（查询发送成功的）
		WorkSmsQuery smsSuccessWork = new WorkSmsQuery();
		smsSuccessWork.setQuerySms(SmsSuccessDepot);
		
		//创建短信查询任务（查询失败的）
		WorkSmsQuery smsFailedWork = new WorkSmsQuery();
		smsFailedWork.setQuerySms(qrySmsFailedDepot);
		
		//短信文件上送
		WorkSmsPost smsPost = new WorkSmsPost();
		smsPost.add(SmsSuccessDepot);
		smsPost.add(qrySmsFailedDepot);
		
		//执行任务
		WorkManager smsManager = new WorkManager();
		smsManager.add(smsSuccessWork);
		smsManager.add(smsFailedWork);
		smsManager.add(smsPost);
		smsManager.process();
		
		System.out.println("[Server.start] service is finish");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("[Server.main] main process start");

		Server server = new Server();
		try {
			server.init(args);
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("[Server.main] main process finish");

	}
}
