package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
 * 小贷查询会员返回bean  
 *
 */
public class SelUserInfoBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String userId; 					 //会员ID
	private String userName;				//会员名称
	private String mobile;  				//手机号码
	private String status; 					//1、正常 2、禁用
	private String userType ;               // 会员类型 
	private String merchantNo ;             //商户号 
	private String email;             		//邮箱              
	private String cerType;						//证件类型：01身份证
	private String cerno;						//证件号码
    private String isBindCard ;	            // 1 表示已经绑定借记卡，0 表示没绑定借记卡 
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getIsBindCard() {
		return isBindCard;
	}
	public void setIsBindCard(String isBindCard) {
		this.isBindCard = isBindCard;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	
    
}
