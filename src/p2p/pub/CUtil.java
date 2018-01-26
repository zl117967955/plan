package p2p.pub;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import com.mysql.jdbc.StringUtils;

public class CUtil {
	
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(CUtil.class);
	
	public static String getDate(){
		//因为现在的策略是每小时生成一个文件，那么序列就以小时当做序列。(后期换成从数据库读取)
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(date);
	}

	public static String valDate2Strng(Date date){
		if(null == date){
			return "NULL";
		}
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sf.format(date);
	}
	
	public static String valS2Strng(String val){
		if(StringUtils.isNullOrEmpty(val)){
			return "NULL";
		}else{
			return val;
		}
	}
	
	/*
	 * test
	 * 
	 * */
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
		System.out.println(sf.format(now));
		
	}
}
