package com.jst.prodution.trade.model;


/**
 * 交易核心充值订单基类
 * @author 吴安辉
 *
 */
public class RechargeOrder {

	private String tradeNo;				//充值订单流水号
	private String systemCode;			//业务系统编号
	private String state;				//充值状态 00成功 10 处理中 99失败
	private String type;				//充值类型 1线上  2线下
	private Long amout;					//充值金额
	private Integer fee;				//充值手续费
	private String userId;				//充值用户编号
	private String userName;			//充值用户名称
	private String userCode;			//充值用户账户
	private String userIp;				//充值用户IP
	private String callType;			//订单调帐方式 1补单 2销单 空表示未调账
	private String creator;				//创建者
	private String createTime;			//创建时间
	private String updator;				//修改者
	private String updateTime;			//修改时间
	private String note;				//描述
	
	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getSystemCode() {
		return systemCode;
	}
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getAmout() {
		return amout;
	}
	public void setAmout(Long amout) {
		this.amout = amout;
	}
	public Integer getFee() {
		return fee;
	}
	public void setFee(Integer fee) {
		this.fee = fee;
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
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserIp() {
		return userIp;
	}
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	public String getCallType() {
		return callType;
	}
	public void setCallType(String callType) {
		this.callType = callType;
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
