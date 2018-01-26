package p2p.query;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import p2p.model.TNtfSHSmsMtBakDTO;

//查询失败短信类
public class SmsDepotFailed extends SmsDepot implements QuerySms{

	private static Logger logger = Logger.getLogger(SmsDepotFailed.class);
	
	public SmsDepotFailed() {
		setState(SmsLoadState.NOT_OK);
	}
	
	@Override
	public List<SmsDepotData> query() throws Exception {
		
		logger.info("qry qry qry qry qry, qry failed sms deport start");
		
		List<TNtfSHSmsMtBakDTO> list = null;
		SessionFactory factory = null;
		
		Configuration cfg = new Configuration();  
		cfg.configure(new File("config/hibernate.cfg.xml"));
		
		Session session = null;
		try {
			factory = cfg.buildSessionFactory();  
			session = factory.openSession();  
			String bizcodes = (String) getCond("bizcodes");
			
			String hql = "from TNtfSHSmsMtBakDTO as t where "
			+ "t.lastSentTime >= ? and "
			+ "t.lastSentTime <= ? and "
			+ "t.bizcode in(" + bizcodes +")";

			Query query = session.createQuery(hql);
			// 设置参数
			query.setParameter(0, getCond("timeBegin"));
			query.setParameter(1, getCond("timeEnd"));
			
			//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			//query.setDate("buildTime", format.parse("2017-12-28 00:00:00"));
			//query.setFirstResult(0);
			//query.setMaxResults(1000000);

			list = query.list();
			
			logger.info("[SmsDepotFailed] query process size=" + list.size());

		} catch (Exception e) {
			logger.error("[ql process err] ", e);
		} finally {
			session.close();
			factory.close();
		}
		logger.info("[SmsFailed.query] start/count/state=" + getRownumStart() + "/" + getRownumCount() + "/" + getState());
		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		
		for(int i = 0; i < list.size(); i++){
			
			
			SmsDepotData a = new SmsDepotData();	//流水号
			String smsBuildTime = list.get(i).getMtSeq().substring(11, 25);
			
			a.setSerialId(list.get(i).getMtSeq());	//业务号码(设备号）
			a.setServNo(list.get(i).getDestTermid());	//接收时间
			a.setCallTime(format.parse(smsBuildTime));	//发送时间
			a.setSendTime(list.get(i).getLastSentTime());	//短信状态
			a.setStatus("0");		//短信状态(0代表短信发送失败)
			a.setSmsErrCode("");	//失败原因
			a.setMsgId(list.get(i).getMsgId());	//短消息流水号
			a.setServiceProvider(list.get(i).getBizcode());	//流量提醒场景ID
			a.setStartTime(format.parse(smsBuildTime));	//下发时间
			a.setEndTime(list.get(i).getLastSentTime());	//状态报告返回时间
			a.setCallingNum("10000");	//发送号码
			a.setCalledNum(list.get(i).getDestTermid());	//接收号码
			getList().add(a);
		}
		
		setState(SmsLoadState.OK);
		
		logger.info("qry qry qry qry qry, qry failed sms deport finish");
		
		return getList();
	}

}
