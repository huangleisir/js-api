package com.jst.prodution.account.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class AcctUpgradeLevelBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String acctId;//账户标识
	private String acctLevel;//账户等级
	private String remark;//操作日志
	public String getAcctId() {
		return acctId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
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
	
}
