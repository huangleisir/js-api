package com.jst.prodution.account.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 查询账户信息Bean(精确查询)
 * 
 * @author tomy
 *
 */
public class AcctInfoQueryByIdBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String acctId; // 账户号
	private String userId; // 用户号
	private String acctName; // 用户真实姓名
	private String acctStatus; // 账户状态(1-正常，2-冻结)
	private String sourceFrom; // 业务来源(1-APP，2-OMS)
	private String acctLevel; // 账户等级
	private String acctType; // 账户类型(01-基本户)
	private Long yesterdayBalance; // 昨日余额
	private Long balance; // 当前余额
	private Long frozenBalance; // 冻结金额
	private Long freeBalance; // 可用余额
	private String openDate; // 开户日期
	private String changeDate; // 上次动户日期
	private String updateTime; // 修改时间
	private String createTime; // 创建时间
	private Long limitedBalanceByDay;// 单日当前已使用余额
	private String liBalDayUptTime;// 日限额更新时间
	private Long limitedBalanceByAll;// 账户等级已使用余额
	private String liBalAllUptTime;// 账户等级限额更新日期
	
	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	private String remark;// 备注

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

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName == null ? null : acctName.trim();
	}

	public String getAcctStatus() {
		return acctStatus;
	}

	public void setAcctStatus(String acctStatus) {
		this.acctStatus = acctStatus == null ? null : acctStatus.trim();
	}

	public String getSourceFrom() {
		return sourceFrom;
	}

	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom == null ? null : sourceFrom.trim();
	}

	public String getAcctLevel() {
		return acctLevel;
	}

	public void setAcctLevel(String acctLevel) {
		this.acctLevel = acctLevel == null ? null : acctLevel.trim();
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType == null ? null : acctType.trim();
	}

	public Long getYesterdayBalance() {
		return yesterdayBalance;
	}

	public void setYesterdayBalance(Long yesterdayBalance) {
		this.yesterdayBalance = yesterdayBalance;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public Long getFrozenBalance() {
		return frozenBalance;
	}

	public void setFrozenBalance(Long frozenBalance) {
		this.frozenBalance = frozenBalance;
	}

	public Long getFreeBalance() {
		return freeBalance;
	}

	public void setFreeBalance(Long freeBalance) {
		this.freeBalance = freeBalance;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Long getLimitedBalanceByDay() {
		return limitedBalanceByDay;
	}

	public void setLimitedBalanceByDay(Long limitedBalanceByDay) {
		this.limitedBalanceByDay = limitedBalanceByDay;
	}

	public String getLiBalDayUptTime() {
		return liBalDayUptTime;
	}

	public void setLiBalDayUptTime(String liBalDayUptTime) {
		this.liBalDayUptTime = liBalDayUptTime;
	}

	public Long getLimitedBalanceByAll() {
		return limitedBalanceByAll;
	}

	public void setLimitedBalanceByAll(Long limitedBalanceByAll) {
		this.limitedBalanceByAll = limitedBalanceByAll;
	}

	public String getLiBalAllUptTime() {
		return liBalAllUptTime;
	}

	public void setLiBalAllUptTime(String liBalAllUptTime) {
		this.liBalAllUptTime = liBalAllUptTime;
	}

}
