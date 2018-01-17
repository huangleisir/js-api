package com.jst.prodution.cashdesk.listBean;

import com.jst.prodution.base.bean.BaseBean;

public class CashDeskProductConfBean extends BaseBean {
	private static final long serialVersionUID = 1L;

	 private String productName;

	 private String productCode;

	 private String productDesc;

	 private String isQueryLimit;

	 private Integer priorityFlag;

	 private String isOpen;

	 private Integer state; //0-启用，1-禁用


	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getIsQueryLimit() {
		return isQueryLimit;
	}

	public void setIsQueryLimit(String isQueryLimit) {
		this.isQueryLimit = isQueryLimit;
	}

	public Integer getPriorityFlag() {
		return priorityFlag;
	}

	public void setPriorityFlag(Integer priorityFlag) {
		this.priorityFlag = priorityFlag;
	}

	public String getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(String isOpen) {
		this.isOpen = isOpen;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
	 
}
