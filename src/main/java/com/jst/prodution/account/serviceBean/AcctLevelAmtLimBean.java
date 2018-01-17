package com.jst.prodution.account.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class AcctLevelAmtLimBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String optFlag;// 操作标识
	private String acctLevel;// 账户等级
	private String rechargeScen;// 充值场景限额
	private String transferScen;// 转账场景限额
	private String cashwithdrawScen;// 提现场景限额
	private String expenditureScen;// 消费场景限额
	private int timeCycle;// 限额周期
	private String singleLimFlag;// 单笔限额标志
	private Long singleLimAmt;// 单笔限额金额
	private String dayLimFlag;// 单日限额标志
	private Long dayLimAmt;// 单日限额金额
	private String levelLimFlag;// 账户等级限额标志
	private Long levelLimAmt;// 账户等级限额金额
	private String remark;// 备注
	private String createUser;// 创建人
	private String updateUser;// 最后更新人

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

	public String getRechargeScen() {
		return rechargeScen;
	}

	public void setRechargeScen(String rechargeScen) {
		this.rechargeScen = rechargeScen;
	}

	public String getTransferScen() {
		return transferScen;
	}

	public void setTransferScen(String transferScen) {
		this.transferScen = transferScen;
	}

	public String getCashwithdrawScen() {
		return cashwithdrawScen;
	}

	public void setCashwithdrawScen(String cashwithdrawScen) {
		this.cashwithdrawScen = cashwithdrawScen;
	}

	public String getExpenditureScen() {
		return expenditureScen;
	}

	public void setExpenditureScen(String expenditureScen) {
		this.expenditureScen = expenditureScen;
	}

	public int getTimeCycle() {
		return timeCycle;
	}

	public void setTimeCycle(int timeCycle) {
		this.timeCycle = timeCycle;
	}

	public String getSingleLimFlag() {
		return singleLimFlag;
	}

	public void setSingleLimFlag(String singleLimFlag) {
		this.singleLimFlag = singleLimFlag;
	}

	public Long getSingleLimAmt() {
		return singleLimAmt;
	}

	public void setSingleLimAmt(Long singleLimAmt) {
		this.singleLimAmt = singleLimAmt;
	}

	public String getDayLimFlag() {
		return dayLimFlag;
	}

	public void setDayLimFlag(String dayLimFlag) {
		this.dayLimFlag = dayLimFlag;
	}

	public Long getDayLimAmt() {
		return dayLimAmt;
	}

	public void setDayLimAmt(Long dayLimAmt) {
		this.dayLimAmt = dayLimAmt;
	}

	public String getLevelLimFlag() {
		return levelLimFlag;
	}

	public void setLevelLimFlag(String levelLimFlag) {
		this.levelLimFlag = levelLimFlag;
	}

	public Long getLevelLimAmt() {
		return levelLimAmt;
	}

	public void setLevelLimAmt(Long levelLimAmt) {
		this.levelLimAmt = levelLimAmt;
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

}
