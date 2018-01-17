package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 会员登录
 * @author liang
 *
 */
public class LoginBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String mobile;  	//手机号（登录账号）
	private String password;   	//用户密码
	private String userId;		//用户ID
	private String status;		//状态（B商户为1时，表示首次登录，需要强制修改密码）
	private String userType;	//用户类型
	private String passwordType;		//密码类型：1,登录密码  2.支付密码 3.手势密码
	private String merchantNo;	//商户号
	private String modifyTime;	//修改时间
	private String terminalType;//终端类型（M：移动用户，P：PC用户）  Duboo调用传JTC JSH ZHTC三种选其中之一发送
	private String token;		//token值
	private String access;       //access值
	private String salt;       //加密盐值
	private String sign;      //加密验签
	private String systemType;      //登录系统来源
	private String regChannel;         //模块渠道1.APP 2.WEB 3.OMS 4.API 5.JTC 
	private String createTime; // 创建时间
	private String isNeedPwd; // 是否需要密码 Y需要， N 不需要
	
	private String thirdUserId; //捷停车 - 用户id
	private String appId;//捷停车appid
	private String appKey;       //捷停车appkey
	private String deviceId ;   //设备id
	private String deviceType;  //设备类型 1安卓，2ios
    private String appVersion ;   //版本号
    private String clientId ;
    private String UDID ;  //设备识别码
    private String LONGITUDE  ;   //经度
    private String LATITUDE ; //纬度
    private String merchantId; //商户id 
    private String notifyUrl;// 签约通知url 
    private String amount ; // 签约金额 
    private String merchantName ; // 商户名称 
    
    private String email;        //用户邮箱
    private String userName;     //用户姓名
    private String cerType;      //证件类型(01身份证)
    private String certNo;       //证件号  敏感信息，暂不给前端
    private String veriLevel;    //认证等级(E.企业等级 N.未认证 W.弱实名 M.中实名 S.强实名)
    private String certification;//认证方式(0未认证 1.快捷认证 2.打款认证 3.关联认证 4.其他认证)
    private String userLevel;    //用户等级：主要用户营销（预留备用）1、普通用户 2、星级用户 3、VIP等级等
    private String riskTolerance;//风险承受能力: 1初级 2中级 3高级
    
    private String tradeOpenid ;   //公众号openid，用于公众号支付
    
    private String isNewUser ; // 是否新用户  1： 新用户   0 ：老用户 
    
	public String getPasswordType() {
		return passwordType;
	}
	public void setPasswordType(String passwordType) {
		this.passwordType = passwordType;
	}
	public String getIsNeedPwd() {
        return isNeedPwd;
    }
    public void setIsNeedPwd(String isNeedPwd) {
        this.isNeedPwd = isNeedPwd;
    }
    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getRegChannel() {
        return regChannel;
    }
    public void setRegChannel(String regChannel) {
        this.regChannel = regChannel;
    }
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
    public String getSalt() {
        return salt;
    }
    public void setSalt(String salt) {
        this.salt = salt;
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
    public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getTerminalType() {
		return terminalType;
	}
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}
    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }
    public String getThirdUserId() {
        return thirdUserId;
    }
    public void setThirdUserId(String thirdUserId) {
        this.thirdUserId = thirdUserId;
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
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getCerType() {
        return cerType;
    }
    public void setCerType(String cerType) {
        this.cerType = cerType;
    }
    public String getVeriLevel() {
        return veriLevel;
    }
    public void setVeriLevel(String veriLevel) {
        this.veriLevel = veriLevel;
    }
    public String getCertification() {
        return certification;
    }
    public void setCertification(String certification) {
        this.certification = certification;
    }
    public String getUserLevel() {
        return userLevel;
    }
    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }
    public String getRiskTolerance() {
        return riskTolerance;
    }
    public void setRiskTolerance(String riskTolerance) {
        this.riskTolerance = riskTolerance;
    }
    public String getCertNo() {
        return certNo;
    }
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }
	public String getTradeOpenid() {
		return tradeOpenid;
	}
	public void setTradeOpenid(String tradeOpenid) {
		this.tradeOpenid = tradeOpenid;
	}
	public String getIsNewUser() {
		return isNewUser;
	}
	public void setIsNewUser(String isNewUser) {
		this.isNewUser = isNewUser;
	}
	
}
