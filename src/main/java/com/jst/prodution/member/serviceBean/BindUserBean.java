/*
* Copyright (c) 2015-2018 SHENZHEN JST SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/

package com.jst.prodution.member.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.app.controller.bean  
 * @ClassName: BindUserBean 
 * @Description: 绑定bean
 *
 * @author:  
 * @date: 2017年7月26日 下午2:40:22 
 * @version V1.0 
 */
public class BindUserBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String  openId;  // openId
	private String mobile ;  //手机号码
	private String appId ;
	private String token;		//token值
	private String access;       //access值
	private String appKey;
	private String tradeKey;
	private String userId;  // 用户编号
	
	 // 绑定公众号送优惠卷字段 
    private String activityJoinNo	; //String	C	活动参与流水,领取成功时有返回
	
	private String couponName ;  //劵名称
	
	private String couponType  ; //优惠类型(1折扣，2 金额)
	
	private Double couponRate; //优惠比例
	
	private Long singleAmt; //单笔优惠金额 ，分
	
	private Date useStartTime; //  使用开始时间
	
	private Date useEndTime; //使用结束时间
	
	private String isExistCoupon ;//是否存在优惠券 1：存在  0 不存在 。
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public String getTradeKey() {
		return tradeKey;
	}
	public void setTradeKey(String tradeKey) {
		this.tradeKey = tradeKey;
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
	public String getIsExistCoupon() {
		return isExistCoupon;
	}
	public void setIsExistCoupon(String isExistCoupon) {
		this.isExistCoupon = isExistCoupon;
	}
	@Override
	public String toString() {
		return "BindUserBean [openId=" + openId + ", mobile=" + mobile + ", appId=" + appId + ", token=" + token
				+ ", access=" + access + ", appKey=" + appKey + ", tradeKey=" + tradeKey + ", userId=" + userId
				+ ", activityJoinNo=" + activityJoinNo + ", couponName=" + couponName + ", couponType=" + couponType
				+ ", couponRate=" + couponRate + ", singleAmt=" + singleAmt + ", useStartTime=" + useStartTime
				+ ", useEndTime=" + useEndTime + ", isExistCoupon=" + isExistCoupon + ", getResCode()=" + getResCode()
				+ ", getResType()=" + getResType() + ", getMsgContent()=" + getMsgContent() + "]";
	}
	
	
}