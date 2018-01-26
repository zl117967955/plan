package p2p.model;



/**
 * <ul>
 * <li> <b>目的:</b> <br />
 * <p>
 * 实体对象，请勿做客户化操作， 对应表:NTF_SHQ_SMS_HISTORY	NTF_SHQ_SMS_HISTORY
 * </p>
 * </li>
 * <li><b>采用的不变量：</b></li>
 * <li><b>并行策略：</b></li>
 * <li> <b>修改历史：</b><br />
 * <p>
 * 创建:2013-11-11 10:46:32<br />
 * 作者:CodeGenerator
 * </p>
 * </li>
 * <li><b>已知问题：</b></li>
 * </ul>
*/
public abstract class AbstractTNtfShqSmsHistoryDTO extends DtoSupport
{	//ID
	private java.lang.String id;

	//FIXED_FEE
	private java.lang.String fixedFee;

	//ACCESS_SYSTEM_DEP
	private java.lang.String accessSystemDep;

	//MT_SEQ
	private java.lang.String mtSeq;

	//ACCESS_ACCOUNT
	private java.lang.String accessAccount;

	//MESSAGE_ID
	private java.lang.String messageId;

	//MSG_ID
	private java.lang.String msgId;

	//TASKNAME
	private java.lang.String taskname;

	//PLAN_SEQ
	private java.lang.String planSeq;

	//SEND_PRIORITY
	private java.lang.Double sendPriority;

	//MT_SERV_TYPE
	private java.lang.String mtServType;

	//MSG_FORMAT
	private java.lang.Double msgFormat;

	//BIZNAME
	private java.lang.String bizname;

	//FEE_TYPE
	private java.lang.String feeType;

	//MSG_CONTENT
	private java.lang.String msgContent;

	//ENCODE
	private java.lang.String encode;

	//REMOTEIP
	private java.lang.String remoteip;

	//MAKE_TIME
	private java.util.Date makeTime;

	//REQUIRE_APPLY
	private java.lang.Double requireApply;

	//FEE_USER_TERMID
	private java.lang.String feeUserTermid;

	//FAIL_SENT_TIMES
	private java.lang.Double failSentTimes;

	//SERVICE_ID
	private java.lang.String serviceId;

	//LINK_ID
	private java.lang.String linkId;

	//RECV_TIME
	private java.util.Date recvTime;

	//HAVE_SENT_TIMES
	private java.lang.Double haveSentTimes;

	//DEST_TERMID
	private java.lang.String destTermid;

	//SEND_STATUS
	private java.lang.String sendStatus;

	//SMS_STATUS
	private java.lang.String smsStatus;

	//ACCESS_PASSWORD
	private java.lang.String accessPassword;

	//SP
	private java.lang.String sp;

	//SEND_TIME
	private java.util.Date sendTime;

	//RECV_STATUS
	private java.lang.String recvStatus;

	//SMS_SENDING_TIME
	private java.util.Date smsSendingTime;

	//SMS_BUILD_TIME
	private java.util.Date smsBuildTime;

	//FEE_CODE
	private java.lang.String feeCode;

	//BIZCODE
	private java.lang.String bizcode;

	//FEE_USER_TYPE
	private java.lang.String feeUserType;

	//LAST_SENT_TIME
	private java.util.Date lastSentTime;

	//SRC_TERMID
	private java.lang.String srcTermid;

	//SMS_SESSION
	private java.lang.String smsSession;

	//SMS_SEND_TIME
	private java.util.Date smsSendTime;

	public  AbstractTNtfShqSmsHistoryDTO()
	{
		
	}


	public  AbstractTNtfShqSmsHistoryDTO(java.lang.String id)
	{
		this.setId(id);
	}


	/**
	 * getID
	 * 
	 * @return ID
	*/
	public java.lang.String getId()
	{
		return id;
	}

	/**
	 * setID
	 * 
	 * @param ID
	 * @return void 
	*/
	public void setId(java.lang.String id)
	{
		this.id=id;
	}

	/**
	 * getFIXED_FEE
	 * 
	 * @return FIXED_FEE
	*/
	public java.lang.String getFixedFee()
	{
		return fixedFee;
	}

