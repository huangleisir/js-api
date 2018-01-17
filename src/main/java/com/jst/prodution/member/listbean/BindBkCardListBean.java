package com.jst.prodution.member.listbean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 银行卡Listbean查询
 * @author 
 *
 */
public class BindBkCardListBean extends BaseBean{
	
	private static final long serialVersionUID = 1L;
	private String userId;  			//会员ID
	private String bankCardCode;  		//银行卡号
	private String bankCardName;    	//开户人名字
	private String bankCardType; 		//卡类型 01借记卡 02贷记卡
	private String certtNo;     		//证件号
	private String certType;			//证件类型
	private String cardLast;			//卡号后4位
	private String bankCode;			//银行编号
	private String bankName;			//银行名称
	private String bankcardStat;		//卡绑定状态
	private String cardUsage;			//卡用途
	
	public String getBankCardCode() {
		return bankCardCode;
	}
	public void setBankCardCode(String bankCardCode) {
		this.bankCardCode = bankCardCode;
	}
	public String getBankCardName() {
		return bankCardName;
	}
	public void setBankCardName(String bankCardName) {
		this.bankCardName = bankCardName;
	}
	public String getBankCardType() {
		return bankCardType;
	}
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}
	public String getCerttNo() {
		return certtNo;
	}
	public void setCerttNo(String certtNo) {
		this.certtNo = certtNo;
	}
	public String getCertType() {
		return certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCardLast() {
		return cardLast;
	}
	public void setCardLast(String cardLast) {
		this.cardLast = cardLast;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankcardStat() {
		return bankcardStat;
	}
	public void setBankcardStat(String bankcardStat) {
		this.bankcardStat = bankcardStat;
	}
	public String getCardUsage() {
		return cardUsage;
	}
	public void setCardUsage(String cardUsage) {
		this.cardUsage = cardUsage;
	}
	
}
