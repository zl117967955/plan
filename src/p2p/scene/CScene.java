package p2p.scene;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import p2p.query.SmsDepotData;

public class CScene {

	private static Logger logger = Logger.getLogger(CScene.class);

	//业务编码集合
	private Map<String, String>	busiMap = new HashMap<String, String>();
	//短信列表
	private List<SmsDepotData> smsList = new ArrayList<SmsDepotData>();
	
	//配置场景业务编码
	public void busiParse(String list){
		
		logger.info("busi code parse, src string list is=" + list);
		
		String s[] = list.split(",");
		for(int i = 0; i < s.length; i++){
			busiMap.put(s[i], "valid");
			logger.info("busi code parse, dest map key,val = [" + s[i] + "," + busiMap.get(s[i]));
		}
	}
	
	//业务编码是否符合当前场景
	public boolean isVaidScene(String s){
		if("valid".equals(busiMap.get(s))){
			return true;
		}else {
			return false;
		}
	}

	public List<SmsDepotData> getSmsList() {
		return smsList;
	}

	public void setSmsList(List<SmsDepotData> smsList) {
		this.smsList = smsList;
	} 
	


	
}
