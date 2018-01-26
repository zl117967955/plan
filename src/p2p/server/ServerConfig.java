package p2p.server;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
 
public class ServerConfig{
	
	private static Logger logger = Logger.getLogger(ServerConfig.class);
	
	//配置文件名
	private String pathName = "";
	
	//配置文件内容
	private Map<String, String> value = new HashMap<String, String>();

	public ServerConfig(String pathName) throws IOException{
		this.pathName = pathName;
		load();
	}

	//装载配置数据
	public void load() throws IOException{

		InputStream in = null;
		
		try {
			
			logger.info("config file is loading, file name is = " + pathName);
			
			Properties prop = new Properties();
			in = new BufferedInputStream(new FileInputStream(pathName));
			prop.load(in);
			Iterator<String> it = prop.stringPropertyNames().iterator();
			while (it.hasNext()) {
				String key = it.next();
				value.put(key, prop.getProperty(key));
				logger.info("config file is reading  key=<" + key + ">  value=<" + prop.getProperty(key) + ">");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			in.close();
			System.out.println("config file finally block fname = " + pathName);
			
		} 

	}

	public int getInt(String key){
		return Integer.parseInt(value.get(key));
	}
	
	public String getValue(String key) {
		return value.get(key);
	}
	
	public boolean getBoolean(String key){
		String s = value.get(key);
		return "true".equals(s) ? true : false;
	}
}
