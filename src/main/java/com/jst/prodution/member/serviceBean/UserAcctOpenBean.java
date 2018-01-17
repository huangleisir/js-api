package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 会员账户开户Bean
 * @author Administrator
 *
 */
public class UserAcctOpenBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String userId; 			//会员标识	必输
	private String userType;		//会员类型:B C
	private String userName;		//会员姓名		必输
	private String sourceFrom;		//业务来源(1-APP，2-OMS)	必输
	private String acctLevel;		//账户等级(1-一类账户，2-二类账户，3-三类账户)	必输
	private String remark;			//备注 		可输
	private String operUser;		//操作用户	可输
	
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}
	public String getAcctLevel() {
		return acctLevel;
	}
	public void setAcctLevel(String acctLevel) {
		this.acctLevel = acctLevel;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOperUser() {
		return operUser;
	}
	public void setOperUser(String operUser) {
		this.operUser = operUser;
	}

}
