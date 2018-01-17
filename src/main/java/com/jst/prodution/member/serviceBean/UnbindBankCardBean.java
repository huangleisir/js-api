package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 会员解绑银行卡)
 * @author tudq
 *
 */
public class UnbindBankCardBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	private String userId;  // 用户id
	private String userName;     //用户名称
	private String certType;     //证件类型   
	private String certNo;     //证件号码
	private String payPwd;     //支付密码  
	private String BankCardCode;     //银行卡号
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCertType() {
		return certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getPayPwd() {
		return payPwd;
	}
	public void setPayPwd(String payPwd) {
		this.payPwd = payPwd;
	}
	public String getBankCardCode() {
		return BankCardCode;
	}
	public void setBankCardCode(String bankCardCode) {
		BankCardCode = bankCardCode;
	}
}
