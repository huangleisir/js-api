package com.jst.prodution.tran.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreRechargeOrderBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String busNo;// 交易流水号
	private String payLaneNo;//支付流水号
	private String state; // 状态
	private Integer tranAmout;// 金额
	private Integer tranFee;// 手续费
    private String bankAcctNo;// 银行卡号
    private String bankAcctNoS;// 银行卡号后4位
    private String sourceFrom;// 业务来源
	private String acctId;// 账户号
	private String userId;// 用户号
	private String userName;// 用户名称
	private String callType;// 订单调账方式 1-补单，2-销单,0-正常
	private String remark;// 备注
	private String createUser;// 创建人
	private String updateUser;// 最后更新人
	private String createTime;// 新增时间
	private String updateTime;// 最后更新时间
	private String rechargeWay;// 充值方式：03-微信，04-支付宝，05-捷易付(银行卡)
	private Long acctAmount;//到账金额(单位:分)
	private Long payAmount;//实际支付金额(单位:分)
	
	private Integer tranDate;//交易日期
	private String acctType;//账户类型
	private String marketingId;//营销ID
	private String discountType;//折扣类型(1-金额,2-比率)
	private String discountValue;//折扣值(如:20或20%)
	private String promoteType;//优惠类型(1-满减,2-满赠)
	private Long promoteAmount;//优惠金额(单位:分)
	private String promoteMchId;//优惠承担商户ID
	private String activityJoinNo;//活动参与流水
	
    private String payType;	//充值方式
    private String isRefund;//是否已退款0：已退款,1：未退款
    private Long refundAmount;//退款金额
	

	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getIsRefund() {
		return isRefund;
	}
	public void setIsRefund(String isRefund) {
		this.isRefund = isRefund;
	}
	public Long getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getBankAcctNo() {
		return bankAcctNo;
	}
	public void setBankAcctNo(String bankAcctNo) {
		this.bankAcctNo = bankAcctNo;
	}
	public String getBankAcctNoS() {
		return bankAcctNoS;
	}
	public void setBankAcctNoS(String bankAcctNoS) {
		this.bankAcctNoS = bankAcctNoS;
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getPayLaneNo() {
		return payLaneNo;
	}
	public void setPayLaneNo(String payLaneNo) {
		this.payLaneNo = payLaneNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getTranAmout() {
		return tranAmout;
	}
	public void setTranAmout(Integer tranAmout) {
		this.tranAmout = tranAmout;
	}
	public Integer getTranFee() {
		return tranFee;
	}
	public void setTranFee(Integer tranFee) {
		this.tranFee = tranFee;
	}
	public String getAcctId() {
		return acctId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
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
	public String getCallType() {
		return callType;
	}
	public void setCallType(String callType) {
		this.callType = callType;
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
	public String getRechargeWay() {
		return rechargeWay;
	}
	public void setRechargeWay(String rechargeWay) {
		this.rechargeWay = rechargeWay;
	}
	public Integer getTranDate() {
		return tranDate;
	}
	public void setTranDate(Integer tranDate) {
		this.tranDate = tranDate;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	public String getMarketingId() {
		return marketingId;
	}
	public void setMarketingId(String marketingId) {
		this.marketingId = marketingId;
	}
	public String getDiscountType() {
		return discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public String getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(String discountValue) {
		this.discountValue = discountValue;
	}
	public String getPromoteType() {
		return promoteType;
	}
	public void setPromoteType(String promoteType) {
		this.promoteType = promoteType;
	}
	public Long getPromoteAmount() {
		return promoteAmount;
	}
	public void setPromoteAmount(Long promoteAmount) {
		this.promoteAmount = promoteAmount;
	}
	public String getPromoteMchId() {
		return promoteMchId;
	}
	public void setPromoteMchId(String promoteMchId) {
		this.promoteMchId = promoteMchId;
	}
	public String getActivityJoinNo() {
		return activityJoinNo;
	}
	public void setActivityJoinNo(String activityJoinNo) {
		this.activityJoinNo = activityJoinNo;
	}
	public Long getAcctAmount() {
		return acctAmount;
	}
	public void setAcctAmount(Long acctAmount) {
		this.acctAmount = acctAmount;
	}
	public Long getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}
}
