package com.jst.prodution.account.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class AcctOpenBean extends BaseBean {
	
	
	

	
	//账户等级
	public static final String ACCT_LEVEL_0 = "0";//临时户
	public static final String ACCT_LEVEL_1 = "1";//一类账户
	public static final String ACCT_LEVEL_2 = "2";//二类账户
	public static final String ACCT_LEVEL_3 = "3";//三类账户
	
	private static final long serialVersionUID = 1L;
	
	private String acctId;//账户标识	必输
	private String userId;//会员标识	必输
	private String userName;//会员姓名		必输
	private String sourceFrom;//业务来源(1-APP，2-OMS)	必输
	private String acctType;//账户类型 	(01基本户)	必输
	private String acctLevel;//账户等级(1-一类账户，2-二类账户，3-三类账户)	必输
	private String remark;//备注 		可输
	private String  operUser;//操作用户	可输
	public String getAcctId() {
		return acctId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId == null ? null : acctId.trim();
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom == null ? null : sourceFrom.trim();
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType == null ? null : acctType.trim();
	}
	public String getAcctLevel() {
		return acctLevel;
	}
	public void setAcctLevel(String acctLevel) {
		this.acctLevel = acctLevel == null ? null : acctLevel.trim();
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}
	public String getOperUser() {
		return operUser;
	}
	public void setOperUser(String operUser) {
		this.operUser = operUser == null ? null : operUser.trim();
	}
}
