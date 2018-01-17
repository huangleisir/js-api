package com.jst.prodution.member.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
 *  代扣签约\解约bean
 * @author hewen
 *
 */
public class UserAgreementBean extends BaseBean{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	private String id;
	/**
	 * 主协议号（用户id）
	 */
	private String masterAgreement;
	
	/**
	 * 子协议号 
	 */
	private String 	subAgreement ;
	
	/**
	 * 状态  Y：签约  ，N：解约 
	 */
	private String status;
	
	/**
	 * 商户签约信息通知url
	 */
	private String  notifyUrl;
	/**
	 * 00:处理成功, 01:处理失败 
	 */
	private String flag;
	
	/**
	 * 处理失败描述 
	 */
	private String failDesc;
	
	/**
	 * appID
	 */
	private String appId;
	
	/**
	 * 商户号
	 */
	private String merchantId;
	
	/**
	 * 渠道号  
	 */
	private String channelNo;
	
	/**
	 * 免密额度 (分 )
	 */
	private Long position;
	
	 //第一次签约送优惠券 
	 private String activityJoinNo	; //String	C	活动参与流水,领取成功时有返回
		
		private String couponName ;  //劵名称
		
		private String couponType  ; //优惠类型(1折扣，2 金额)
		
		private Double couponRate; //优惠比例
		
		private Long singleAmt; //单笔优惠金额 ，分
		
		private Date useStartTime; //  使用开始时间
		
		private Date useEndTime; //使用结束时间
		
		private String isExistCoupon ;//是否存在优惠券 1：存在  0 不存在 。	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMasterAgreement() {
		return masterAgreement;
	}

	public void setMasterAgreement(String masterAgreement) {
		this.masterAgreement = masterAgreement;
	}

	public String getSubAgreement() {
		return subAgreement;
	}

	public void setSubAgreement(String subAgreement) {
		this.subAgreement = subAgreement;
	}

	
	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getFailDesc() {
		return failDesc;
	}

	public void setFailDesc(String failDesc) {
		this.failDesc = failDesc;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getChannelNo() {
		return channelNo;
	}

	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}

	public Long getPosition() {
		return position;
	}

	public void setPosition(Long position) {
		this.position = position;
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
	
	
}
