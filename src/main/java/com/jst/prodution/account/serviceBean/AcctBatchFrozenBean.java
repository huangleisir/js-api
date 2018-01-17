/**
 * author:汤广海
 * 2017年6月26日
 * 上午9:43:00
 */
package com.jst.prodution.account.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @author Administrator
 *
 */
public class AcctBatchFrozenBean extends BaseBean {
	
	/**
	 * 批量冻结
	 */
	private static final long serialVersionUID = 1L;
	public static final String FROZEN_TYPE_ACCT  = "1";// 冻结类型账户
	public static final String FROZEN_TYPE_AMOUT = "2";// 冻结类型金额
	
	
	private String frozenType;//冻结类型 - 必输 1：账户冻结 2：金额冻结
	private String  operUser;//操作人 - 可输
	private String sourceFrom;//系统来源
	private Date createTime;
	private String remark;//备注 - 可输
	
	private List<AcctFrozenBean> acctFrozenBeans;//批量账号信息

	public String getFrozenType() {
		return frozenType;
	}

	public void setFrozenType(String frozenType) {
		this.frozenType = frozenType;
	}

	public String getOperUser() {
		return operUser;
	}

	public void setOperUser(String operUser) {
		this.operUser = operUser;
	}

	public String getSourceFrom() {
		return sourceFrom;
	}

	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<AcctFrozenBean> getAcctFrozenBeans() {
		return acctFrozenBeans;
	}

	public void setAcctFrozenBeans(List<AcctFrozenBean> acctFrozenBeans) {
		this.acctFrozenBeans = acctFrozenBeans;
	}

}
