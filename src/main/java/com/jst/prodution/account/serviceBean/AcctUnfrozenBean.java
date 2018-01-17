package com.jst.prodution.account.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class AcctUnfrozenBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;

	private String frozenId;// 原冻结编号 	必输
	private String sourceFrom;// 业务来源 	必输
	private String frozenType;// 解冻类型 (1-“账户冻结”和2-“金额冻结”)	必输
	private Long amount;// 解冻金额 单位 分 解冻类型为“2-金额冻结”必输
	private String remark;// 解结备注 	可输
	private String  operUser;//操作用户	可输
	
	
	private String userId;
	private String acctId;
	private String acctName;
	private String acctType;
	
	public String getFrozenId() {
		return frozenId;
	}
	public void setFrozenId(String frozenId) {
		this.frozenId = frozenId == null ? null : frozenId.trim();
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom == null ? null : sourceFrom.trim();
	}
	public String getFrozenType() {
		return frozenType;
	}
	public void setFrozenType(String frozenType) {
		this.frozenType = frozenType == null ? null : frozenType.trim();
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}
	public String getAcctId() {
		return acctId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId == null ? null : acctId.trim();
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName == null ? null : acctName.trim();
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType == null ? null : acctType.trim();
	}
	
}
