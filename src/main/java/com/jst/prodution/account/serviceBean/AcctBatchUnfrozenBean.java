/**
 * author:汤广海
 * 2017年6月27日
 * 下午7:37:49
 */
package com.jst.prodution.account.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 批量解冻
 *
 */
public class AcctBatchUnfrozenBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;
	private String unFrozenType;//解冻类型 - 必输 3：账户解冻 4：金额解冻
	private String  operUser;//操作人 - 可输
	private String sourceFrom;
	private Date createTime;
	private String remark;//备注 - 可输
	private List<AcctUnfrozenBean> acctUnfrozenBeans;
	public String getUnFrozenType() {
		return unFrozenType;
	}
	public void setUnFrozenType(String unFrozenType) {
		this.unFrozenType = unFrozenType;
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
	public List<AcctUnfrozenBean> getAcctUnfrozenBeans() {
		return acctUnfrozenBeans;
	}
	public void setAcctUnfrozenBeans(List<AcctUnfrozenBean> acctUnfrozenBeans) {
		this.acctUnfrozenBeans = acctUnfrozenBeans;
	}
}
