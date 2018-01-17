package com.jst.prodution.finanacct.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 会员绑卡第一次鉴权
 * @author liang
 *
 */
public class RealTimeTradAcctBean extends BaseBean implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String bussiCode;  // 分录事件码
	private String acctDate;     //会计日期 
	private String acctMater;     //会计主体
	private String acctType;     //记账类型
	private String tradType;     //交易类型
	private String tradAmt;     //交易金额
	private String source;     //业务请求系统来源 
	private String sourceFlowno;     //业务请求系统流水号 
	private String mark;     //交易备注  
	private String borrowFactor1;     //借方影响因数1
	private String borrowFactor2;     //借方影响因数2 
	private String creditFactor1;     //贷方影响因数1
	private String creditFactor2;     //贷方影响因数2 
	private String acctFlowno;     //会计记账流水号 
	private String tradStatus  ;     //tradStatus  
	public String getBussiCode() {
		return bussiCode;
	}
	public void setBussiCode(String bussiCode) {
		this.bussiCode = bussiCode;
	}
	public String getAcctDate() {
		return acctDate;
	}
	public void setAcctDate(String acctDate) {
		this.acctDate = acctDate;
	}
	public String getAcctMater() {
		return acctMater;
	}
	public void setAcctMater(String acctMater) {
		this.acctMater = acctMater;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	public String getTradType() {
		return tradType;
	}
	public void setTradType(String tradType) {
		this.tradType = tradType;
	}
	public String getTradAmt() {
		return tradAmt;
	}
	public void setTradAmt(String tradAmt) {
		this.tradAmt = tradAmt;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSourceFlowno() {
		return sourceFlowno;
	}
	public void setSourceFlowno(String sourceFlowno) {
		this.sourceFlowno = sourceFlowno;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getBorrowFactor1() {
		return borrowFactor1;
	}
	public void setBorrowFactor1(String borrowFactor1) {
		this.borrowFactor1 = borrowFactor1;
	}
	public String getBorrowFactor2() {
		return borrowFactor2;
	}
	public void setBorrowFactor2(String borrowFactor2) {
		this.borrowFactor2 = borrowFactor2;
	}
	public String getCreditFactor1() {
		return creditFactor1;
	}
	public void setCreditFactor1(String creditFactor1) {
		this.creditFactor1 = creditFactor1;
	}
	public String getCreditFactor2() {
		return creditFactor2;
	}
	public void setCreditFactor2(String creditFactor2) {
		this.creditFactor2 = creditFactor2;
	}
	public String getAcctFlowno() {
		return acctFlowno;
	}
	public void setAcctFlowno(String acctFlowno) {
		this.acctFlowno = acctFlowno;
	}
	public String getTradStatus() {
		return tradStatus;
	}
	public void setTradStatus(String tradStatus) {
		this.tradStatus = tradStatus;
	}
	
	
	
}
