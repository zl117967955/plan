package p2p.work;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class WorkManager {
	
	private static Logger logger = Logger.getLogger(WorkManager.class);

	//任务队列
	private List<Work> list = new ArrayList<Work>();

	//增加任务
	public void add(Work w){
		list.add(w);
	}
	
	//处理任务
	public void process(){
		
		logger.info("p2p server work_manager is start");
		for(int i = 0; i < list.size(); i++){

			Thread thread = new Thread(list.get(i));
			thread.start();
		}
		logger.info("p2p server work_manager is finish");
	}
}
