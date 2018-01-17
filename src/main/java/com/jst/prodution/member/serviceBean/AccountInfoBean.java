package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 账户查询bean 
 * @author hewen 
 *
 */
public class AccountInfoBean extends BaseBean {
	private String userId;             //用户ID  
	private String acctId;             //用户账户号                      
	private String acctName;           //账户开户者名称       
	private String acctType;           	//账户类型：01 基本户   
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAcctId() {
		return acctId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
}
