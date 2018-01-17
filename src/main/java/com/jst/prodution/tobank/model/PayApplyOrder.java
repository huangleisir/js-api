package com.jst.prodution.tobank.model;

import java.util.Date;

public class PayApplyOrder implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String orderNo;					//订单号
	private String tranOrderNo;				//交易核心订单号
	private String payOrderNo;				//付款中心订单号
	private String userId;					//收款会员号
	private String userName;				//收款会员名称
	private String userType;				//收款会员类型:C个人  B商户
	private String receiveBankName;			//收款账户银行名称
	private String receiveBankCode;			//收款账户银行编号（ABC）
	private String receiveOpenBankName;		//收款账户开户机构名称
	private String receiveBankNo;			//收款账户银行联行号

	private String clearBankNo;			//清算行
	private String receiveCardNo;			//收款账户号
	private String receiveName;				//收款人姓名
	private Integer cutDate;				//日切日期
	private String payCompanyNo;			//付款单位号
	private String payBankName;				//付款银行名称
	private String payBankCode;				//付款银行编号
	private String payCardNo;				//付款账号
	private String payType;					//付款类型：01-个人提现 02-商户提现 03-理财回款 04-信贷放款 05-人工出款  06-收入出款 07-其他出款
	private String payStyle;				//付款方式：01行内、02行外
	private Long amount;					//付款金额（分）
	private String bankCreditNo;			//银行划款流水号
	private String bankErrorCode;			//银行划款失败原因码
	private String bankErrorMsg;			//银行划款失败原因
	private String bankMark;				//银行备注信息
	private String payState;				//划款状态：00未划款 01划款中  02划款成功 03划款失败
	private Date createTime;				//订单生成时间
	private Date payTime;					//划款时间（系统时间）
	private Date checkTime;					//对账时间
	private String checkFlag;				//对账标识（Y已对账 N 未对账）
	private Integer sendNum;				//发送次数（转账交易）
	private Integer queryNum;				//查询次数（转账查询）
	private String mark;					//备注
	private Date updateTime;				//更新时间
	private String createTimeStr;			//订单生成时间（字符类型）
	private String payTimeStr;				//划款时间（字符类型）
	private String checkTimeStr;			//对账时间（字符类型）
	private String updateTimeStr;			//更新时间（字符类型）
	private Long amountSum;					//金额汇总
	   private String usePay;               //付款用途
	   
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
	public String getPayOrderNo() {
		return payOrderNo;
	}
	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
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
	public String getReceiveOpenBankName() {
		return receiveOpenBankName;
	}
	public void setReceiveOpenBankName(String receiveOpenBankName) {
		this.receiveOpenBankName = receiveOpenBankName;
	}
	public String getClearBankNo() {
		return clearBankNo;
	}

	public void setClearBankNo(String clearBankNo) {
		this.clearBankNo = clearBankNo;
	}

	public String getReceiveBankNo() {
		return receiveBankNo;
	}
	public void setReceiveBankNo(String receiveBankNo) {
		this.receiveBankNo = receiveBankNo;
	}
	public String getReceiveCardNo() {
		return receiveCardNo;
	}
	public void setReceiveCardNo(String receiveCardNo) {
		this.receiveCardNo = receiveCardNo;
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
	public String getPayCompanyNo() {
		return payCompanyNo;
	}
	public void setPayCompanyNo(String payCompanyNo) {
		this.payCompanyNo = payCompanyNo;
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
	public String getPayCardNo() {
		return payCardNo;
	}
	public void setPayCardNo(String payCardNo) {
		this.payCardNo = payCardNo;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getPayStyle() {
		return payStyle;
	}
	public void setPayStyle(String payStyle) {
		this.payStyle = payStyle;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getBankCreditNo() {
		return bankCreditNo;
	}
	public void setBankCreditNo(String bankCreditNo) {
		this.bankCreditNo = bankCreditNo;
	}
	public String getBankErrorCode() {
		return bankErrorCode;
	}
	public void setBankErrorCode(String bankErrorCode) {
		this.bankErrorCode = bankErrorCode;
	}
	public String getBankErrorMsg() {
		return bankErrorMsg;
	}
	public void setBankErrorMsg(String bankErrorMsg) {
		this.bankErrorMsg = bankErrorMsg;
	}
	public String getBankMark() {
		return bankMark;
	}
	public void setBankMark(String bankMark) {
		this.bankMark = bankMark;
	}
	public String getPayState() {
		return payState;
	}
	public void setPayState(String payState) {
		this.payState = payState;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}
	public String getCheckFlag() {
		return checkFlag;
	}
	public void setCheckFlag(String checkFlag) {
		this.checkFlag = checkFlag;
	}
	public Integer getSendNum() {
		return sendNum;
	}
	public void setSendNum(Integer sendNum) {
		this.sendNum = sendNum;
	}
	public Integer getQueryNum() {
		return queryNum;
	}
	public void setQueryNum(Integer queryNum) {
		this.queryNum = queryNum;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getCreateTimeStr() {
		return createTimeStr;
	}
	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}
	public String getPayTimeStr() {
		return payTimeStr;
	}
	public void setPayTimeStr(String payTimeStr) {
		this.payTimeStr = payTimeStr;
	}
	public String getCheckTimeStr() {
		return checkTimeStr;
	}
	public void setCheckTimeStr(String checkTimeStr) {
		this.checkTimeStr = checkTimeStr;
	}
	public String getUpdateTimeStr() {
		return updateTimeStr;
	}
	public void setUpdateTimeStr(String updateTimeStr) {
		this.updateTimeStr = updateTimeStr;
	}
}
