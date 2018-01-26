package p2p.query;

import java.util.Date;

public class SmsDepotData {
	
	private String	serialId = "";
	private String	servNo = "";
	private Date	callTime = null;
	private Date	sendTime = null;
	private String	status = "";
	private String	smsErrCode ="";
	private String	msgId	=	"";
	private	String	serviceProvider	=	"";
	private Date	startTime = null;
	private	Date	endTime	=	null;
	private	String	callingNum	= "";
	private String	calledNum	=	"";
	

	public String getSerialId() {
		return serialId;
	}
	public void setSerialId(String serialId) {
		this.serialId = serialId;
	}
	public String getServNo() {
		return servNo;
	}
	public void setServNo(String servNo) {
		this.servNo = servNo;
	}
	public Date getCallTime() {
		return callTime;
	}
	public void setCallTime(Date callTime) {
		this.callTime = callTime;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSmsErrCode() {
		return smsErrCode;
	}
	public void setSmsErrCode(String smsErrCode) {
		this.smsErrCode = smsErrCode;
	}
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getCallingNum() {
		return callingNum;
	}
	public void setCallingNum(String callingNum) {
		this.callingNum = callingNum;
	}
	public String getCalledNum() {
		return calledNum;
	}
	public void setCalledNum(String calledNum) {
		this.calledNum = calledNum;
	}
	
	
}
