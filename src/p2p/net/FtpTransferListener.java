package p2p.net;

import org.apache.log4j.Logger;

import it.sauronsoftware.ftp4j.FTPDataTransferListener;

//上传和下载文件时， 监听文件传输的状态
public class FtpTransferListener implements FTPDataTransferListener {

	private static Logger logger = Logger.getLogger(FtpTransferListener.class);

	
	// 文件开始上传或下载时触发
	public void started() {
		logger.info("ftp post file is started");
	}

	// 显示已经传输的字节数
	public void transferred(int length) {
		logger.info("ftp post file is transferred");
	}

	// 文件传输完成时，触发
	public void completed() {
		logger.info("ftp post file is completed");
	}

	// 传输放弃时触发
	public void aborted() {
		logger.info("ftp post file is aborted");

	}

	// 传输失败时触发
	public void failed() {
		logger.info("ftp post file is failed");
	}
 }
