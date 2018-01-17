package com.jst.prodution.account.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 用户冻结
 * @author junfu_yuan
 * @date 2016年10月8日
 */
public class AcctFrozenBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String FROZEN_TYPE_ACCT  = "1";// 冻结类型账户
	public static final String FROZEN_TYPE_AMOUT = "2";// 冻结类型金额
	
	//------------------------------ 接口输入参数 begin ------------------------------
	/**
	 * 账户号 - 必输
	 */
	private String acctId;
	/**
	 * 账户名称 - 可输
	 */
	private String acctName;
	/**
	 * 系统来源 - 必输
	 * 1：风控
	 * 2：运营
	 * 3: 内部冻结

	 */
	private String sourceFrom;
	/**
	 * 冻结类型 - 必输
	 * 1：账户冻结
	 * 2：金额冻结
	 */
	private String frozenType;
	/**
	 * 冻结金额 - 可输
	 * 单位 分
	 * 注：frozenType为“1-账户冻结”必输
	 */
	private Long amount;
	/**
	 * 备注 - 可输
	 */
	private String remark;
	
	/**
	 * 操作人 - 可输
	 */
	private String  operUser;
	//------------------------------ 接口输入参数 end ------------------------------

	
	//------------------------------ 接口输出参数 begin ------------------------------
	/**
	 * 冻结编号
	 */
	private String frozenId;
	
	/**
	 * 冻结添加时间
	 */
	private Date createTime;
	
	//------------------------------ 接口输出参数 end ------------------------------

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId == null ? null : acctId.trim();
	}
	
	public String getOperUser() {
		return operUser;
	}

	public void setOperUser(String operUser) {
		this.operUser = operUser == null ? null : operUser.trim();
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName == null ? null : acctName.trim();
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

	public String getFrozenId() {
		return frozenId;
	}

	public void setFrozenId(String frozenId) {
		this.frozenId = frozenId == null ? null : frozenId.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
