package com.jst.prodution.member.listbean;

import com.jst.prodution.base.bean.BaseBean;


/**
 * 卡BIN查询
 * @author 
 *
 */
public class BankCardbinlistBean extends BaseBean {
	

	private static final long serialVersionUID = 1L;
	private String bankInsNo;  
	private String bankName;    
	private String bankCode; 
	private String bankCardType;     
	private String cardName;  
	private String platformFlag;
	
	public BankCardbinlistBean(){
		super();
	}
	public String getBankInsNo() {
		return bankInsNo;
	}
	public void setBankInsNo(String bankInsNo) {
		this.bankInsNo = bankInsNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankCardType() {
		return bankCardType;
	}
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getPlatformFlag() {
		return platformFlag;
	}
	public void setPlatformFlag(String platformFlag) {
		this.platformFlag = platformFlag;
	}      

	public BankCardbinlistBean(String bankInsNo, String bankName, String bankCode, String bankCardType, String cardName, String platformFlag) {
		super();
		this.bankInsNo = bankInsNo;
		this.bankName = bankName;
		this.bankCode = bankCode;
		this.bankCardType = bankCardType;
		this.cardName = cardName;
		this.platformFlag = platformFlag;
	}
	
}
