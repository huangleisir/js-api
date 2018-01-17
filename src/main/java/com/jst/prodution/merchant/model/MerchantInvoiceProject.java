package com.jst.prodution.merchant.model;

import java.io.Serializable;

public class MerchantInvoiceProject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2623080899798515214L;
	
	private String logId;				//主键
	private String rateType;			//税务类型
	private String industry;			//行业
	private String projectName;			//项目名称
	private String taxRate;				//税率
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getRateType() {
		return rateType;
	}
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

}
