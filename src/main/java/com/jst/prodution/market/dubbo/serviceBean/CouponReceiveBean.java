package com.jst.prodution.market.dubbo.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;


public class CouponReceiveBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	private String userId;		//会员ID
	private String appId;		// appid
	private String activityId	; //String	Y	活动id，同请求
	
	//出参
	private String activityJoinNo	; //String	C	活动参与流水,领取成功时有返回
	
	private String couponName ;  //劵名称
	
	private String couponType  ; //优惠类型(1折扣，2 金额)
	
	private Double couponRate; //优惠比例
	
	private Long singleAmt; //单笔优惠金额 ，分
	
	private Date useStartTime; //  使用开始时间
	
	private Date useEndTime; //使用结束时间
	
    private String goodsMark ;  //全品标识
	
	private String singleMarkId  ; //单品标识Id
	
	private String useDescri  ; //优惠券使用说明
	
	private String refundType  ; //退款类型
	/**
	 * 投放类型
	 * 1.直接投放2页面领用 3， 注册送 ,4.关注公众号，5，首次开通免密支付
	 */
	private String distriType;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityJoinNo() {
		return activityJoinNo;
	}

	public void setActivityJoinNo(String activityJoinNo) {
		this.activityJoinNo = activityJoinNo;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponType() {
		return couponType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public Double getCouponRate() {
		return couponRate;
	}

	public void setCouponRate(Double couponRate) {
		this.couponRate = couponRate;
	}

	public Long getSingleAmt() {
		return singleAmt;
	}

	public void setSingleAmt(Long singleAmt) {
		this.singleAmt = singleAmt;
	}

	public Date getUseStartTime() {
		return useStartTime;
	}

	public void setUseStartTime(Date useStartTime) {
		this.useStartTime = useStartTime;
	}

	public Date getUseEndTime() {
		return useEndTime;
	}

	public void setUseEndTime(Date useEndTime) {
		this.useEndTime = useEndTime;
	}

	public String getDistriType() {
		return distriType;
	}

	public void setDistriType(String distriType) {
		this.distriType = distriType;
	}

	@Override
	public String toString() {
		return "CouponReceiveBean [userId=" + userId + ", appId=" + appId + ", activityId=" + activityId
				+ ", activityJoinNo=" + activityJoinNo + ", couponName=" + couponName + ", couponType=" + couponType
				+ ", couponRate=" + couponRate + ", singleAmt=" + singleAmt + ", useStartTime=" + useStartTime
				+ ", useEndTime=" + useEndTime + ", goodsMark=" + goodsMark + ", singleMarkId=" + singleMarkId
				+ ", useDescri=" + useDescri + ", distriType=" + distriType + "]";
	}

	public String getGoodsMark() {
		return goodsMark;
	}

	public void setGoodsMark(String goodsMark) {
		this.goodsMark = goodsMark;
	}

	public String getSingleMarkId() {
		return singleMarkId;
	}

	public void setSingleMarkId(String singleMarkId) {
		this.singleMarkId = singleMarkId;
	}

	public String getUseDescri() {
		return useDescri;
	}

	public void setUseDescri(String useDescri) {
		this.useDescri = useDescri;
	}

	public String getRefundType() {
		return refundType;
	}

	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}
	
	

}
