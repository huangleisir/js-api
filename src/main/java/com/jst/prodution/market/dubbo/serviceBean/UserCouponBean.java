package com.jst.prodution.market.dubbo.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class UserCouponBean extends BaseBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id; // 记录ID
	private String activityId; //活动id，同请求
	private String ruleId; // 规则ID
	private String userId; //用户编号
	private String couponName; //优惠券名称
	private String activityName; //活动名称
	private String singleAmt; //优惠金额
	private String amtLimit; //使用优惠券的订单金额限制
	private String actStartTime; //活动开始时间
	private String actEndTime; //活动结束时间
	private String ruleStartTime; //券有效期开始时间
	private String ruleEndTime; //券有效期结束时间
	private String couponType; //优惠类型(1折扣，2 金额)
	private String status; //使用状态(0已领取，1已使用，2已过期，3锁定)
	private int isDeleted; //'是否逻辑删除0 不删除 、1 删除',
	private String receiveNum; //已领取优惠劵数量
	private String dayReceiveNum; //当天已领取优惠劵数量
	private String useNum; //已使用优惠劵数量
	private String dayUseNum; //当天使用优惠劵数量
	private String userMaxJoinTime; //用户参与次数限制
	private String userDayMaxJoinTime; //用户每日参与次数限制
	private String channelNo; //投放渠道号
	private String payChannelNo; //投放支付渠道号
	/*private String jyf; //投放支付渠道号
	private String wechat; //投放支付渠道号
	private String alipay; //投放支付渠道号
*/	private List<UserCouponBean> couponList;
	private int operateType; //0 ：列表；1 默认选择单张可用券
	private String orderAmt; //订单金额
	private String singleMarkId; //单品标识id：双方约定
	private String useDescri; //优惠券使用说明
	private String goodsMark; //优惠券使用说明
	
	
	public String getGoodsMark() {
		return goodsMark;
	}
	public void setGoodsMark(String goodsMark) {
		this.goodsMark = goodsMark;
	}
	public String getUseDescri() {
		return useDescri;
	}
	public void setUseDescri(String useDescri) {
		this.useDescri = useDescri;
	}
	public String getSingleMarkId() {
		return singleMarkId;
	}
	public void setSingleMarkId(String singleMarkId) {
		this.singleMarkId = singleMarkId;
	}
	public String getOrderAmt() {
		return orderAmt;
	}
	public void setOrderAmt(String orderAmt) {
		this.orderAmt = orderAmt;
	}
	public String getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}
	public String getPayChannelNo() {
		return payChannelNo;
	}
	public void setPayChannelNo(String payChannelNo) {
		this.payChannelNo = payChannelNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRuleId() {
		return ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getRuleStartTime() {
		return ruleStartTime;
	}
	public void setRuleStartTime(String ruleStartTime) {
		this.ruleStartTime = ruleStartTime;
	}
	public String getRuleEndTime() {
		return ruleEndTime;
	}
	public void setRuleEndTime(String ruleEndTime) {
		this.ruleEndTime = ruleEndTime;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getUserMaxJoinTime() {
		return userMaxJoinTime;
	}
	public void setUserMaxJoinTime(String userMaxJoinTime) {
		this.userMaxJoinTime = userMaxJoinTime;
	}
	public String getUserDayMaxJoinTime() {
		return userDayMaxJoinTime;
	}
	public void setUserDayMaxJoinTime(String userDayMaxJoinTime) {
		this.userDayMaxJoinTime = userDayMaxJoinTime;
	}
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public String getSingleAmt() {
		return singleAmt;
	}
	public void setSingleAmt(String singleAmt) {
		this.singleAmt = singleAmt;
	}
	public String getAmtLimit() {
		return amtLimit;
	}
	public void setAmtLimit(String amtLimit) {
		this.amtLimit = amtLimit;
	}
	public String getActStartTime() {
		return actStartTime;
	}
	public void setActStartTime(String actStartTime) {
		this.actStartTime = actStartTime;
	}
	public String getActEndTime() {
		return actEndTime;
	}
	public void setActEndTime(String actEndTime) {
		this.actEndTime = actEndTime;
	}
	public String getCouponType() {
		return couponType;
	}
	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReceiveNum() {
		return receiveNum;
	}
	public void setReceiveNum(String receiveNum) {
		this.receiveNum = receiveNum;
	}
	public String getDayReceiveNum() {
		return dayReceiveNum;
	}
	public void setDayReceiveNum(String dayReceiveNum) {
		this.dayReceiveNum = dayReceiveNum;
	}
	public String getUseNum() {
		return useNum;
	}
	public void setUseNum(String useNum) {
		this.useNum = useNum;
	}
	public String getDayUseNum() {
		return dayUseNum;
	}
	public void setDayUseNum(String dayUseNum) {
		this.dayUseNum = dayUseNum;
	}
	public List<UserCouponBean> getCouponList() {
		return couponList;
	}
	public void setCouponList(List<UserCouponBean> couponList) {
		this.couponList = couponList;
	}
	public int getOperateType() {
		return operateType;
	}
	public void setOperateType(int operateType) {
		this.operateType = operateType;
	}
}