	/**
	 * setFIXED_FEE
	 * 
	 * @param FIXED_FEE
	 * @return void 
	*/
	public void setFixedFee(java.lang.String fixedFee)
	{
		this.fixedFee=fixedFee;
	}

	/**
	 * getACCESS_SYSTEM_DEP
	 * 
	 * @return ACCESS_SYSTEM_DEP
	*/
	public java.lang.String getAccessSystemDep()
	{
		return accessSystemDep;
	}

	/**
	 * setACCESS_SYSTEM_DEP
	 * 
	 * @param ACCESS_SYSTEM_DEP
	 * @return void 
	*/
	public void setAccessSystemDep(java.lang.String accessSystemDep)
	{
		this.accessSystemDep=accessSystemDep;
	}

	/**
	 * getMT_SEQ
	 * 
	 * @return MT_SEQ
	*/
	public java.lang.String getMtSeq()
	{
		return mtSeq;
	}

	/**
	 * setMT_SEQ
	 * 
	 * @param MT_SEQ
	 * @return void 
	*/
	public void setMtSeq(java.lang.String mtSeq)
	{
		this.mtSeq=mtSeq;
	}

	/**
	 * getACCESS_ACCOUNT
	 * 
	 * @return ACCESS_ACCOUNT
	*/
	public java.lang.String getAccessAccount()
	{
		return accessAccount;
	}

	/**
	 * setACCESS_ACCOUNT
	 * 
	 * @param ACCESS_ACCOUNT
	 * @return void 
	*/
	public void setAccessAccount(java.lang.String accessAccount)
	{
		this.accessAccount=accessAccount;
	}

	/**
	 * getMESSAGE_ID
	 * 
	 * @return MESSAGE_ID
	*/
	public java.lang.String getMessageId()
	{
		return messageId;
	}

	/**
	 * setMESSAGE_ID
	 * 
	 * @param MESSAGE_ID
	 * @return void 
	*/
	public void setMessageId(java.lang.String messageId)
	{
		this.messageId=messageId;
	}

	/**
	 * getMSG_ID
	 * 
	 * @return MSG_ID
	*/
	public java.lang.String getMsgId()
	{
		return msgId;
	}

	/**
	 * setMSG_ID
	 * 
	 * @param MSG_ID
	 * @return void 
	*/
	public void setMsgId(java.lang.String msgId)
	{
		this.msgId=msgId;
	}

	/**
	 * getTASKNAME
	 * 
	 * @return TASKNAME
	*/
	public java.lang.String getTaskname()
	{
		return taskname;
	}

	/**
	 * setTASKNAME
	 * 
	 * @param TASKNAME
	 * @return void 
	*/
	public void setTaskname(java.lang.String taskname)
	{
		this.taskname=taskname;
	}

	/**
	 * getPLAN_SEQ
	 * 
	 * @return PLAN_SEQ
	*/
	public java.lang.String getPlanSeq()
	{
		return planSeq;
	}

	/**
	 * setPLAN_SEQ
	 * 
	 * @param PLAN_SEQ
	 * @return void 
	*/
	public void setPlanSeq(java.lang.String planSeq)
	{
		this.planSeq=planSeq;
	}

	/**
	 * getSEND_PRIORITY
	 * 
	 * @return SEND_PRIORITY
	*/
	public java.lang.Double getSendPriority()
	{
		return sendPriority;
	}

	/**
	 * setSEND_PRIORITY
	 * 
	 * @param SEND_PRIORITY
	 * @return void 
	*/
	public void setSendPriority(java.lang.Double sendPriority)
	{
		this.sendPriority=sendPriority;
	}

	/**
	 * getMT_SERV_TYPE
	 * 
	 * @return MT_SERV_TYPE
	*/
	public java.lang.String getMtServType()
	{
		return mtServType;
	}

	/**
	 * setMT_SERV_TYPE
	 * 
	 * @param MT_SERV_TYPE
	 * @return void 
	*/
	public void setMtServType(java.lang.String mtServType)
	{
		this.mtServType=mtServType;
	}

