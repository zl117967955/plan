package p2p.model;

/**
 * <ul>
 * <li> <b>目的:</b> <br />
 * <p>
 * 实体对象，请勿做客户化操作， 对应表:NTF_S_SMS_MT	MT短信话单日志表（在数据库中按月份分区存储)
 * </p>
 * </li>
 * <li><b>采用的不变量：</b></li>
 * <li><b>并行策略：</b></li>
 * <li> <b>修改历史：</b><br />
 * <p>
 * 创建:2012-12-11 16:29:31<br />
 * 作者:CodeGenerator
 * </p>
 * </li>
 * <li><b>已知问题：</b></li>
 * </ul>
*/
public abstract class AbstractTNtfSHSmsMtBakDTO extends DtoSupport
{	//ID
	private java.lang.String id;

	//"计费用户类型。 0＝对短消息接收方计费； 1＝对短消息发送方计费； 2＝对SP计费； 3＝表示本字段无效，对谁计费参见ChargeTermID或ChargeTermPseudo 字段。 "
	private java.lang.String feeUserType;

	//0成功，1失败
	private java.lang.String recvStatus;

	//已发送次数
	private java.lang.Long haveSentTimes;

	//短信服务码,由统一通知平台提供
	private java.lang.String sp;

	//接入密码
	private java.lang.String accessPassword;

	//短信接入号，上行的目的号码或下行的源号码
	private java.lang.String destTermid;

	//业务类别名称,自编，利于区分所请求的各类业务及问题排查
	private java.lang.String bizname;

	//用户手机号码
	private java.lang.String srcTermid;

	//外部短信网关产生的流水号
	private java.lang.String msgId;

	//接入账户
	private java.lang.String accessAccount;

	//短信营业厅群发任务流水号
	private java.lang.String planSeq;

	//交易标识，对于用户上行的短信，下行时需要带相同的LinkId
	private java.lang.String linkId;

	//最后一次发送时间
	private java.util.Date lastSentTime;

	//接口编码
	private java.lang.String encode;

	//任务名称,自编，利于区分所请求的每一次任务及问题排查
	private java.lang.String taskname;

	//接入系统IP
	private java.lang.String remoteip;

	//MT业务类型：1：MO引起的MT，2：短信营业厅群发的MT，3:10000号，4：计费，5：VC
	private java.lang.String mtServType;

	//发送状态，0成功，1失败
	private java.lang.String sendStatus;

	//0＝ASCII编码； 3＝短消息写卡操作； 4＝二进制短消息； 8＝UCS2编码； 15＝GB18030编码； 246（F6）＝(U)SIM相关消息； 其它保留。 对于文字短消息，要求MsgFormat＝15。对于回执消息，要求MsgFormat＝0。
	private java.lang.Long msgFormat;

	//资费代码，每条短消息费率，单位为“分”。
	private java.lang.String feeCode;

	//接收到用户短信时间
	private java.util.Date sendTime;

	//会话处理流水号，短信群发时需要用户回复的短信，在发送时需要创建会话
	private java.lang.String smsSession;

	//"对计费用户采取的收费类型。 对于MO消息或点对点短消息，该字段无效。对于MT消息，该字段用法如下： 00＝免费，此时FixedFee和FeeCode无效； 01＝按条计信息费，此时FeeCode表示每条费用，FixedFee无效； 02＝按包月收取信息费，此时FeeCode无效，FixedFee表示包月费用； 03＝按封顶收取信息费，若按条收费的费用总和达到或超过封顶费后，则按照封顶费用收取信息费；若按条收费的费用总和没有达到封顶费用，则按照每条费用总和收取信息费。FeeCode表示每条费用，FixedFee表示封顶费用。 其它保留。 "
	private java.lang.String feeType;

	//SEND_PRIORITY
	private java.lang.Long sendPriority;

	//失败发送次数
	private java.lang.Long failSentTimes;

