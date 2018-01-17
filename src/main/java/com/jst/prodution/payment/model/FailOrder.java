package com.jst.prodution.payment.model;

import java.util.Date;

/**
 * 付款失败清单
 * @author Administrator
 *
 */
public class FailOrder implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String orderNo;					//付款订单ID
	private String tranOrderNo;				//交易核心流水号
	private String laneOrderNo;				//通道处理流水号
	private String merchantId;				//商户号
	private String jstMerchantId;			//捷顺通商户号
	private String userId;					//会员ID
	private String userName;				//会员名称
	private String userType;				//会员类型
	private String payBankName;				//付款方银行名称
	private String payBankCode;				//付款方银行编号（简称）
	private String payAccount;				//付款账号
	private Long amount;					//提现金额（分）
	private String payType;					//出款类型：01个人提现 02商户提现 03理财回款 04信贷放款 05人工出款 06 收入出款  07其他出款
	private String receiveBankName;			//收款银行名称
	private String receiveBankCode;			//收款银行编码（简称）
	private String receiveAccount;			//收款银行卡号
	private String bankCreditNo;			//银行处理流水
	private String bankErrorMsg;			//银行失败原因
	private String payLane;					//付款通道
	private String state;					//状态：0未处理 1已处理
	private String creator;					//订单创建者
	private Date createTime;				//创建时间
	private String createTimeStr;
	   private String usePay;               //付款用途
	private Long amountSum;//提现金额（分）汇总


	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getJstMerchantId() {
		return jstMerchantId;
	}

	public void setJstMerchantId(String jstMerchantId) {
		this.jstMerchantId = jstMerchantId;
	}

	/**
     * @return the usePay
     */
    public String getUsePay() {
        return usePay;
    }
    /**
     * @param usePay the usePay to set
     */
    public void setUsePay(String usePay) {
        this.usePay = usePay;
    }
    public Long getAmountSum() {
		return amountSum;
	}
	public void setAmountSum(Long amountSum) {
		this.amountSum = amountSum;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getTranOrderNo() {
		return tranOrderNo;
	}
	public void setTranOrderNo(String tranOrderNo) {
		this.tranOrderNo = tranOrderNo;
	}
	public String getLaneOrderNo() {
		return laneOrderNo;
	}
	public void setLaneOrderNo(String laneOrderNo) {
		this.laneOrderNo = laneOrderNo;
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
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getPayBankName() {
		return payBankName;
	}
	public void setPayBankName(String payBankName) {
		this.payBankName = payBankName;
	}
	public String getPayBankCode() {
		return payBankCode;
	}
	public void setPayBankCode(String payBankCode) {
		this.payBankCode = payBankCode;
	}
	public String getPayAccount() {
		return payAccount;
	}
	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getReceiveBankName() {
		return receiveBankName;
	}
	public void setReceiveBankName(String receiveBankName) {
		this.receiveBankName = receiveBankName;
	}
	public String getReceiveBankCode() {
		return receiveBankCode;
	}
	public void setReceiveBankCode(String receiveBankCode) {
		this.receiveBankCode = receiveBankCode;
	}
	public String getReceiveAccount() {
		return receiveAccount;
	}
	public void setReceiveAccount(String receiveAccount) {
		this.receiveAccount = receiveAccount;
	}
	public String getBankCreditNo() {
		return bankCreditNo;
	}
	public void setBankCreditNo(String bankCreditNo) {
		this.bankCreditNo = bankCreditNo;
	}
	public String getBankErrorMsg() {
		return bankErrorMsg;
	}
	public void setBankErrorMsg(String bankErrorMsg) {
		this.bankErrorMsg = bankErrorMsg;
	}
	public String getPayLane() {
		return payLane;
	}
	public void setPayLane(String payLane) {
		this.payLane = payLane;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreateTimeStr() {
		return createTimeStr;
	}
	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}
}
