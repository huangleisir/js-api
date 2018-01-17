package com.jst.prodution.account.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class AcctCheckAccantantBillListBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	
	private String acctId;         //账户号
	
	private String acctName;         //账户名称

	private String acctType;     //账户类型  

	private String  subjectNo;   //科目编码

	private String  balance;     //余额
	
	private String  acctStatus;   //账户状态（1-正常，2-冻结）

	private String cutDate;     //日切日期 

	private List<String> acctTypes ;     //要查询的账户类型集合

	private List<AcctCheckAccantantBillListBean> acctCheckAccantantBillList ;     //查询结果集

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

	public String getAcctStatus() {
		return acctStatus;
	}

	public void setAcctStatus(String acctStatus) {
		this.acctStatus = acctStatus;
	}


	public String getSubjectNo() {
		return subjectNo;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getCutDate() {
		return cutDate;
	}

	public void setCutDate(String cutDate) {
		this.cutDate = cutDate;
	}

	public List<String> getAcctTypes() {
		return acctTypes;
	}

	public void setAcctTypes(List<String> acctTypes) {
		this.acctTypes = acctTypes;
	}

	public List<AcctCheckAccantantBillListBean> getAcctCheckAccantantBillList() {
		return acctCheckAccantantBillList;
	}

	public void setAcctCheckAccantantBillList(List<AcctCheckAccantantBillListBean> acctCheckAccantantBillList) {
		this.acctCheckAccantantBillList = acctCheckAccantantBillList;
	}
	
}
