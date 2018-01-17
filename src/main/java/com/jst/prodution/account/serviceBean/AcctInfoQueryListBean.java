package com.jst.prodution.account.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 账户信息查询Bean(模糊查询)
 * @author tomy
 *
 */
public class AcctInfoQueryListBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String acctId;//账户号
	private String userId;//用户号
	private String acctName;//用户真实姓名
	private String acctStatus;//账户状态(1-正常，2-冻结)
	private String sourceFrom;//业务来源(1-APP，2-OMS)
	private String acctLevel;//账户等级
	private String acctType;//账户类型(01-基本户)
	private Long balanceSum; // 当前余额汇总
	private Long frozenBalanceSum; // 冻结金额汇总
	private Long freeBalanceSum; // 可用余额汇总
	private Long limitedBalanceByDaySum;// 单日当前已使用余额汇总
	private Long limitedBalanceByAllSum;// 账户等级已使用余额汇总
	private Long yesterdayBalanceSum; 
	
	/**标识业务来源为OMS，如果不为OMS则不进行汇总查询,达到优化性能目的*/
	private String identification;

	private List<AcctInfoQueryByIdBean> acctInfoQueryList;
	public String getAcctId() {
		return acctId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId == null || "".equals(acctId.trim()) ? null : acctId.trim();
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId == null || "".equals(userId.trim()) ? null : userId.trim();
	}
	
	public Long getYesterdayBalanceSum() {
		return yesterdayBalanceSum;
	}
	public void setYesterdayBalanceSum(Long yesterdayBalanceSum) {
		this.yesterdayBalanceSum = yesterdayBalanceSum;
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName == null || "".equals(acctName.trim()) ? null : acctName.trim();
	}
	public String getAcctStatus() {
		return acctStatus;
	}
	public void setAcctStatus(String acctStatus) {
		this.acctStatus = acctStatus == null || "".equals(acctStatus.trim()) ? null : acctStatus.trim();
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom == null || "".equals(sourceFrom.trim()) ? null : sourceFrom.trim();
	}
	public String getAcctLevel() {
		return acctLevel;
	}
	public void setAcctLevel(String acctLevel) {
		this.acctLevel = acctLevel == null || "".equals(acctLevel.trim()) ? null : acctLevel.trim();
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType == null || "".equals(acctType.trim()) ? null : acctType.trim();
	}
	
	public Long getBalanceSum() {
		return balanceSum;
	}
	public void setBalanceSum(Long balanceSum) {
		this.balanceSum = balanceSum;
	}
	public Long getFrozenBalanceSum() {
		return frozenBalanceSum;
	}
	public void setFrozenBalanceSum(Long frozenBalanceSum) {
		this.frozenBalanceSum = frozenBalanceSum;
	}
	public Long getFreeBalanceSum() {
		return freeBalanceSum;
	}
	public void setFreeBalanceSum(Long freeBalanceSum) {
		this.freeBalanceSum = freeBalanceSum;
	}
	public Long getLimitedBalanceByDaySum() {
		return limitedBalanceByDaySum;
	}
	public void setLimitedBalanceByDaySum(Long limitedBalanceByDaySum) {
		this.limitedBalanceByDaySum = limitedBalanceByDaySum;
	}
	public Long getLimitedBalanceByAllSum() {
		return limitedBalanceByAllSum;
	}
	public void setLimitedBalanceByAllSum(Long limitedBalanceByAllSum) {
		this.limitedBalanceByAllSum = limitedBalanceByAllSum;
	}
	public List<AcctInfoQueryByIdBean> getAcctInfoQueryList() {
		return acctInfoQueryList;
	}
	public void setAcctInfoQueryList(List<AcctInfoQueryByIdBean> acctInfoQueryList) {
		this.acctInfoQueryList = acctInfoQueryList;
	}
    public String getIdentification() {
        return identification;
    }
    public void setIdentification(String identification) {
        this.identification = identification;
    }
}
