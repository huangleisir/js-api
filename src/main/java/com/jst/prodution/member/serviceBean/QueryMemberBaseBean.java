package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 查询会员基本信息
 * @author 吴安辉
 *
 */
public class QueryMemberBaseBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String userId;						//会员ID（主键）	
	private String userType;					//会员类型：B.商户 C.个人
	private String status;						//会员状态：1、正常 2、禁用 3、冻结 4、注销
	private String merchantNo;					//商户号
	private String mobile;						//手机号
	private String email;						//邮箱号码
	private String userName;					//会员名字
	private String cerno;						//证件号码
	private String verificationLevel;			//认证等级：E.企业等级 N.未认证 W.弱实名 M.中实名 S.强实名
	private String certification;				//认证方式：1.快捷认证 2.打款认证 3.关联认证 4.其他认证
	private String userLevel;					//用户等级：主要用户营销（预留备用）1、普通用户 2、星级用户 3、VIP等级等
	private String riskTolerance;				//风险承受能力: 1初级 2中级 3高级
	private String regChannel;                     //渠道类型 JTC ZHTC
	private String appId;                       //渠道id
	
	
	/**
     * @return the appId
     */
    public String getAppId() {
        return appId;
    }
    /**
     * @param appId the appId to set
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }
    public String getRegChannel() {
        return regChannel;
    }
    public void setRegChannel(String regChannel) {
        this.regChannel = regChannel;
    }
    public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	public String getCerno() {
		return cerno;
	}
	public void setCerno(String cerno) {
		this.cerno = cerno;
	}
	public String getVerificationLevel() {
		return verificationLevel;
	}
	public void setVerificationLevel(String verificationLevel) {
		this.verificationLevel = verificationLevel;
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

}
