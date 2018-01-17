package com.jst.prodution.finanacct.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 会员绑卡第一次鉴权
 * @author liang
 *
 */
public class RealTimeAutoReverseBean extends BaseBean implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String bussiCode;  // 分录事件编码
	private String tradAmt;     //交易金额 
	private String acctDate;     //会计日期
	private String sourceAcctTime;     //原业务请求记账时间
	private String source;     //原业务请求系统来源
	private String sourceFlowno;     //原务请求系统流水号  
	private String mark;     //交易备注
	public String getBussiCode() {
		return bussiCode;
	}
	public void setBussiCode(String bussiCode) {
		this.bussiCode = bussiCode;
	}
	public String getTradAmt() {
		return tradAmt;
	}
	public void setTradAmt(String tradAmt) {
		this.tradAmt = tradAmt;
	}
	public String getAcctDate() {
		return acctDate;
	}
	public void setAcctDate(String acctDate) {
		this.acctDate = acctDate;
	}
	public String getSourceAcctTime() {
		return sourceAcctTime;
	}
	public void setSourceAcctTime(String sourceAcctTime) {
		this.sourceAcctTime = sourceAcctTime;
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
	
	
}
