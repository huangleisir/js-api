package com.jst.prodution.account.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class AcctLevelAmtLimListBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String optFlag;// 操作标识(1-查询，2-删除，3-新增，4-修改)
	private String acctLevel;//账户等级
	private List<AcctLevelAmtLimBean> acctLevelAmtLimBeans;

	public String getOptFlag() {
		return optFlag;
	}

	public void setOptFlag(String optFlag) {
		this.optFlag = optFlag;
	}

	public String getAcctLevel() {
		return acctLevel;
	}

	public void setAcctLevel(String acctLevel) {
		this.acctLevel = acctLevel;
	}

	public List<AcctLevelAmtLimBean> getAcctLevelAmtLimBeans() {
		return acctLevelAmtLimBeans;
	}

	public void setAcctLevelAmtLimBeans(List<AcctLevelAmtLimBean> acctLevelAmtLimBeans) {
		this.acctLevelAmtLimBeans = acctLevelAmtLimBeans;
	}

}
