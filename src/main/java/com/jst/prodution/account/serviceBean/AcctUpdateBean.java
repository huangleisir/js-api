package com.jst.prodution.account.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class AcctUpdateBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String acctId;//账户标识 必输
	private String acctName;//会员姓名
	private String acctLevel;//账户等级
	private String operUser;//操作用户	可输
	public String getAcctId() {
		return acctId;
	}
	public void setAcctId(String acctId) {
		this.acctId = (acctId == null) ? null : acctId.trim();
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getAcctLevel() {
		return acctLevel;
	}
	public void setAcctLevel(String acctLevel) {
		this.acctLevel = acctLevel == null ? null : acctLevel.trim();
	}
	public String getOperUser() {
		return operUser;
	}
	public void setOperUser(String operUser) {
		this.operUser = operUser == null ? null : operUser.trim();
	}
}
