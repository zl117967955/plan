package p2p.work;

import org.apache.log4j.Logger;

import p2p.query.QuerySms;

//短信查询任务
public class WorkSmsQuery implements Work{

	private static Logger logger = Logger.getLogger(WorkSmsQuery.class);
	
	//短信查询接口
	private QuerySms querySms = null;

	public QuerySms getQuerySms() {
		return querySms;
	}

	public void setQuerySms(QuerySms querySms) {
		this.querySms = querySms;
	}


	@Override
	public void run() {
		logger.info("############ work query sms task thread is start ##############[" + getQuerySms().getClass() + "]");
		try {
			querySms.query();
		} catch (Exception e) {
			logger.error("work exception", e);
			//e.printStackTrace();
		}
		logger.info("############ work query sms task thread is stop ###############[" + getQuerySms().getClass() + "]");
	}

}
