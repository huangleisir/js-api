package com.jst.prodution.merchant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class UserSecurityBean extends BaseBean{
	
	private static final long serialVersionUID = 1L;
	private String userId;
	private String securityIssue;//安全问题
	private String customIssue;//自定义问题
	private String answer;//答案
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSecurityIssue() {
		return securityIssue;
	}
	public void setSecurityIssue(String securityIssue) {
		this.securityIssue = securityIssue;
	}
	public String getCustomIssue() {
		return customIssue;
	}
	public void setCustomIssue(String customIssue) {
		this.customIssue = customIssue;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "UserSecurityBean [userId=" + userId + ", securityIssue=" + securityIssue + ", customIssue="
				+ customIssue + ", answer=" + answer + "]";
	}
	
}
