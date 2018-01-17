package com.jst.prodution.tran.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class TranCorePayingApplyBean extends BaseBean {
	/**
	 * 代付申请Bean
	 */
	private static final long serialVersionUID = 1L;
	//输入
	private String busType;// 交易类型(01-个人提现,02-商户提现,03-理财回款,04-信贷放款,05-人工出款,06-收入出款,07-打款验证 ,08-营销打款,99-其他出款)   必输
	private String sourceFrom;// 业务来源(1-APP,2-OMS)                                   必输
	private String currency;// 币别 1-CNY                                                必输
//	private String payAcct;//付款账号                                                                                                        必输
	private String payTo;// 付款去向(1-付款至银行卡,2-付款至余额)                           必输
	private String externalOrder;// 外部订单号                                                                                        必输
	private Long tranAmount;// 订单金额                                                                                                      必输
	private String merchantId;// 付款商户号                                                                                               必输
	private String thirdUserId;// 第三方用户ID                                           可输
	private String userId;//收款userID                                                   可输
	private String payUserId;//收款userID                                                   可输
	private String userType;//收款用户类型 个人（C） 商户（B）                                                   		必输
	
	private String orderDesc;//订单描述                                                   		可输
	private String userName;//收款用户名称                                                                                                   可输
	private String merchantName;//付款商户名称                                                                                                   可输
	private String appId;// APPID                                                       可输         
	private String reciveAcct;  // 收款账号（付款至银行卡时必输）                                                                 可输
	private String revName;// 收款用户姓名												 可输
	private String idCard;// 用户身份证号码（对私代付）                                                                          可输
	private String userMobile;// 用户手机号码												可输
	private String bankNo;		//收款银行卡所号                                                                 			可输
	private String openBankName;//收款账户开户机构名称										可输
	private String reciveBankName;//收款银行名称                                                                                   可输
	private String revBankCode;//收款银行编号                                                                                          可输
	private String notifyUrl;//后台通知URL                                                 可输
	
	//输出
    private String createTime;// 新增时间
	private String updateTime;// 最后更新时间
	private Long tranFee;// 手续费
	private String busNo;// 订单号
	private Date tranTime;// 交易时间
	private String resultMsg;// 处理结果描述
	private String state;// 订单状态
//	private String payNo;       //付款中心付款流水号
//	private String payBankNo;   //付款银行卡号(备付金账号)
//	private String frozenSno;//冻结流水
//  private Long frozenAmount;//冻结金额
//	private String merchUserId;//B商户会员ID
//	private String merchantName;// 商户名称
	
	public String getThirdUserId() {
		return thirdUserId;
	}
	public String getUserType() {
		return userType;
	}
	
	public String getOrderDesc() {
		return orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getPayUserId() {
		return payUserId;
	}
	public void setPayUserId(String payUserId) {
		this.payUserId = payUserId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getRevName() {
		return revName;
	}
	public void setRevName(String revName) {
		this.revName = revName;
	}
	public void setThirdUserId(String thirdUserId) {
		this.thirdUserId = thirdUserId;
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
	public String getBankNo() {
		return bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	public String getOpenBankName() {
		return openBankName;
	}
	public void setOpenBankName(String openBankName) {
		this.openBankName = openBankName;
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
	public String getPayTo() {
		return payTo;
	}
	public void setPayTo(String payTo) {
		this.payTo = payTo;
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
	
}
