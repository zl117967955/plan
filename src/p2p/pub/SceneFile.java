package p2p.pub;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.apache.log4j.Logger;

import p2p.query.SmsDepotData;
import p2p.scene.CScene;
import p2p.scene.ISceneType;
import p2p.server.ServerContext;

public class SceneFile {

	private static Logger logger = Logger.getLogger(SceneFile.class);
	
	//生成文件存放目录位置
	private String path = "";
	//文件前缀名
	private String prefixname = "";
	//分隔符
	private String regex = "";
	//文件后缀名
	private String suffix = "";
	//文件名
	private String fname = "";

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPrefixname() {
		return prefixname;
	}

	public void setPrefixname(String prefixname) {
		this.prefixname = prefixname;
	}

	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public SceneFile(String sceneNum) throws Exception{

		if(ISceneType.SCENE_3.equals(sceneNum)){
			this.path = ServerContext.getInstance().getCfg().getValue("datapath");
			prefixname = ServerContext.getInstance().getCfg().getValue("scene3");
			regex = ServerContext.getInstance().getCfg().getValue("regex");
			suffix = ServerContext.getInstance().getCfg().getValue("suffix");			
		}else if(ISceneType.SCENE_4.equals(sceneNum)){
			this.path = ServerContext.getInstance().getCfg().getValue("datapath");
			prefixname = ServerContext.getInstance().getCfg().getValue("scene4");
			regex = ServerContext.getInstance().getCfg().getValue("regex");
			suffix = ServerContext.getInstance().getCfg().getValue("suffix");
		}else if(ISceneType.SCENE_5.equals(sceneNum)){
			this.path = ServerContext.getInstance().getCfg().getValue("datapath");
			prefixname = ServerContext.getInstance().getCfg().getValue("scene5");
			regex = ServerContext.getInstance().getCfg().getValue("regex");
			suffix = ServerContext.getInstance().getCfg().getValue("suffix");
		}

		String date = ServerContext.getInstance().getParameter("date");
		String index = ServerContext.getInstance().getParameter("index");
		this.fname = buildFileName(prefixname, date, index);
	}

	public String buildFileName(String scencePrefix, String yyyymmdd, String index) {

		int idx = Integer.parseInt(index);
		return scencePrefix + "_" + yyyymmdd + "_" + String.format("%08d", idx) + "." + suffix;
	}
	
	//数据列表实例化到文件
	public void writeSceneDataList2File(CScene scene, String type) throws Exception {
		BufferedWriter out = null;
		try {
			logger.info("success list size = " + scene.getSmsList().size() + " path = " + path + " fname = " + fname);
			
			String date = ServerContext.getInstance().getParameter("date");
			String index = ServerContext.getInstance().getParameter("index");
			
			String filename = buildFileName(prefixname, date, index);

			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path + "/" + filename, true)));
			
			for(int i = 0; i < scene.getSmsList().size(); i++){
				out.write(data2String(scene.getSmsList().get(i)));
			}
			
		} catch (Exception e) {
			logger.error("catch exception: ", e);
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				logger.error("catch exception: ", e);
			}
		}
	}

	public String data2String(SmsDepotData data) throws Exception{
		return 	CUtil.valS2Strng(data.getSerialId()) + regex +	//流水号
				CUtil.valS2Strng(data.getServNo()) + regex + 	//业务设备号
				//CUtil.valS2Strng(data.getSerialId().substring(11, 25)) + regex + //接收时间
				CUtil.valDate2Strng(data.getCallTime()) + regex + //接收时间
				CUtil.valDate2Strng(data.getSendTime()) + regex +	//发送时间
				CUtil.valS2Strng(data.getStatus()) + regex +		//短信状态
				CUtil.valS2Strng("") + regex +		//失败原因
				CUtil.valS2Strng(data.getMsgId()) + regex +	//短信流水号
				CUtil.valS2Strng(data.getServiceProvider()) + regex +	//业务场景号
				CUtil.valDate2Strng(data.getStartTime()) + regex +	//下发时间
				CUtil.valDate2Strng(data.getEndTime()) + regex + 	//状态报告返回时间
				CUtil.valS2Strng("10000") + regex +	//发送号码
				CUtil.valS2Strng(data.getCalledNum()) + "\n";		 //接收号码 
	}
	
    public static boolean createDir(String destDirName) {  
        File dir = new File(destDirName);  
        if (dir.exists()) {  
            logger.error("创建目录" + destDirName + "目标目录已经存在");  
            return false;  
        }  
        if (!destDirName.endsWith(File.separator)) {  
            destDirName = destDirName + File.separator;  
        }  
        //创建目录  
        if (dir.mkdirs()) {  
        	logger.error("创建目录" + destDirName + "成功！");  
            return true;  
        } else {  
        	logger.error("创建目录" + destDirName + "失败！");  
            return false;  
        }  
    }  
}
