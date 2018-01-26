package p2p.work;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.sun.corba.se.spi.activation.Server;

import p2p.net.FtpTool;
import p2p.pub.SceneFile;
import p2p.query.SmsDepot;
import p2p.query.SmsLoadState;
import p2p.scene.CScene;
import p2p.scene.CSceneManager;
import p2p.scene.ISceneType;
import p2p.server.ServerContext;

public class WorkSmsPost implements Work{

	private static Logger logger = Logger.getLogger(WorkSmsPost.class);

	//短信查询接口
	List<SmsDepot> list = new ArrayList<SmsDepot>();

	//增加处理项
	public void add(SmsDepot sd){
		list.add(sd);
	}
	
	//处理过程
	private void process() throws Exception{
		
		SceneFile sf1 = new SceneFile(ISceneType.SCENE_3);
		SceneFile sf2 = new SceneFile(ISceneType.SCENE_4);
		SceneFile sf3 = new SceneFile(ISceneType.SCENE_5);
		
		int checkSecond = ServerContext.getInstance().getCfg().getInt("checkSecond");
		while(true){
			
			logger.info("sms post thread is checking ........");
			
			if(list.isEmpty()){
				break;
			}
			
			for(int i = 0; i < list.size(); i++){
				if(list.get(i).getState() == SmsLoadState.OK){
					
					CSceneManager sceneManager = new CSceneManager();
					CScene s3 = new CScene();
					CScene s4 = new CScene();
					CScene s5 = new CScene();
					
					s3.busiParse(ServerContext.getInstance().getCfg().getValue("scene3_busicode"));
					s4.busiParse(ServerContext.getInstance().getCfg().getValue("scene4_busicode"));
					s5.busiParse(ServerContext.getInstance().getCfg().getValue("scene5_busicode"));
					
					sceneManager.putScene(ISceneType.SCENE_3, s3);
					sceneManager.putScene(ISceneType.SCENE_4, s4);
					sceneManager.putScene(ISceneType.SCENE_5, s5);
					
					//筛选数据
					sceneManager.smsSort(list.get(i));
					
					//内存实例化到文件
					sf1.writeSceneDataList2File(s3, ISceneType.SCENE_3);
					sf2.writeSceneDataList2File(s4, ISceneType.SCENE_4);
					sf3.writeSceneDataList2File(s5, ISceneType.SCENE_5);
					
					logger.info("work sms process is remove class=" + list.get(i).getClass());
					list.remove(i);
				}
			}
			
			try {
				Thread.sleep(checkSecond * 1000);
				
			} catch (InterruptedException e) {
				logger.error("happen what?", e);
			}
		}
		
		//送文件到远程ftp主机
		String ip = ServerContext.getInstance().getCfg().getValue("ftp_ip");
		String user = ServerContext.getInstance().getCfg().getValue("ftp_name");
		String pwd = ServerContext.getInstance().getCfg().getValue("ftp_pwd");
		String path = ServerContext.getInstance().getCfg().getValue("datapath");
		
		if(ServerContext.getInstance().getCfg().getBoolean("ftp_is_open")){
			
			List<String> fileList = new ArrayList<String>();
			fileList.add(path + "/" + sf1.getFname());
			fileList.add(path + "/" + sf2.getFname());
			fileList.add(path + "/" + sf3.getFname());
			
			FtpTool ftp = new FtpTool();
			ftp.upload(ip, user, pwd, fileList);
//			sf1.post(ip, user, pwd);
//			sf2.post(ip, user, pwd);
//			sf3.post(ip, user, pwd);			
		}
	}
	
	@Override
	public void run() {
		
		logger.info("######################### work sms post task thread is start #######################");
		
		try {
			process();
		} catch (Exception e) {
			logger.error("ftp is post file error", e);
		}
		
		logger.info("######################### work sms post task thread is finish #######################");
	}
	
}