	/**
	 * getMSG_FORMAT
	 * 
	 * @return MSG_FORMAT
	*/
	public java.lang.Double getMsgFormat()
	{
		return msgFormat;
	}

	/**
	 * setMSG_FORMAT
	 * 
	 * @param MSG_FORMAT
	 * @return void 
	*/
	public void setMsgFormat(java.lang.Double msgFormat)
	{
		this.msgFormat=msgFormat;
	}

	/**
	 * getBIZNAME
	 * 
	 * @return BIZNAME
	*/
	public java.lang.String getBizname()
	{
		return bizname;
	}

	/**
	 * setBIZNAME
	 * 
	 * @param BIZNAME
	 * @return void 
	*/
	public void setBizname(java.lang.String bizname)
	{
		this.bizname=bizname;
	}

	/**
	 * getFEE_TYPE
	 * 
	 * @return FEE_TYPE
	*/
	public java.lang.String getFeeType()
	{
		return feeType;
	}

	/**
	 * setFEE_TYPE
	 * 
	 * @param FEE_TYPE
	 * @return void 
	*/
	public void setFeeType(java.lang.String feeType)
	{
		this.feeType=feeType;
	}

	/**
	 * getMSG_CONTENT
	 * 
	 * @return MSG_CONTENT
	*/
	public java.lang.String getMsgContent()
	{
		return msgContent;
	}

	/**
	 * setMSG_CONTENT
	 * 
	 * @param MSG_CONTENT
	 * @return void 
	*/
	public void setMsgContent(java.lang.String msgContent)
	{
		this.msgContent=msgContent;
	}

	/**
	 * getENCODE
	 * 
	 * @return ENCODE
	*/
	public java.lang.String getEncode()
	{
		return encode;
	}

	/**
	 * setENCODE
	 * 
	 * @param ENCODE
	 * @return void 
	*/
	public void setEncode(java.lang.String encode)
	{
		this.encode=encode;
	}

	/**
	 * getREMOTEIP
	 * 
	 * @return REMOTEIP
	*/
	public java.lang.String getRemoteip()
	{
		return remoteip;
	}

	/**
	 * setREMOTEIP
	 * 
	 * @param REMOTEIP
	 * @return void 
	*/
	public void setRemoteip(java.lang.String remoteip)
	{
		this.remoteip=remoteip;
	}

	/**
	 * getMAKE_TIME
	 * 
	 * @return MAKE_TIME
	*/
	public java.util.Date getMakeTime()
	{
		return makeTime;
	}

	/**
	 * setMAKE_TIME
	 * 
	 * @param MAKE_TIME
	 * @return void 
	*/
	public void setMakeTime(java.util.Date makeTime)
	{
		this.makeTime=makeTime;
	}

	/**
	 * getREQUIRE_APPLY
	 * 
	 * @return REQUIRE_APPLY
	*/
	public java.lang.Double getRequireApply()
	{
		return requireApply;
	}

	/**
	 * setREQUIRE_APPLY
	 * 
	 * @param REQUIRE_APPLY
	 * @return void 
	*/
	public void setRequireApply(java.lang.Double requireApply)
	{
		this.requireApply=requireApply;
	}

	/**
	 * getFEE_USER_TERMID
	 * 
	 * @return FEE_USER_TERMID
	*/
	public java.lang.String getFeeUserTermid()
	{
		return feeUserTermid;
	}

	/**
	 * setFEE_USER_TERMID
	 * 
	 * @param FEE_USER_TERMID
	 * @return void 
	*/
	public void setFeeUserTermid(java.lang.String feeUserTermid)
	{
		this.feeUserTermid=feeUserTermid;
	}

	/**
	 * getFAIL_SENT_TIMES
	 * 
	 * @return FAIL_SENT_TIMES
	*/
	public java.lang.Double getFailSentTimes()
	{
		return failSentTimes;
	}

	/**
	 * setFAIL_SENT_TIMES
	 * 
	 * @param FAIL_SENT_TIMES
	 * @return void 
	*/
	public void setFailSentTimes(java.lang.Double failSentTimes)
	{
		this.failSentTimes=failSentTimes;
	}

	/**
	 * getSERVICE_ID
	 * 
	 * @return SERVICE_ID
	*/
	public java.lang.String getServiceId()
	{
		return serviceId;
	}

