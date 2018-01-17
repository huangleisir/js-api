package com.jst.prodution.tran.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreGrantALoanBean extends BaseBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String busNo;// 订单号
	private String state;// 订单状态
	private String busType;// 交易类型(01-个人提现,02-商户提现,03-理财回款,04-信贷放款,05-人工出款,06-收入出款,07-其他)
	private Long tranFee;// 手续费
	private String sourceFrom;// 业务来源(1-APP,2-OMS)
	private Date tranTime;// 交易时间
	private String merchantId;// 商户号
	private String merchUserId;//B商户会员ID
	private String merchantName;// 商户名称
	private String appId;// APPID
	private String userId;// 用户ID
	private String userName;// 用户姓名
	private String idCard;// 用户身份证号码
	private String userMobile;// 用户手机号码
	private String externalOrder;// 外部订单号
	private Long tranAmount;// 订单金额
	private String notifyUrl;//后台通知URL
	private String currency;// 币别
	private String payAcct;//付款账号
	private String payTo;// 付款去向(1-付款至银行卡,2-付款至余额)
	private String payNo;//付款中心付款流水号
	private String payUserId;//付款账户会员号(B会员)
	private String payUserName;//付款账户姓名
	private String payBankNo;//付款银行卡号(备付金账号)
	private String reciveAcct;// 收款账号
	private String resultMsg;// 处理结果描述
	private String frozenSno;//冻结流水
    private Long frozenAmount;//冻结金额
    private String reciveBankName;//收款银行名称
    private String revBankCode;//收款银行编号
    private String createTime;// 新增时间
	private String updateTime;// 最后更新时间
    private String payTime;   //付款成功时间

	//新增createUser、updateUser
	private String createUser;//创建人
	private String updateUser;//更新人
    
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public Long getTranFee() {
		return tranFee;
	}
	public void setTranFee(Long tranFee) {
		this.tranFee = tranFee;
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}
	public Date getTranTime() {
		return tranTime;
	}
	public void setTranTime(Date tranTime) {
		this.tranTime = tranTime;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchUserId() {
		return merchUserId;
	}
	public void setMerchUserId(String merchUserId) {
		this.merchUserId = merchUserId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getExternalOrder() {
		return externalOrder;
	}
	public void setExternalOrder(String externalOrder) {
		this.externalOrder = externalOrder;
	}
	public Long getTranAmount() {
		return tranAmount;
	}
	public void setTranAmount(Long tranAmount) {
		this.tranAmount = tranAmount;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getPayAcct() {
		return payAcct;
	}
	public void setPayAcct(String payAcct) {
		this.payAcct = payAcct;
	}
	public String getPayTo() {
		return payTo;
	}
	public void setPayTo(String payTo) {
		this.payTo = payTo;
	}
	
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getPayUserId() {
		return payUserId;
	}
	public void setPayUserId(String payUserId) {
		this.payUserId = payUserId;
	}
	public String getPayUserName() {
		return payUserName;
	}
	public void setPayUserName(String payUserName) {
		this.payUserName = payUserName;
	}
	public String getPayBankNo() {
		return payBankNo;
	}
	public void setPayBankNo(String payBankNo) {
		this.payBankNo = payBankNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getReciveAcct() {
		return reciveAcct;
	}
	public void setReciveAcct(String reciveAcct) {
		this.reciveAcct = reciveAcct;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getFrozenSno() {
		return frozenSno;
	}
	public void setFrozenSno(String frozenSno) {
		this.frozenSno = frozenSno;
	}
	public Long getFrozenAmount() {
		return frozenAmount;
	}
	public void setFrozenAmount(Long frozenAmount) {
		this.frozenAmount = frozenAmount;
	}
	public String getReciveBankName() {
		return reciveBankName;
	}
	public void setReciveBankName(String reciveBankName) {
		this.reciveBankName = reciveBankName;
	}
	public String getRevBankCode() {
		return revBankCode;
	}
	public void setRevBankCode(String revBankCode) {
		this.revBankCode = revBankCode;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	
}
