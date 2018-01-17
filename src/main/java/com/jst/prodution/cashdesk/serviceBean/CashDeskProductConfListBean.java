package com.jst.prodution.cashdesk.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.cashdesk.listBean.CashDeskProductConfBean;

public class CashDeskProductConfListBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	 private String productName; //产品名称

	 private String productCode;//支付产品分类编码

	 private String productDesc; //01-余额类，02-卡类

	 private String isQueryLimit; //是否需查额度，Y-是，N-否

	 private Integer priorityFlag; //优先标志，数字越小越优先

	 private String isOpen; //是否已开放，Y-是，N-否
	 
	 private Integer state; //0-启用，1-禁用

	private List<CashDeskProductConfBean> cashDeskProductConfBeanList;


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

	public List<CashDeskProductConfBean> getCashDeskProductConfBeanList() {
		return cashDeskProductConfBeanList;
	}

	public void setCashDeskProductConfBeanList(List<CashDeskProductConfBean> cashDeskProductConfBeanList) {
		this.cashDeskProductConfBeanList = cashDeskProductConfBeanList;
	}
	
}
