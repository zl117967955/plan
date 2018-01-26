package p2p.scene;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p2p.query.SmsDepot;
import p2p.query.SmsDepotData;

public class CSceneManager {
	
	//场景组
	private Map<String, CScene> sceneMap = new HashMap<String, CScene>();

	public void putScene(String sceneType, CScene scene){
		sceneMap.put(sceneType, scene);
	}
	
	//把短信仓库的数据分类到各个场景中
	public void smsSort(SmsDepot smsDepot) throws Exception{

		List<SmsDepotData> s3 = new ArrayList<SmsDepotData>();
		List<SmsDepotData> s4 = new ArrayList<SmsDepotData>();
		List<SmsDepotData> s5 = new ArrayList<SmsDepotData>();
		
		for(int i = 0; i < smsDepot.getList().size(); i++){
			
			SmsDepotData data = smsDepot.getList().get(i);
			
			if(sceneMap.get(ISceneType.SCENE_3).isVaidScene(data.getServiceProvider())){
				s3.add(data);
			}else if(sceneMap.get(ISceneType.SCENE_4).isVaidScene(data.getServiceProvider())){
				s4.add(data);
			}else if(sceneMap.get(ISceneType.SCENE_5).isVaidScene(data.getServiceProvider())){
				s5.add(data);
			}else{
				throw new Exception("err busiz code[" + data.getServiceProvider() + "]");
			}
		}
		
		
		sceneMap.get(ISceneType.SCENE_3).setSmsList(s3);
		sceneMap.get(ISceneType.SCENE_4).setSmsList(s4);
		sceneMap.get(ISceneType.SCENE_5).setSmsList(s5);
	}
}
