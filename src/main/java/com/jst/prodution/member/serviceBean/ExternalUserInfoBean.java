package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
 * 小贷外部会员信息  
 *
 */
public class ExternalUserInfoBean extends BaseBean {

	private static final long serialVersionUID = 6532158940015319861L;
	/**
	 * 用户id
	 */
	private String userId;
	
	/**
	 * 公司名称 
	 */
	private String companyName;
	/**
	 * 工号 
	 */
	private String jobNum;
	 
    /**
     * 员工卡号  
     */
	private String employeeCardNum;
	
	private String borrowLimit ; // 推送信息到小贷返回额度信息
	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobNum() {
		return jobNum;
	}

	public void setJobNum(String jobNum) {
		this.jobNum = jobNum;
	}

	public String getEmployeeCardNum() {
		return employeeCardNum;
	}

	public void setEmployeeCardNum(String employeeCardNum) {
		this.employeeCardNum = employeeCardNum;
	}

	public String getBorrowLimit() {
		return borrowLimit;
	}

	public void setBorrowLimit(String borrowLimit) {
		this.borrowLimit = borrowLimit;
	}

}
