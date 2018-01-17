package com.jst.prodution.account.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class AcctCheckAndUpdAmtLimtBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String optFlag;// 1-校验，2-更新
	private String acctId;
	private Date tranDate;
	private String scen;// 1-充值，2-消费，3-转账，4-提现
	private Long amount;

	public String getOptFlag() {
		return optFlag;
	}

	public void setOptFlag(String optFlag) {
		this.optFlag = optFlag;
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public Date getTranDate() {
		return tranDate;
	}

	public void setTranDate(Date tranDate) {
		this.tranDate = tranDate;
	}

	public String getScen() {
		return scen;
	}

	public void setScen(String scen) {
		this.scen = scen;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

}
