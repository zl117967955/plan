package p2p.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainTest {
	
	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(new Date());
		rightNow.add(Calendar.DATE, -1);
		Date dt1 = rightNow.getTime();
		String date = sdf.format(dt1);
		System.out.println(date);
//		String smsBuildTime = "12345678901234567890123456".substring(11, 25);
//		System.out.println(smsBuildTime);
//		String ip = "10.11.0.245";
//		String user = "data_ftp";
//		String pwd = "Data_1122";
//		
//		String fullname = "/home/admin/test/data/" + args[0];
//		
//		//String fullname = ServerContext.getInstance().getParameter("basicDir") + "/" + path + "/" + fname;
//		
//		System.out.print("ftp is post info: ip=[" + ip + "] user=[" + user + "] + pwd=[" + pwd + "] fullname=[" + fullname + "]");
//		
//        Ftp f = new Ftp();
//        f.setIpAddr(ip);
//        f.setUserName(user);
//        f.setPwd(pwd);
//        try {
//			FtpUtil.connectFtp(f);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//        File file = new File(fullname);  
//        
//        if(file.exists()){
//        	try {
//				FtpUtil.upload(file);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}//把文件上传在ftp上			
//        }else {
//        	System.out.println("file is not exit");
//        }
	}
}
