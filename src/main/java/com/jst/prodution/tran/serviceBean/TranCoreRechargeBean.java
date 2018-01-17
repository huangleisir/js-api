package com.jst.prodution.tran.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreRechargeBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String userId; // 用户标识 必输
	private String bankCardNo; // 银行账号 必输 充值使用的银行卡号
	private Long tranAmount; // 充值金额 必输 充值的金额
	private String sourceFrom; // 业务来源 必输（1-APP，2-OMS）
	private String operUser; // 操作人 可输
	private String remark; // 备注 可输
	private String mobile; // 手机号
	private String smsCode; // 短信动态码
	private String busNo; // 订单号（交易产生的订单号） 输出
	private String smsTraceCode;// 短信跟踪编号
	private String subChannelCode; // 子通道
	private Integer cutDate;// 日切
	private Integer tranDate;// 交易日期
	private String orderState;// 订单状态
	private String rechargeWay;//充值方式
	private String payNo;//支付流水号
	private String busType;//订单类型1-支付，2-退款，3-代扣 ，4-扫码支付，5-主动还款
	/*
	 * 营销活动相关
	 */
    private String marketingId; //活动ID
    private String activityJoinNo;//活动流水号

	public String getMarketingId() {
        return marketingId;
    }

    public void setMarketingId(String marketingId) {
        this.marketingId = marketingId;
    }

    public String getActivityJoinNo() {
        return activityJoinNo;
    }

    public void setActivityJoinNo(String activityJoinNo) {
        this.activityJoinNo = activityJoinNo;
    }

    public String getSubChannelCode() {
		return subChannelCode;
	}

	public void setSubChannelCode(String subChannelCode) {
		this.subChannelCode = subChannelCode;
	}

	public String getSmsTraceCode() {
		return smsTraceCode;
	}

	public void setSmsTraceCode(String smsTraceCode) {
		this.smsTraceCode = smsTraceCode;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSmsCode() {
		return smsCode;
	}

	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
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

	public Integer getCutDate() {
		return cutDate;
	}

	public void setCutDate(Integer cutDate) {
		this.cutDate = cutDate;
	}

	public Integer getTranDate() {
		return tranDate;
	}

	public void setTranDate(Integer tranDate) {
		this.tranDate = tranDate;
	}

	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public String getRechargeWay() {
		return rechargeWay;
	}

	public void setRechargeWay(String rechargeWay) {
		this.rechargeWay = rechargeWay;
	}

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

}
