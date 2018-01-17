package com.jst.prodution.member.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 会员注册
 * @author liang
 *
 */
public class RegisterBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	private String userId;			//会员ID
	private String mobile;  		//手机号
	private String merchantNo;		//商户号
	private String certNo;			//商户法人身份证
	private String merchantName;	//商户名称
	private String password;    	// 密码 
	private String verifyNum; 		// 验证码
	private String regChannel; 		//模块渠道1.APP 2.WEB 3.OMS 4.API 5.JTC
	private String userType; 		// B.商户 C.个人
	private String email;			//邮箱 B商户注册
	private String terminalType;//终端类型（M：移动用户，P：PC用户）
	private String token;		//token值
	private String access;       //access值
	private String sign;      //加密验签
	private String systemType;      //登录系统来源
	
	private String thirdUserId;	//捷停车 - 用户id
	private String appId;		//捷停车 - appid
	private String appKey;		//捷停车 - appkey
	private String deviceId ;   //设备id
	private String deviceType;  //设备类型 1安卓，2ios
	private String appVersion ;   //版本号
    private String clientId ;
    private String UDID ;  //设备识别码
    private String LONGITUDE  ;   //经度
    private String LATITUDE ; //纬度
    private String activityId;
    

    private String amount ; // 签约金额 
    
    // 注册送优惠卷字段 
    private String activityJoinNo	; //String	C	活动参与流水,领取成功时有返回
	
	private String couponName ;  //劵名称
	
	private String couponType  ; //优惠类型(1折扣，2 金额)
	
	private Double couponRate; //优惠比例
	
	private Long singleAmt; //单笔优惠金额 ，分
	
	private Date useStartTime; //  使用开始时间
	
	private Date useEndTime; //使用结束时间
	
	private String isExistCoupon ;//是否存在优惠券 1：存在  0 不存在 。
    
	public String getUDID() {
        return UDID;
    }
    public void setUDID(String uDID) {
        UDID = uDID;
    }
    public String getLONGITUDE() {
        return LONGITUDE;
    }
    public void setLONGITUDE(String lONGITUDE) {
        LONGITUDE = lONGITUDE;
    }
    public String getLATITUDE() {
        return LATITUDE;
    }
    public void setLATITUDE(String lATITUDE) {
        LATITUDE = lATITUDE;
    }
    public String getAccess() {
        return access;
    }
    public void setAccess(String access) {
        this.access = access;
    }
    public String getSystemType() {
        return systemType;
    }
    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }
    public String getSign() {
        return sign;
    }
    public void setSign(String sign) {
        this.sign = sign;
    }
    public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getVerifyNum() {
		return verifyNum;
	}
	public void setVerifyNum(String verifyNum) {
		this.verifyNum = verifyNum;
	}
	public String getRegChannel() {
		return regChannel;
	}
	public void setRegChannel(String regChannel) {
		this.regChannel = regChannel;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTerminalType() {
		return terminalType;
	}
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getThirdUserId() {
		return thirdUserId;
	}
	public void setThirdUserId(String thirdUserId) {
		this.thirdUserId = thirdUserId;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppKey() {
		return appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
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
	
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	@Override
	public String toString() {
		return "RegisterBean [userId=" + userId + ", mobile=" + mobile + ", merchantNo=" + merchantNo + ", certNo="
				+ certNo + ", merchantName=" + merchantName + ", password=" + password + ", verifyNum=" + verifyNum
				+ ", regChannel=" + regChannel + ", userType=" + userType + ", email=" + email + ", terminalType="
				+ terminalType + ", token=" + token + ", access=" + access + ", sign=" + sign + ", systemType="
				+ systemType + ", thirdUserId=" + thirdUserId + ", appId=" + appId + ", appKey=" + appKey
				+ ", deviceId=" + deviceId + ", deviceType=" + deviceType + ", appVersion=" + appVersion + ", clientId="
				+ clientId + ", UDID=" + UDID + ", LONGITUDE=" + LONGITUDE + ", LATITUDE=" + LATITUDE
				+ ", activityJoinNo=" + activityJoinNo + ", couponName=" + couponName + ", couponType=" + couponType
				+ ", couponRate=" + couponRate + ", singleAmt=" + singleAmt + ", useStartTime=" + useStartTime
				+ ", useEndTime=" + useEndTime + ", isExistCoupon=" + isExistCoupon + "]";
	}
	
    
}
