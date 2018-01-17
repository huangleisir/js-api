package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 第二次鉴权
 * @author liang
 *
 */
public class SecondAuthenBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	private String userId;  // 
	private String authenflowNo;     //鉴权流水号   
	private String verifyNum;     //短信验证码   
	private String cerNo;  // 证件号码
	private String userName;//用户名称
	private String certification;//认证标识
	private String sourceFrom;//例如：APP 
	private String operType;     //=1,绑卡，=2，重置密码   
	private String bankCardNo;     //卡号   
	private String creditQuotaAmount ; // 小贷需求增加字段： 绑卡成功推送信息返回 额度信息。
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAuthenflowNo() {
		return authenflowNo;
	}
	public void setAuthenflowNo(String authenflowNo) {
		this.authenflowNo = authenflowNo;
	}
	public String getVerifyNum() {
		return verifyNum;
	}
	public void setVerifyNum(String verifyNum) {
		this.verifyNum = verifyNum;
	}
	public String getCerNo() {
		return cerNo;
	}
	public void setCerNo(String cerNo) {
		this.cerNo = cerNo;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}
	public String getOperType() {
		return operType;
	}
	public void setOperType(String operType) {
		this.operType = operType;
	}
	public String getBankCardNo() {
		return bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	public String getCreditQuotaAmount() {
		return creditQuotaAmount;
	}
	public void setCreditQuotaAmount(String creditQuotaAmount) {
		this.creditQuotaAmount = creditQuotaAmount;
	}
	
}