	//业务类别编码
	private java.lang.String bizcode;

	//计费用户号码
	private java.lang.String feeUserTermid;

	//短消息的包月费/封顶费，单位为“分”。
	private java.lang.String fixedFee;

	//MAKE_TIME
	private java.util.Date makeTime;

	//"业务代码，用于固定网业务。 对于MO消息或点对点短消息，该字段无效； 对于MT消息，该字段表示业务代码，是该条短消息所属的业务类别，由数字、字母和符号组合而成。对于从WEB上发送的点对点短消息，要求业务代码为 “PC2P”，其它业务代码由SP自定义。 "
	private java.lang.String serviceId;

	//用户上行或下行的短信内容
	private java.lang.String msgContent;

	//RECV_TIME
	private java.util.Date recvTime;

	//接入系统编号
	private java.lang.String accessSystemDep;

	//下行短消息流水号（发起短信的用户或目标用户的手机号码+年月日时分秒毫秒时间戳，如1331234567820080808010101001）；在写下行时，在短信处理时获取发送短信数据时由HTTP服务产生，并发送给短信处理程序，主要用于写日志用
	private java.lang.String mtSeq;

	//REQUIRE_APPLY
	private java.lang.Long requireApply;

	public  AbstractTNtfSHSmsMtBakDTO()
	{
		
	}


	public  AbstractTNtfSHSmsMtBakDTO(java.lang.String id)
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
	 * get"计费用户类型。 0＝对短消息接收方计费； 1＝对短消息发送方计费； 2＝对SP计费； 3＝表示本字段无效，对谁计费参见ChargeTermID或ChargeTermPseudo 字段。 "
	 * 
	 * @return "计费用户类型。 0＝对短消息接收方计费； 1＝对短消息发送方计费； 2＝对SP计费； 3＝表示本字段无效，对谁计费参见ChargeTermID或ChargeTermPseudo 字段。 "
	*/
	public java.lang.String getFeeUserType()
	{
		return feeUserType;
	}

	/**
	 * set"计费用户类型。 0＝对短消息接收方计费； 1＝对短消息发送方计费； 2＝对SP计费； 3＝表示本字段无效，对谁计费参见ChargeTermID或ChargeTermPseudo 字段。 "
	 * 
	 * @param "计费用户类型。 0＝对短消息接收方计费； 1＝对短消息发送方计费； 2＝对SP计费； 3＝表示本字段无效，对谁计费参见ChargeTermID或ChargeTermPseudo 字段。 "
	 * @return void 
	*/
	public void setFeeUserType(java.lang.String feeUserType)
	{
		this.feeUserType=feeUserType;
	}

	/**
	 * get0成功，1失败
	 * 
	 * @return 0成功，1失败
	*/
	public java.lang.String getRecvStatus()
	{
		return recvStatus;
	}

	/**
	 * set0成功，1失败
	 * 
	 * @param 0成功，1失败
	 * @return void 
	*/
	public void setRecvStatus(java.lang.String recvStatus)
	{
		this.recvStatus=recvStatus;
	}

	/**
	 * get已发送次数
	 * 
	 * @return 已发送次数
	*/
	public java.lang.Long getHaveSentTimes()
	{
		return haveSentTimes;
	}

	/**
	 * set已发送次数
	 * 
	 * @param 已发送次数
	 * @return void 
	*/
	public void setHaveSentTimes(java.lang.Long haveSentTimes)
	{
		this.haveSentTimes=haveSentTimes;
	}

	/**
	 * get短信服务码,由统一通知平台提供
	 * 
	 * @return 短信服务码,由统一通知平台提供
	*/
	public java.lang.String getSp()
	{
		return sp;
	}

	/**
	 * set短信服务码,由统一通知平台提供
	 * 
	 * @param 短信服务码,由统一通知平台提供
	 * @return void 
	*/
	public void setSp(java.lang.String sp)
	{
		this.sp=sp;
	}

