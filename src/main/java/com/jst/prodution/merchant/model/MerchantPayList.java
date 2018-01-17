package com.jst.prodution.merchant.model;

/**
 * 打款清单model
 * @author Administrator
 *
 */
public class MerchantPayList implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	private String listId;			//清单ID
	private String userId;			//商户ID
	private String merchantId;		//商务号
	private String payAccount;		//打款账户号
	private String currency;		//币种
	private String bankName;		//收款银行名称
	private String bankCode;		//收款银行编号
	private String receiveCardNo;	//收款人银行卡号
	private String receiveName;		//收款人姓名
	private String payment;			//支付方式
	private Integer payNum;			//打款成功次数
	private Integer amount;			//支付金额
	private String state;			//状态：0待打款 1 已打款 2打款失败 3已拒绝
	private String mark;			//备注
	private String creator;			//创建者
	private String createTime;		//创建时间
	private String payTime;			//打款时间
	private String updator;			//修改者
	private String updateTime;		//修改时间
	private Long amountSum;         //支付金额汇总
	
	public Long getAmountSum() {
		return amountSum;
	}
	public void setAmountSum(Long amountSum) {
		this.amountSum = amountSum;
	}
	public String getListId() {
		return listId;
	}
	public void setListId(String listId) {
		this.listId = listId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getPayAccount() {
		return payAccount;
	}
	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
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
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public Integer getPayNum() {
		return payNum;
	}
	public void setPayNum(Integer payNum) {
		this.payNum = payNum;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getUpdator() {
		return updator;
	}
	public void setUpdator(String updator) {
		this.updator = updator;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String update_time) {
		this.updateTime = update_time;
	}
	
}
