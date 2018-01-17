/**
 * author:汤广海
 * 2017年6月26日
 * 上午10:52:30
 */
package com.jst.prodution.lanefront.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class LaneFrontRefundBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String busNo;//交易流水号(必输)
	private String origBusNo;//原交易流水号(必输) 
	private String laneNo;//通道流水号(外部跟踪号)
	private Double amount;//退款金额(必输,单位:分)
	private String txnType;//交易类型(非输)PUR-支付,RFD-退款
	private String refNumber;//系统参考号
	private String transTime;//交易时间
	private String storableCardNo;//银行卡前6后4位
	private String authorizationCode;
	private String origRefNumber;//原交易系统参考号
	private String sourceFrom;
	private String userId;
	private String userName;
	private String orderState;//退款状态0-退款成功,1-处理中,2-失败
	private String channelCode;//渠道编码
	private String remark;
	private String createUser;
	private String updateUser;
	private Date createTime;
	private Date updateTime;
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getOrigBusNo() {
		return origBusNo;
	}
	public void setOrigBusNo(String origBusNo) {
		this.origBusNo = origBusNo;
	}
	public String getLaneNo() {
		return laneNo;
	}
	public void setLaneNo(String laneNo) {
		this.laneNo = laneNo;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	public String getRefNumber() {
		return refNumber;
	}
	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}
	public String getTransTime() {
		return transTime;
	}
	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}
	public String getStorableCardNo() {
		return storableCardNo;
	}
	public void setStorableCardNo(String storableCardNo) {
		this.storableCardNo = storableCardNo;
	}
	public String getAuthorizationCode() {
		return authorizationCode;
	}
	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}
	public String getOrigRefNumber() {
		return origRefNumber;
	}
	public void setOrigRefNumber(String origRefNumber) {
		this.origRefNumber = origRefNumber;
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
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
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	public String getChannelCode() {
		return channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