	/**
	 * get接入密码
	 * 
	 * @return 接入密码
	*/
	public java.lang.String getAccessPassword()
	{
		return accessPassword;
	}

	/**
	 * set接入密码
	 * 
	 * @param 接入密码
	 * @return void 
	*/
	public void setAccessPassword(java.lang.String accessPassword)
	{
		this.accessPassword=accessPassword;
	}

	/**
	 * get短信接入号，上行的目的号码或下行的源号码
	 * 
	 * @return 短信接入号，上行的目的号码或下行的源号码
	*/
	public java.lang.String getDestTermid()
	{
		return destTermid;
	}

	/**
	 * set短信接入号，上行的目的号码或下行的源号码
	 * 
	 * @param 短信接入号，上行的目的号码或下行的源号码
	 * @return void 
	*/
	public void setDestTermid(java.lang.String destTermid)
	{
		this.destTermid=destTermid;
	}

	/**
	 * get业务类别名称,自编，利于区分所请求的各类业务及问题排查
	 * 
	 * @return 业务类别名称,自编，利于区分所请求的各类业务及问题排查
	*/
	public java.lang.String getBizname()
	{
		return bizname;
	}

	/**
	 * set业务类别名称,自编，利于区分所请求的各类业务及问题排查
	 * 
	 * @param 业务类别名称,自编，利于区分所请求的各类业务及问题排查
	 * @return void 
	*/
	public void setBizname(java.lang.String bizname)
	{
		this.bizname=bizname;
	}

	/**
	 * get用户手机号码
	 * 
	 * @return 用户手机号码
	*/
	public java.lang.String getSrcTermid()
	{
		return srcTermid;
	}

	/**
	 * set用户手机号码
	 * 
	 * @param 用户手机号码
	 * @return void 
	*/
	public void setSrcTermid(java.lang.String srcTermid)
	{
		this.srcTermid=srcTermid;
	}

	/**
	 * get外部短信网关产生的流水号
	 * 
	 * @return 外部短信网关产生的流水号
	*/
	public java.lang.String getMsgId()
	{
		return msgId;
	}

	/**
	 * set外部短信网关产生的流水号
	 * 
	 * @param 外部短信网关产生的流水号
	 * @return void 
	*/
	public void setMsgId(java.lang.String msgId)
	{
		this.msgId=msgId;
	}

	/**
	 * get接入账户
	 * 
	 * @return 接入账户
	*/
	public java.lang.String getAccessAccount()
	{
		return accessAccount;
	}

	/**
	 * set接入账户
	 * 
	 * @param 接入账户
	 * @return void 
	*/
	public void setAccessAccount(java.lang.String accessAccount)
	{
		this.accessAccount=accessAccount;
	}

	/**
	 * get短信营业厅群发任务流水号
	 * 
	 * @return 短信营业厅群发任务流水号
	*/
	public java.lang.String getPlanSeq()
	{
		return planSeq;
	}

	/**
	 * set短信营业厅群发任务流水号
	 * 
	 * @param 短信营业厅群发任务流水号
	 * @return void 
	*/
	public void setPlanSeq(java.lang.String planSeq)
	{
		this.planSeq=planSeq;
	}

	/**
	 * get交易标识，对于用户上行的短信，下行时需要带相同的LinkId
	 * 
	 * @return 交易标识，对于用户上行的短信，下行时需要带相同的LinkId
	*/
	public java.lang.String getLinkId()
	{
		return linkId;
	}

	/**
	 * set交易标识，对于用户上行的短信，下行时需要带相同的LinkId
	 * 
	 * @param 交易标识，对于用户上行的短信，下行时需要带相同的LinkId
	 * @return void 
	*/
	public void setLinkId(java.lang.String linkId)
	{
		this.linkId=linkId;
	}

