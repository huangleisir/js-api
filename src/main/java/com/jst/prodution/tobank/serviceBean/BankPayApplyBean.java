package com.jst.prodution.tobank.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class BankPayApplyBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String tranOrderNo;				//交易核心订单号
	private String payOrderNo;				//付款中心订单号
	private String userId;					//收款会员号
	private String userName;				//收款会员名称
	private String userType;				//收款会员类型:C个人  B商户
	private String receiveBankName;			//收款账户银行名称
	private String receiveBankCode;			//收款账户银行编号（ABC）
	private String receiveOpenBankName;		//收款账户开户机构名称
	private String clearBankNo;			//清算行
	private String receiveBankNo;			//收款账户银行联行号
	private String receiveCardNo;			//收款账户号
	private String receiveName;				//收款人姓名
	private String payBankName;				//付款银行名称
	private String payBankCode;				//付款银行编号
	private String payCardNo;				//付款账号
	private String payType;					//付款类型：01-个人提现 02-商户提现 03-理财回款 04-信贷放款 05-人工出款  06-收入出款 07-其他出款
	private Long amount;					//付款金额（分）
	private String mark;					//备注
	private Integer cutDate;				//日切日期
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
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public Integer getCutDate() {
		return cutDate;
	}
	public void setCutDate(Integer cutDate) {
		this.cutDate = cutDate;
	}
	
}
