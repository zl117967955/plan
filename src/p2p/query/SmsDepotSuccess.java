package p2p.query;

import java.io.File;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import p2p.model.TNtfShqSmsHistoryDTO;

//查询成功短信类
public class SmsDepotSuccess extends SmsDepot implements QuerySms{
	
	private static Logger logger = Logger.getLogger(SmsDepotSuccess.class);
	
	public SmsDepotSuccess() {
		setState(SmsLoadState.NOT_OK);
	}

	@Override
	public List<SmsDepotData> query() throws Exception {
		
		logger.info("qry qry qry qry qry, qry success sms deport start");

		List<TNtfShqSmsHistoryDTO> list = null;
		SessionFactory factory = null;
		
		Configuration cfg = new Configuration();  
		cfg.configure(new File("config/hibernate.cfg.xml"));
		
		Session session = null;
		try {
			factory = cfg.buildSessionFactory();  
			session = factory.openSession();  

			String bizcodes = (String) getCond("bizcodes");
			
			String hql = "from TNtfShqSmsHistoryDTO as t where "
			+ "t.smsBuildTime >= ? and "
			+ "t.smsBuildTime <= ? and "
			+ "t.bizcode in(" + bizcodes +") ";

			Query query = session.createQuery(hql);
			
			// 设置参数
			query.setParameter(0, getCond("timeBegin"));
			query.setParameter(1, getCond("timeEnd"));
			
			//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			//query.setDate("buildTime", format.parse("2017-12-28 00:00:00"));
			//query.setFirstResult(0);
			//query.setMaxResults(1000000);

			list = query.list();
			
			logger.info("[SmsDepotSuccess] query process size=" + list.size());

		} catch (Exception e) {
			logger.error("[ql process err] ", e);
		} finally {
			session.close();
			factory.close();
		}
		
		
		logger.info("[SmsDepotSuccesss] start/count/state=" + getRownumStart() + "/" + getRownumCount() + "/" + getState());
		
		for(int i = 0; i < list.size(); i++){
			
			SmsDepotData a = new SmsDepotData();
			a.setSerialId(list.get(i).getMtSeq());			//流水号
			a.setServNo(list.get(i).getDestTermid());		//业务号码(设备号）
			a.setCallTime(list.get(i).getSmsBuildTime());	//接收时间
			a.setSendTime(list.get(i).getSmsSendTime());	//发送时间
			a.setStatus("1");								//短信状态(1表示发送成功,0表示发送是吧)	
			a.setSmsErrCode("");							//失败原因
			a.setMsgId(list.get(i).getMsgId());				//短消息流水号
			a.setServiceProvider(list.get(i).getBizcode());	//流量提醒场景ID
			a.setStartTime(list.get(i).getSmsSendingTime());//下发时间
			a.setEndTime(list.get(i).getSmsSendTime());		//状态报告返回时间
			a.setCallingNum("10000");						//发送号码
			a.setCalledNum(list.get(i).getDestTermid());	//接收号码
			getList().add(a);
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setState(SmsLoadState.OK);
		
		logger.info("qry qry qry qry qry, qry success sms deport finish");
		return getList();
	}

}