	/**
	 * setSERVICE_ID
	 * 
	 * @param SERVICE_ID
	 * @return void 
	*/
	public void setServiceId(java.lang.String serviceId)
	{
		this.serviceId=serviceId;
	}

	/**
	 * getLINK_ID
	 * 
	 * @return LINK_ID
	*/
	public java.lang.String getLinkId()
	{
		return linkId;
	}

	/**
	 * setLINK_ID
	 * 
	 * @param LINK_ID
	 * @return void 
	*/
	public void setLinkId(java.lang.String linkId)
	{
		this.linkId=linkId;
	}

	/**
	 * getRECV_TIME
	 * 
	 * @return RECV_TIME
	*/
	public java.util.Date getRecvTime()
	{
		return recvTime;
	}

	/**
	 * setRECV_TIME
	 * 
	 * @param RECV_TIME
	 * @return void 
	*/
	public void setRecvTime(java.util.Date recvTime)
	{
		this.recvTime=recvTime;
	}

	/**
	 * getHAVE_SENT_TIMES
	 * 
	 * @return HAVE_SENT_TIMES
	*/
	public java.lang.Double getHaveSentTimes()
	{
		return haveSentTimes;
	}

	/**
	 * setHAVE_SENT_TIMES
	 * 
	 * @param HAVE_SENT_TIMES
	 * @return void 
	*/
	public void setHaveSentTimes(java.lang.Double haveSentTimes)
	{
		this.haveSentTimes=haveSentTimes;
	}

	/**
	 * getDEST_TERMID
	 * 
	 * @return DEST_TERMID
	*/
	public java.lang.String getDestTermid()
	{
		return destTermid;
	}

	/**
	 * setDEST_TERMID
	 * 
	 * @param DEST_TERMID
	 * @return void 
	*/
	public void setDestTermid(java.lang.String destTermid)
	{
		this.destTermid=destTermid;
	}

	/**
	 * getSEND_STATUS
	 * 
	 * @return SEND_STATUS
	*/
	public java.lang.String getSendStatus()
	{
		return sendStatus;
	}

	/**
	 * setSEND_STATUS
	 * 
	 * @param SEND_STATUS
	 * @return void 
	*/
	public void setSendStatus(java.lang.String sendStatus)
	{
		this.sendStatus=sendStatus;
	}

	/**
	 * getSMS_STATUS
	 * 
	 * @return SMS_STATUS
	*/
	public java.lang.String getSmsStatus()
	{
		return smsStatus;
	}

	/**
	 * setSMS_STATUS
	 * 
	 * @param SMS_STATUS
	 * @return void 
	*/
	public void setSmsStatus(java.lang.String smsStatus)
	{
		this.smsStatus=smsStatus;
	}

	/**
	 * getACCESS_PASSWORD
	 * 
	 * @return ACCESS_PASSWORD
	*/
	public java.lang.String getAccessPassword()
	{
		return accessPassword;
	}

	/**
	 * setACCESS_PASSWORD
	 * 
	 * @param ACCESS_PASSWORD
	 * @return void 
	*/
	public void setAccessPassword(java.lang.String accessPassword)
	{
		this.accessPassword=accessPassword;
	}

	/**
	 * getSP
	 * 
	 * @return SP
	*/
	public java.lang.String getSp()
	{
		return sp;
	}

	/**
	 * setSP
	 * 
	 * @param SP
	 * @return void 
	*/
	public void setSp(java.lang.String sp)
	{
		this.sp=sp;
	}

	/**
	 * getSEND_TIME
	 * 
	 * @return SEND_TIME
	*/
	public java.util.Date getSendTime()
	{
		return sendTime;
	}

	/**
	 * setSEND_TIME
	 * 
	 * @param SEND_TIME
	 * @return void 
	*/
	public void setSendTime(java.util.Date sendTime)
	{
		this.sendTime=sendTime;
	}

	/**
	 * getRECV_STATUS
	 * 
	 * @return RECV_STATUS
	*/
	public java.lang.String getRecvStatus()
	{
		return recvStatus;
	}

