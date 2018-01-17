package com.jst.prodution.merchant.model;

import java.io.Serializable;

public class MerchantInvoiceLog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2237293956099350642L;
	
	private String logId;			//主键ID
	private String invoiceNo;		//发票申请单号
	private String merchantId;		//商户号
	private String merchantName;	//公司名称
	private String creator;			//操作人/创建人
	private String createTime;		//创建时间
	private String status;			//操作状态
	private String remark;			//备注
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
