package com.jst.prodution.merchant.serviceBean;


public class SecurityBean implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String id;
	private String issue;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSecurityIssue() {
		return issue;
	}
	public void setSecurityIssue(String securityIssue) {
		this.issue = securityIssue;
	}
	@Override
	public String toString() {
		return "SecurityBean [id=" + id + ", issue=" + issue + "]";
	}
	
}