	/**
	 * get最后一次发送时间
	 * 
	 * @return 最后一次发送时间
	*/
	public java.util.Date getLastSentTime()
	{
		return lastSentTime;
	}

	/**
	 * set最后一次发送时间
	 * 
	 * @param 最后一次发送时间
	 * @return void 
	*/
	public void setLastSentTime(java.util.Date lastSentTime)
	{
		this.lastSentTime=lastSentTime;
	}

	/**
	 * get接口编码
	 * 
	 * @return 接口编码
	*/
	public java.lang.String getEncode()
	{
		return encode;
	}

	/**
	 * set接口编码
	 * 
	 * @param 接口编码
	 * @return void 
	*/
	public void setEncode(java.lang.String encode)
	{
		this.encode=encode;
	}

	/**
	 * get任务名称,自编，利于区分所请求的每一次任务及问题排查
	 * 
	 * @return 任务名称,自编，利于区分所请求的每一次任务及问题排查
	*/
	public java.lang.String getTaskname()
	{
		return taskname;
	}

	/**
	 * set任务名称,自编，利于区分所请求的每一次任务及问题排查
	 * 
	 * @param 任务名称,自编，利于区分所请求的每一次任务及问题排查
	 * @return void 
	*/
	public void setTaskname(java.lang.String taskname)
	{
		this.taskname=taskname;
	}

	/**
	 * get接入系统IP
	 * 
	 * @return 接入系统IP
	*/
	public java.lang.String getRemoteip()
	{
		return remoteip;
	}

	/**
	 * set接入系统IP
	 * 
	 * @param 接入系统IP
	 * @return void 
	*/
	public void setRemoteip(java.lang.String remoteip)
	{
		this.remoteip=remoteip;
	}

	/**
	 * getMT业务类型：1：MO引起的MT，2：短信营业厅群发的MT，3:10000号，4：计费，5：VC
	 * 
	 * @return MT业务类型：1：MO引起的MT，2：短信营业厅群发的MT，3:10000号，4：计费，5：VC
	*/
	public java.lang.String getMtServType()
	{
		return mtServType;
	}

	/**
	 * setMT业务类型：1：MO引起的MT，2：短信营业厅群发的MT，3:10000号，4：计费，5：VC
	 * 
	 * @param MT业务类型：1：MO引起的MT，2：短信营业厅群发的MT，3:10000号，4：计费，5：VC
	 * @return void 
	*/
	public void setMtServType(java.lang.String mtServType)
	{
		this.mtServType=mtServType;
	}

	/**
	 * get发送状态，0成功，1失败
	 * 
	 * @return 发送状态，0成功，1失败
	*/
	public java.lang.String getSendStatus()
	{
		return sendStatus;
	}

	/**
	 * set发送状态，0成功，1失败
	 * 
	 * @param 发送状态，0成功，1失败
	 * @return void 
	*/
	public void setSendStatus(java.lang.String sendStatus)
	{
		this.sendStatus=sendStatus;
	}

	/**
	 * get0＝ASCII编码； 3＝短消息写卡操作； 4＝二进制短消息； 8＝UCS2编码； 15＝GB18030编码； 246（F6）＝(U)SIM相关消息； 其它保留。 对于文字短消息，要求MsgFormat＝15。对于回执消息，要求MsgFormat＝0。
	 * 
	 * @return 0＝ASCII编码； 3＝短消息写卡操作； 4＝二进制短消息； 8＝UCS2编码； 15＝GB18030编码； 246（F6）＝(U)SIM相关消息； 其它保留。 对于文字短消息，要求MsgFormat＝15。对于回执消息，要求MsgFormat＝0。
	*/
	public java.lang.Long getMsgFormat()
	{
		return msgFormat;
	}

