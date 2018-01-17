package com.jst.prodution.trade.model;

/**
 * 交易核心订单与账户交互跟踪流水基类
 * @author 吴安辉
 *
 */
public class AccountOrder {

	private String orderId;				//流水号（主键）
	private String tradeNo;				//订单流水号
	private String exeIndex;			//执行序列号（调用账户前置执行序列）
	private String orderType;			//订单类型 1-充值 2-提现 3-转账
	private String payNo;				//支付订单流水号（账户前置返回）
	private String backCode;			//账户前置返回码
	private String backContent;			//账户前置返回消息
	private String payOrderType;		//支付订单标志 1-正常，2-冲正，3-补单
	private String relationPayNo;		//冲正关联支付流水号（账户前置返回流水号）
	private String state;				//状态：00成功 10待处理 20处理中 40超时 99失败
	private String accountType;			//对账状态 00未对账 01对账中 02平账 03 不平账 04无需对账
	private String creator;				//创建者
	private String createTime;			//创建时间
	private String updator;				//修改者
	private String updateTime;			//修改时间
	private String note;				//描述
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getExeIndex() {
		return exeIndex;
	}
	public void setExeIndex(String exeIndex) {
		this.exeIndex = exeIndex;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getBackCode() {
		return backCode;
	}
	public void setBackCode(String backCode) {
		this.backCode = backCode;
	}
	public String getBackContent() {
		return backContent;
	}
	public void setBackContent(String backContent) {
		this.backContent = backContent;
	}
	public String getPayOrderType() {
		return payOrderType;
	}
	public void setPayOrderType(String payOrderType) {
		this.payOrderType = payOrderType;
	}
	public String getRelationPayNo() {
		return relationPayNo;
	}
	public void setRelationPayNo(String relationPayNo) {
		this.relationPayNo = relationPayNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
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
	public String getUpdator() {
		return updator;
	}
	public void setUpdator(String updator) {
		this.updator = updator;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
