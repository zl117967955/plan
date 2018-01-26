package p2p.query;

import java.util.List;


//短信查询接口
public interface QuerySms {
	List<SmsDepotData> query() throws Exception ;
}