	/**
	 * set0＝ASCII编码； 3＝短消息写卡操作； 4＝二进制短消息； 8＝UCS2编码； 15＝GB18030编码； 246（F6）＝(U)SIM相关消息； 其它保留。 对于文字短消息，要求MsgFormat＝15。对于回执消息，要求MsgFormat＝0。
	 * 
	 * @param 0＝ASCII编码； 3＝短消息写卡操作； 4＝二进制短消息； 8＝UCS2编码； 15＝GB18030编码； 246（F6）＝(U)SIM相关消息； 其它保留。 对于文字短消息，要求MsgFormat＝15。对于回执消息，要求MsgFormat＝0。
	 * @return void 
	*/
	public void setMsgFormat(java.lang.Long msgFormat)
	{
		this.msgFormat=msgFormat;
	}

	/**
	 * get资费代码，每条短消息费率，单位为“分”。
	 * 
	 * @return 资费代码，每条短消息费率，单位为“分”。
	*/
	public java.lang.String getFeeCode()
	{
		return feeCode;
	}

	/**
	 * set资费代码，每条短消息费率，单位为“分”。
	 * 
	 * @param 资费代码，每条短消息费率，单位为“分”。
	 * @return void 
	*/
	public void setFeeCode(java.lang.String feeCode)
	{
		this.feeCode=feeCode;
	}

	/**
	 * get接收到用户短信时间
	 * 
	 * @return 接收到用户短信时间
	*/
	public java.util.Date getSendTime()
	{
		return sendTime;
	}

	/**
	 * set接收到用户短信时间
	 * 
	 * @param 接收到用户短信时间
	 * @return void 
	*/
	public void setSendTime(java.util.Date sendTime)
	{
		this.sendTime=sendTime;
	}

	/**
	 * get会话处理流水号，短信群发时需要用户回复的短信，在发送时需要创建会话
	 * 
	 * @return 会话处理流水号，短信群发时需要用户回复的短信，在发送时需要创建会话
	*/
	public java.lang.String getSmsSession()
	{
		return smsSession;
	}

	/**
	 * set会话处理流水号，短信群发时需要用户回复的短信，在发送时需要创建会话
	 * 
	 * @param 会话处理流水号，短信群发时需要用户回复的短信，在发送时需要创建会话
	 * @return void 
	*/
	public void setSmsSession(java.lang.String smsSession)
	{
		this.smsSession=smsSession;
	}

	/**
	 * get"对计费用户采取的收费类型。 对于MO消息或点对点短消息，该字段无效。对于MT消息，该字段用法如下： 00＝免费，此时FixedFee和FeeCode无效； 01＝按条计信息费，此时FeeCode表示每条费用，FixedFee无效； 02＝按包月收取信息费，此时FeeCode无效，FixedFee表示包月费用； 03＝按封顶收取信息费，若按条收费的费用总和达到或超过封顶费后，则按照封顶费用收取信息费；若按条收费的费用总和没有达到封顶费用，则按照每条费用总和收取信息费。FeeCode表示每条费用，FixedFee表示封顶费用。 其它保留。 "
	 * 
	 * @return "对计费用户采取的收费类型。 对于MO消息或点对点短消息，该字段无效。对于MT消息，该字段用法如下： 00＝免费，此时FixedFee和FeeCode无效； 01＝按条计信息费，此时FeeCode表示每条费用，FixedFee无效； 02＝按包月收取信息费，此时FeeCode无效，FixedFee表示包月费用； 03＝按封顶收取信息费，若按条收费的费用总和达到或超过封顶费后，则按照封顶费用收取信息费；若按条收费的费用总和没有达到封顶费用，则按照每条费用总和收取信息费。FeeCode表示每条费用，FixedFee表示封顶费用。 其它保留。 "
	*/
	public java.lang.String getFeeType()
	{
		return feeType;
	}

