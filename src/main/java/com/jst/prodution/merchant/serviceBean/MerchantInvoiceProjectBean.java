package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantInvoiceProject;

public class MerchantInvoiceProjectBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -212960951941335879L;
	private String logId;				//主键
	private String rateType;			//税务类型
	private String industry;			//行业
	private String projectName;			//项目名称
	private String taxRate;				//税率
	private List<MerchantInvoiceProject> projectList;
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
	public List<MerchantInvoiceProject> getProjectList() {
		return projectList;
	}
	public void setProjectList(List<MerchantInvoiceProject> projectList) {
		this.projectList = projectList;
	}
	
}