	/**
	 * setRECV_STATUS
	 * 
	 * @param RECV_STATUS
	 * @return void 
	*/
	public void setRecvStatus(java.lang.String recvStatus)
	{
		this.recvStatus=recvStatus;
	}

	/**
	 * getSMS_SENDING_TIME
	 * 
	 * @return SMS_SENDING_TIME
	*/
	public java.util.Date getSmsSendingTime()
	{
		return smsSendingTime;
	}

	/**
	 * setSMS_SENDING_TIME
	 * 
	 * @param SMS_SENDING_TIME
	 * @return void 
	*/
	public void setSmsSendingTime(java.util.Date smsSendingTime)
	{
		this.smsSendingTime=smsSendingTime;
	}

	/**
	 * getSMS_BUILD_TIME
	 * 
	 * @return SMS_BUILD_TIME
	*/
	public java.util.Date getSmsBuildTime()
	{
		return smsBuildTime;
	}

	/**
	 * setSMS_BUILD_TIME
	 * 
	 * @param SMS_BUILD_TIME
	 * @return void 
	*/
	public void setSmsBuildTime(java.util.Date smsBuildTime)
	{
		this.smsBuildTime=smsBuildTime;
	}

	/**
	 * getFEE_CODE
	 * 
	 * @return FEE_CODE
	*/
	public java.lang.String getFeeCode()
	{
		return feeCode;
	}

	/**
	 * setFEE_CODE
	 * 
	 * @param FEE_CODE
	 * @return void 
	*/
	public void setFeeCode(java.lang.String feeCode)
	{
		this.feeCode=feeCode;
	}

	/**
	 * getBIZCODE
	 * 
	 * @return BIZCODE
	*/
	public java.lang.String getBizcode()
	{
		return bizcode;
	}

	/**
	 * setBIZCODE
	 * 
	 * @param BIZCODE
	 * @return void 
	*/
	public void setBizcode(java.lang.String bizcode)
	{
		this.bizcode=bizcode;
	}

	/**
	 * getFEE_USER_TYPE
	 * 
	 * @return FEE_USER_TYPE
	*/
	public java.lang.String getFeeUserType()
	{
		return feeUserType;
	}

	/**
	 * setFEE_USER_TYPE
	 * 
	 * @param FEE_USER_TYPE
	 * @return void 
	*/
	public void setFeeUserType(java.lang.String feeUserType)
	{
		this.feeUserType=feeUserType;
	}

	/**
	 * getLAST_SENT_TIME
	 * 
	 * @return LAST_SENT_TIME
	*/
	public java.util.Date getLastSentTime()
	{
		return lastSentTime;
	}

	/**
	 * setLAST_SENT_TIME
	 * 
	 * @param LAST_SENT_TIME
	 * @return void 
	*/
	public void setLastSentTime(java.util.Date lastSentTime)
	{
		this.lastSentTime=lastSentTime;
	}

	/**
	 * getSRC_TERMID
	 * 
	 * @return SRC_TERMID
	*/
	public java.lang.String getSrcTermid()
	{
		return srcTermid;
	}

	/**
	 * setSRC_TERMID
	 * 
	 * @param SRC_TERMID
	 * @return void 
	*/
	public void setSrcTermid(java.lang.String srcTermid)
	{
		this.srcTermid=srcTermid;
	}

	/**
	 * getSMS_SESSION
	 * 
	 * @return SMS_SESSION
	*/
	public java.lang.String getSmsSession()
	{
		return smsSession;
	}

	/**
	 * setSMS_SESSION
	 * 
	 * @param SMS_SESSION
	 * @return void 
	*/
	public void setSmsSession(java.lang.String smsSession)
	{
		this.smsSession=smsSession;
	}

	/**
	 * getSMS_SEND_TIME
	 * 
	 * @return SMS_SEND_TIME
	*/
	public java.util.Date getSmsSendTime()
	{
		return smsSendTime;
	}

	/**
	 * setSMS_SEND_TIME
	 * 
	 * @param SMS_SEND_TIME
	 * @return void 
	*/
	public void setSmsSendTime(java.util.Date smsSendTime)
	{
		this.smsSendTime=smsSendTime;
	}

}