	/**
	 * set"对计费用户采取的收费类型。 对于MO消息或点对点短消息，该字段无效。对于MT消息，该字段用法如下： 00＝免费，此时FixedFee和FeeCode无效； 01＝按条计信息费，此时FeeCode表示每条费用，FixedFee无效； 02＝按包月收取信息费，此时FeeCode无效，FixedFee表示包月费用； 03＝按封顶收取信息费，若按条收费的费用总和达到或超过封顶费后，则按照封顶费用收取信息费；若按条收费的费用总和没有达到封顶费用，则按照每条费用总和收取信息费。FeeCode表示每条费用，FixedFee表示封顶费用。 其它保留。 "
	 * 
	 * @param "对计费用户采取的收费类型。 对于MO消息或点对点短消息，该字段无效。对于MT消息，该字段用法如下： 00＝免费，此时FixedFee和FeeCode无效； 01＝按条计信息费，此时FeeCode表示每条费用，FixedFee无效； 02＝按包月收取信息费，此时FeeCode无效，FixedFee表示包月费用； 03＝按封顶收取信息费，若按条收费的费用总和达到或超过封顶费后，则按照封顶费用收取信息费；若按条收费的费用总和没有达到封顶费用，则按照每条费用总和收取信息费。FeeCode表示每条费用，FixedFee表示封顶费用。 其它保留。 "
	 * @return void 
	*/
	public void setFeeType(java.lang.String feeType)
	{
		this.feeType=feeType;
	}

	/**
	 * getSEND_PRIORITY
	 * 
	 * @return SEND_PRIORITY
	*/
	public java.lang.Long getSendPriority()
	{
		return sendPriority;
	}

	/**
	 * setSEND_PRIORITY
	 * 
	 * @param SEND_PRIORITY
	 * @return void 
	*/
	public void setSendPriority(java.lang.Long sendPriority)
	{
		this.sendPriority=sendPriority;
	}

	/**
	 * get失败发送次数
	 * 
	 * @return 失败发送次数
	*/
	public java.lang.Long getFailSentTimes()
	{
		return failSentTimes;
	}

	/**
	 * set失败发送次数
	 * 
	 * @param 失败发送次数
	 * @return void 
	*/
	public void setFailSentTimes(java.lang.Long failSentTimes)
	{
		this.failSentTimes=failSentTimes;
	}

	/**
	 * get业务类别编码
	 * 
	 * @return 业务类别编码
	*/
	public java.lang.String getBizcode()
	{
		return bizcode;
	}

	/**
	 * set业务类别编码
	 * 
	 * @param 业务类别编码
	 * @return void 
	*/
	public void setBizcode(java.lang.String bizcode)
	{
		this.bizcode=bizcode;
	}

	/**
	 * get计费用户号码
	 * 
	 * @return 计费用户号码
	*/
	public java.lang.String getFeeUserTermid()
	{
		return feeUserTermid;
	}

	/**
	 * set计费用户号码
	 * 
	 * @param 计费用户号码
	 * @return void 
	*/
	public void setFeeUserTermid(java.lang.String feeUserTermid)
	{
		this.feeUserTermid=feeUserTermid;
	}

	/**
	 * get短消息的包月费/封顶费，单位为“分”。
	 * 
	 * @return 短消息的包月费/封顶费，单位为“分”。
	*/
	public java.lang.String getFixedFee()
	{
		return fixedFee;
	}

