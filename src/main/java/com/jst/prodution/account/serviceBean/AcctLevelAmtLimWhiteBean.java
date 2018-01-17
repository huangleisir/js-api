package com.jst.prodution.account.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class AcctLevelAmtLimWhiteBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String acctId;// 账户标识
	private String acctName;// 账户名称
	private String remark;// 备注
	private String createUser;// 创建人
	private String updateUser;// 最后更新人
    private Date createTime;
    private Date updateTime;

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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
