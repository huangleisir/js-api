package com.jst.prodution.payment.model;

/**
 * 付款账号配置
 * @author 吴安辉
 *
 */
public class AccountConfig implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String configId;		//主键
	private String payType;			//出款类型：01-个人提现 02-商户提现 03-理财回款 04-信贷放款 05-人工出款  06-收入出款 07-其他出款
	private String bankName;		//银行名称
	private String bankCode;		//银行简称：ABC
	private String payAccount;		//付款账号
	private String defaultFlag;		//是否默认：Y是 N否
	
	public String getConfigId() {
		return configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
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
	public String getPayAccount() {
		return payAccount;
	}
	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}
	public String getDefaultFlag() {
		return defaultFlag;
	}
	public void setDefaultFlag(String defaultFlag) {
		this.defaultFlag = defaultFlag;
	}

}
