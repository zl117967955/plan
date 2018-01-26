package p2p.server;

import java.util.HashMap;
import java.util.Map;

public class ServerContext {
	
	//启动参数
	private String args[];
	
	//主配置文件
	private ServerConfig cfg = null;

	//环境参数
	private Map<String, String> parameter = new HashMap<String, String>();

	private ServerContext() {
	}
	
	private static ServerContext instance = new ServerContext();
	
	public static ServerContext getInstance(){
		return instance;
	}
	
	public String[] getArgs() {
		return args;
	}

	public void setArgs(String[] args) {
		this.args = args;
	}

	public ServerConfig getCfg() {
		return cfg;
	}

	public void setCfg(ServerConfig cfg) {
		this.cfg = cfg;
	}

	public String getParameter(String key) {
		return parameter.get(key);
	}

	public void setParameter(String key, String value) {
		parameter.put(key, value);
	}
	
}
