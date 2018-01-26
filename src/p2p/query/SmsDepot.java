package p2p.query;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmsDepot {
	
	private List<SmsDepotData> list = new ArrayList<SmsDepotData>();	//存放短信数据
	private int rownumStart = 0;	//查询起始位置
	private int rownumCount = 0;	//查询数量
	private SmsLoadState state = SmsLoadState.NOT_OK;	//短信数据是否加载完成
	private Map<String, Object> cond = new HashMap<String, Object>();	//条件参数集合
	
	
	public Object getCond(String key) {
		return cond.get(key);
	}

	public void putCond(String key, Object val) {
		cond.put(key, val);
	}

	public List<SmsDepotData> getList() {
		return list;
	}
	
	protected void setList(List<SmsDepotData> list) {
		this.list = list;
	}
	
	public int getRownumStart() {
		return rownumStart;
	}
	public void setRownumStart(int rownumStart) {
		this.rownumStart = rownumStart;
	}
	public int getRownumCount() {
		return rownumCount;
	}
	public void setRownumCount(int rownumCount) {
		this.rownumCount = rownumCount;
	}
	public SmsLoadState getState() {
		return state;
	}
	protected void setState(SmsLoadState state) {
		this.state = state;
	}
	
}
