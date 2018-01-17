package com.jst.prodution.tobank.serviceBean;

/**
 * 交易明细Bean
 * @author Administrator
 *
 */
public class AccDetailBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String accNo;					//交易账号
	private String tranDate;				//交易日期
	private String tranTime;				//交易时间
	private String creType;					//凭证种类
	private String creNo;					//凭证号码
	private String message;					//摘要
	private String amt;						//交易额
	private String balance;					//余额
	private String flag1;					//借贷标志：0-借 转出 ,1-贷 转入
	private String recvAccNo;				//对方账号
	private String recvName;				//对方账户名称	
	private String tranFlag;				//交易钞汇标志：0－钞户 1－汇户
	private String tranFlow;				//交易流水号
	private String payFlow;					//企业支付流水号
	private String detNo;					//活存帐户明细号
	private String det;						//备注
	private String pltvAccNo;				//关联账号
	private String cadBankNm;				//对方账户开户行名称
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getTranDate() {
		return tranDate;
	}
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	public String getTranTime() {
		return tranTime;
	}
	public void setTranTime(String tranTime) {
		this.tranTime = tranTime;
	}
	public String getCreType() {
		return creType;
	}
	public void setCreType(String creType) {
		this.creType = creType;
	}
	public String getCreNo() {
		return creNo;
	}
	public void setCreNo(String creNo) {
		this.creNo = creNo;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAmt() {
		return amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getFlag1() {
		return flag1;
	}
	public void setFlag1(String flag1) {
		this.flag1 = flag1;
	}
	public String getRecvAccNo() {
		return recvAccNo;
	}
	public void setRecvAccNo(String recvAccNo) {
		this.recvAccNo = recvAccNo;
	}
	public String getRecvName() {
		return recvName;
	}
	public void setRecvName(String recvName) {
		this.recvName = recvName;
	}
	public String getTranFlag() {
		return tranFlag;
	}
	public void setTranFlag(String tranFlag) {
		this.tranFlag = tranFlag;
	}
	public String getTranFlow() {
		return tranFlow;
	}
	public void setTranFlow(String tranFlow) {
		this.tranFlow = tranFlow;
	}
	public String getPayFlow() {
		return payFlow;
	}
	public void setPayFlow(String payFlow) {
		this.payFlow = payFlow;
	}
	public String getDetNo() {
		return detNo;
	}
	public void setDetNo(String detNo) {
		this.detNo = detNo;
	}
	public String getDet() {
		return det;
	}
	public void setDet(String det) {
		this.det = det;
	}
	public String getPltvAccNo() {
		return pltvAccNo;
	}
	public void setPltvAccNo(String pltvAccNo) {
		this.pltvAccNo = pltvAccNo;
	}
	public String getCadBankNm() {
		return cadBankNm;
	}
	public void setCadBankNm(String cadBankNm) {
		this.cadBankNm = cadBankNm;
	}
}
