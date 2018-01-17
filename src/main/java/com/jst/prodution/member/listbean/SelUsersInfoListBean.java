package com.jst.prodution.member.listbean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 会员状态查询
 * @author liang
 *
 */
public class SelUsersInfoListBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String userId; 					 //会员ID
	private String mobile;  				//用户登录 名
	private String userType;  				//1.冻结 2.禁用
	private String status; 					//1、正常 2、禁用
	private String acctId;             		//账户号                      
	private String acctName;           		//账户名称       
	private String certType;          		//证件类型                  
	private String certNo;          		//证件号码              
	private String isPaypwd;  				//0,没有设置，1，已经设置
	private String userName;				//会员名称
	private String certification; 			//认证方式：1.快捷认证 2.打款认证 3.关联认证 4.其他认证
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
	public String getAcctId() {
		return acctId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getCertType() {
		return certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getIsPaypwd() {
		return isPaypwd;
	}
	public void setIsPaypwd(String isPaypwd) {
		this.isPaypwd = isPaypwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
}
