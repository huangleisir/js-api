package com.jst.prodution.payment.model;

import java.util.Date;

public class PayOrder implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String payOrderId;				//付款订单ID
	private String tranOrderNo;				//交易核心流水号
	private String laneOrderNo;				//通道处理流水号
	private Long amount;					//提现金额（分）
	private String payType;					//出款类型：01个人提现 02商户提现 03理财回款 04信贷放款 05人工出款 06 收入出款  07其他出款
	private String bankName;				//收款银行名称
	private String bankCode;				//收款银行编码（简称）
	private String cardNo;					//收款银行卡号
	private String openBankName;			//收款方开户行机构
	private String receiveName;				//接收人姓名
	private Integer cutDate;				//日切日期
	private String bankNo;					//银行卡行所号
	private String merchantId;				//商户号
	private String jstMerchantId;			//捷顺通商户号
	private String userId;					//会员ID
	private String userName;				//会员名称
	private String userType;				//会员类型
	private Date payTime;					//付款时间
	private Date receiptTime;				//银行回执时间
	private String bankBusNo;				//银行处理流水号
	private String reviewState;				//审核状态：01一审 02二审 03不审
	private String payStyle;				//付款方式：01系统 02人工
	private String processState;			//处理状态：01待审核 02待付款 03付款失败 04付款成功 05一审通过 06一审不通过  07二审不通过 08付款中
	private String tranOrderState;			//交易核心订单状态：01成功 02失败
	private String payLane;					//付款通道
	private String payBankName;				//付款方银行名称
	private String payBankCode;				//付款方银行编号（简称）
	private String payAccount;				//付款账号
	private String mark;					//备注
	private String creator;					//订单创建者
	private Date createTime;				//创建时间
	private String updator;					//修改人
	private Date updateTime;				//修改时间
	private String payTimeStr;
	private String receiptTimeStr;
	private String createTimeStr;
	private String updateTimeStr;
	
	private Long amountSum;                     // 付款金额汇总
	private String usePay;               //付款用途
	
	
	/**
     * @return the merchantId
     */
    public String getMerchantId() {
        return merchantId;
    }
    /**
     * @param merchantId the merchantId to set
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
    /**
     * @return the jstMerchantId
     */
    public String getJstMerchantId() {
        return jstMerchantId;
    }
    /**
     * @param jstMerchantId the jstMerchantId to set
     */
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
	public String getPayOrderId() {
		return payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
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
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getOpenBankName() {
		return openBankName;
	}
	public void setOpenBankName(String openBankName) {
		this.openBankName = openBankName;
	}
	public String getReceiveName() {
		return receiveName;
	}
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}
	public Integer getCutDate() {
		return cutDate;
	}
	public void setCutDate(Integer cutDate) {
		this.cutDate = cutDate;
	}
	public String getBankNo() {
		return bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
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
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getReceiptTime() {
		return receiptTime;
	}
	public void setReceiptTime(Date receiptTime) {
		this.receiptTime = receiptTime;
	}
	public String getBankBusNo() {
		return bankBusNo;
	}
	public void setBankBusNo(String bankBusNo) {
		this.bankBusNo = bankBusNo;
	}
	public String getReviewState() {
		return reviewState;
	}
	public void setReviewState(String reviewState) {
		this.reviewState = reviewState;
	}
	public String getPayStyle() {
		return payStyle;
	}
	public void setPayStyle(String payStyle) {
		this.payStyle = payStyle;
	}
	public String getProcessState() {
		return processState;
	}
	public void setProcessState(String processState) {
		this.processState = processState;
	}
	public String getTranOrderState() {
		return tranOrderState;
	}
	public void setTranOrderState(String tranOrderState) {
		this.tranOrderState = tranOrderState;
	}
	public String getPayLane() {
		return payLane;
	}
	public void setPayLane(String payLane) {
		this.payLane = payLane;
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
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
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
	public String getUpdator() {
		return updator;
	}
	public void setUpdator(String updator) {
		this.updator = updator;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getPayTimeStr() {
		return payTimeStr;
	}
	public void setPayTimeStr(String payTimeStr) {
		this.payTimeStr = payTimeStr;
	}
	public String getReceiptTimeStr() {
		return receiptTimeStr;
	}
	public void setReceiptTimeStr(String receiptTimeStr) {
		this.receiptTimeStr = receiptTimeStr;
	}
	public String getCreateTimeStr() {
		return createTimeStr;
	}
	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}
	public String getUpdateTimeStr() {
		return updateTimeStr;
	}
	public void setUpdateTimeStr(String updateTimeStr) {
		this.updateTimeStr = updateTimeStr;
	}
}
