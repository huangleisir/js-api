package com.jst.prodution.member.model;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
* @ClassName: 
* @Description: 会员实体
* @author liaozr 
* @date 2016-07-23 下午3:35:36 
*
 */

public class UserBase extends BaseBean{

	// Fields
	private static final long serialVersionUID = 1L;
	private String userId;						//会员ID（主键）	
	private String userType;					//会员类型：B.商户 C.个人
	private String status;						//会员状态：1、正常 2、禁用 3、冻结 4、注销
	private String merchantNo;					//商户号
	private String mobile;						//手机号
	private String email;						//邮箱号码
	private String userName;					//会员名字
	private String cerType;						//证件类型：01身份证
	private String cerno;						//证件号码
	private String cerVerify;					//公民身份证核查结果：Y、认证成功 N、认证失败
	private String regChannel;					//注册渠道（APP 、WEB 、.OMS 、API  JTC 2.JSH）
	private String verificationLevel;			//认证等级：E.企业等级 N.未认证 W.弱实名 M.中实名 S.强实名
	private String certification;				//认证方式：1.快捷认证 2.打款认证 3.关联认证 4.其他认证
	private String userLevel;					//用户等级：主要用户营销（预留备用）1、普通用户 2、星级用户 3、VIP等级等
	private String riskTolerance;				//风险承受能力: 1初级 2中级 3高级
	private String picWay;						//用户头像保存地址
	private String createTime;					//创建时间
	private String modifyTime;					//变更时间
	private String isPaypwd;  					//是否设置支付密码:0没有设置，1已经设置
	private String thirdUserId;					//捷停车用户id
	private String merchantSignNo ;             //商户签约号 
	private String appId;                       // appId
	

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
	public String getCerType() {
		return cerType;
	}
	public void setCerType(String cerType) {
		this.cerType = cerType;
	}
	public String getCerno() {
		return cerno;
	}
	public void setCerno(String cerno) {
		this.cerno = cerno;
	}
	public String getCerVerify() {
		return cerVerify;
	}
	public void setCerVerify(String cerVerify) {
		this.cerVerify = cerVerify;
	}
	public String getRegChannel() {
		return regChannel;
	}
	public void setRegChannel(String regChannel) {
		this.regChannel = regChannel;
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
	public String getPicWay() {
		return picWay;
	}
	public void setPicWay(String picWay) {
		this.picWay = picWay;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getIsPaypwd() {
		return isPaypwd;
	}
	public void setIsPaypwd(String isPaypwd) {
		this.isPaypwd = isPaypwd;
	}
	public String getThirdUserId() {
		return thirdUserId;
	}
	public void setThirdUserId(String thirdUserId) {
		this.thirdUserId = thirdUserId;
	}
	public String getMerchantSignNo() {
		return merchantSignNo;
	}
	public void setMerchantSignNo(String merchantSignNo) {
		this.merchantSignNo = merchantSignNo;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
   
}