package com.jst.prodution.tran.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.paycore.serviceBean.PayCorePayOrderBean;

public class TranCoreRechargeRegistBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String userId; // 用户标识 必输
	private String bankCardNo; // 银行账号 可输 充值使用的银行卡号
	private String rechargeWay; // 充值方式(03-微信，04-支付宝，05-捷易付(银行卡))
	private String payType;//支付方式（APP，NATIVE,JSAPI）
	private Long tranAmount; // 充值金额 必输
	private String sourceFrom; // 业务来源 必输（1-APP，2-OMS）
	private String operUser; // 操作人 可输
	private String remark; // 备注 可输
	private String mobile; // 手机号
	private String busNo; // 订单号
	private String rkey;//短信跟踪码 
	private String verifyCode;//短信验证码
	private Integer cutDate;// 日切
	private String pageUrl;//充值完成通知前端页面url
	private String marketingId;//活动ID
	private String discountType;//折扣类型(1-金额,2-比率)
	private String discountValue;//折扣值(如:20或20%)
	private String promoteType;//优惠类型(1-满减,2-满赠)
	private Long acctAmount;//到账金额(单位:分)
	private Long payAmount;//实际支付金额(单位:分)
	private Long promoteAmount;//优惠金额(单位:分)
	private String promoteMchId;//优惠承担商户ID
	private String activityJoinNo;//活动参与流水
	
	private PayCorePayOrderBean payCorePayOrderBean;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getRechargeWay() {
		return rechargeWay;
	}

	public void setRechargeWay(String rechargeWay) {
		this.rechargeWay = rechargeWay;
	}

	public Long getTranAmount() {
		return tranAmount;
	}

	public void setTranAmount(Long tranAmount) {
		this.tranAmount = tranAmount;
	}

	public String getOperUser() {
		return operUser;
	}

	public void setOperUser(String operUser) {
		this.operUser = operUser;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	
	public String getRkey() {
		return rkey;
	}

	public void setRkey(String rkey) {
		this.rkey = rkey;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public Integer getCutDate() {
		return cutDate;
	}

	public void setCutDate(Integer cutDate) {
		this.cutDate = cutDate;
	}

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
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

	public PayCorePayOrderBean getPayCorePayOrderBean() {
		return payCorePayOrderBean;
	}

	public void setPayCorePayOrderBean(PayCorePayOrderBean payCorePayOrderBean) {
		this.payCorePayOrderBean = payCorePayOrderBean;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}
}
