package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
 * 小贷借记卡锁定or解绑bean 
 *
 */
public class LoanCardLockBean  extends BaseBean {
	private static final long serialVersionUID = -8066821709481042363L;
	private String userId ; // 用户id 
	private String bankCardCode ; //银行卡号 
	private String bankCardName ; //开户人名称 
	private String bankCardType ; // 卡类型  01 借记卡
	private String opterType ; // 00 锁定， 01 锁定解绑 
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
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
	public String getOpterType() {
		return opterType;
	}
	public void setOpterType(String opterType) {
		this.opterType = opterType;
	}
}
