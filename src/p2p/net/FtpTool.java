package p2p.net;

import java.util.List;

import org.apache.log4j.Logger;

import it.sauronsoftware.ftp4j.FTPClient;

public class FtpTool {

	private static Logger logger = Logger.getLogger(FtpTool.class);

	public void upload(String ip, String user, String pwd, List<String> fileList) throws Exception {

		
		logger.info("ftp upload info<ip user pwd fileList> is [" + ip + "," + user + "," + pwd + ", " + fileList.size());
		if (fileList.size() <= 0) {
			return;
		}

		FTPClient client = new FTPClient();
		try {
			client.connect(ip, 21);
			client.login(user, pwd);
			client.setType(FTPClient.TYPE_AUTO);
			
			for (int i = 0; i < fileList.size(); i++) {
				String fname = fileList.get(i);
				client.upload(new java.io.File(fname), new FtpTransferListener());
				logger.info("ftp upload info filename=" + fname);
			}
		} catch (Exception e) {
			logger.error(e);
			throw e;
		} finally {
			client.disconnect(true);
		}
	}

}
