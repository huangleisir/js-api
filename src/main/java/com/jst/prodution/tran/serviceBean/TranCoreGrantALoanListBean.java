package com.jst.prodution.tran.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreGrantALoanListBean extends BaseBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String busNo;// 订单号
	private String busType;// 交易类型(01-个人提现,02-商户提现,03-理财回款,04-信贷放款,05-人工出款,06-收入出款,07-其他)
	private Long tranFee;// 手续费
	private String sourceFrom;// 业务来源(1-APP,2-OMS)
	private Date tranTime;// 交易时间
	private String merchantId;// 商户号
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
	private String state;// 订单状态
	private String reciveAcct;// 收款账号
	private String resultMsg;// 处理结果描述
	private String frozenSno;//冻结流水
    private Long frozenAmount;//冻结金额
    private String reciveBankName;//收款银行名称
    private String revBankCode;//收款银行编号
    private Long tranAmountSum;// 交易金额汇总
	private Long frozenAmountSum;//冻结金额汇总
    private Long tranFeeSum;// 手续费汇总

	
    private List<TranCoreGrantALoanBean> tranCoreGrantALoanList;
    
    
	public Long getTranAmountSum() {
		return tranAmountSum;
	}
	public void setTranAmountSum(Long tranAmountSum) {
		this.tranAmountSum = tranAmountSum;
	}
	public Long getFrozenAmountSum() {
		return frozenAmountSum;
	}
	public void setFrozenAmountSum(Long frozenAmountSum) {
		this.frozenAmountSum = frozenAmountSum;
	}
	public Long getTranFeeSum() {
		return tranFeeSum;
	}
	public void setTranFeeSum(Long tranFeeSum) {
		this.tranFeeSum = tranFeeSum;
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
	public List<TranCoreGrantALoanBean> getTranCoreGrantALoanList() {
		return tranCoreGrantALoanList;
	}
	public void setTranCoreGrantALoanList(List<TranCoreGrantALoanBean> tranCoreGrantALoanList) {
		this.tranCoreGrantALoanList = tranCoreGrantALoanList;
	}
	
}