	/**
	 * set短消息的包月费/封顶费，单位为“分”。
	 * 
	 * @param 短消息的包月费/封顶费，单位为“分”。
	 * @return void 
	*/
	public void setFixedFee(java.lang.String fixedFee)
	{
		this.fixedFee=fixedFee;
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
	 * get"业务代码，用于固定网业务。 对于MO消息或点对点短消息，该字段无效； 对于MT消息，该字段表示业务代码，是该条短消息所属的业务类别，由数字、字母和符号组合而成。对于从WEB上发送的点对点短消息，要求业务代码为 “PC2P”，其它业务代码由SP自定义。 "
	 * 
	 * @return "业务代码，用于固定网业务。 对于MO消息或点对点短消息，该字段无效； 对于MT消息，该字段表示业务代码，是该条短消息所属的业务类别，由数字、字母和符号组合而成。对于从WEB上发送的点对点短消息，要求业务代码为 “PC2P”，其它业务代码由SP自定义。 "
	*/
	public java.lang.String getServiceId()
	{
		return serviceId;
	}

	/**
	 * set"业务代码，用于固定网业务。 对于MO消息或点对点短消息，该字段无效； 对于MT消息，该字段表示业务代码，是该条短消息所属的业务类别，由数字、字母和符号组合而成。对于从WEB上发送的点对点短消息，要求业务代码为 “PC2P”，其它业务代码由SP自定义。 "
	 * 
	 * @param "业务代码，用于固定网业务。 对于MO消息或点对点短消息，该字段无效； 对于MT消息，该字段表示业务代码，是该条短消息所属的业务类别，由数字、字母和符号组合而成。对于从WEB上发送的点对点短消息，要求业务代码为 “PC2P”，其它业务代码由SP自定义。 "
	 * @return void 
	*/
	public void setServiceId(java.lang.String serviceId)
	{
		this.serviceId=serviceId;
	}

	/**
	 * get用户上行或下行的短信内容
	 * 
	 * @return 用户上行或下行的短信内容
	*/
	public java.lang.String getMsgContent()
	{
		return msgContent;
	}

	/**
	 * set用户上行或下行的短信内容
	 * 
	 * @param 用户上行或下行的短信内容
	 * @return void 
	*/
	public void setMsgContent(java.lang.String msgContent)
	{
		this.msgContent=msgContent;
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
	 * get接入系统编号
	 * 
	 * @return 接入系统编号
	*/
	public java.lang.String getAccessSystemDep()
	{
		return accessSystemDep;
	}

	/**
	 * set接入系统编号
	 * 
	 * @param 接入系统编号
	 * @return void 
	*/
	public void setAccessSystemDep(java.lang.String accessSystemDep)
	{
		this.accessSystemDep=accessSystemDep;
	}

	/**
	 * get下行短消息流水号（发起短信的用户或目标用户的手机号码+年月日时分秒毫秒时间戳，如1331234567820080808010101001）；在写下行时，在短信处理时获取发送短信数据时由HTTP服务产生，并发送给短信处理程序，主要用于写日志用
	 * 
	 * @return 下行短消息流水号（发起短信的用户或目标用户的手机号码+年月日时分秒毫秒时间戳，如1331234567820080808010101001）；在写下行时，在短信处理时获取发送短信数据时由HTTP服务产生，并发送给短信处理程序，主要用于写日志用
	*/
	public java.lang.String getMtSeq()
	{
		return mtSeq;
	}

	/**
	 * set下行短消息流水号（发起短信的用户或目标用户的手机号码+年月日时分秒毫秒时间戳，如1331234567820080808010101001）；在写下行时，在短信处理时获取发送短信数据时由HTTP服务产生，并发送给短信处理程序，主要用于写日志用
	 * 
	 * @param 下行短消息流水号（发起短信的用户或目标用户的手机号码+年月日时分秒毫秒时间戳，如1331234567820080808010101001）；在写下行时，在短信处理时获取发送短信数据时由HTTP服务产生，并发送给短信处理程序，主要用于写日志用
	 * @return void 
	*/
	public void setMtSeq(java.lang.String mtSeq)
	{
		this.mtSeq=mtSeq;
	}

	/**
	 * getREQUIRE_APPLY
	 * 
	 * @return REQUIRE_APPLY
	*/
	public java.lang.Long getRequireApply()
	{
		return requireApply;
	}

	/**
	 * setREQUIRE_APPLY
	 * 
	 * @param REQUIRE_APPLY
	 * @return void 
	*/
	public void setRequireApply(java.lang.Long requireApply)
	{
		this.requireApply=requireApply;
	}

}