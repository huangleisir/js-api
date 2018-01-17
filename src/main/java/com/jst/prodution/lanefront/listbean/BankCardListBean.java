package com.jst.prodution.lanefront.listbean;

import java.util.List;

/**
 * 银行对应支持的卡bin列表
 * @author Administrator
 *
 */
public class BankCardListBean implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String bankName;					//银行名称	
	private String bankCode;					//银行编号
	private List<String> cardList;				//支持卡bin列表
	
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
	public List<String> getCardList() {
		return cardList;
	}
	public void setCardList(List<String> cardList) {
		this.cardList = cardList;
	}
	
}
