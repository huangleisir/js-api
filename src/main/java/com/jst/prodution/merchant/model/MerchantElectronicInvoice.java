package com.jst.prodution.merchant.model;

import java.io.Serializable;

public class MerchantElectronicInvoice implements Serializable{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9109073321193710318L;
	private String  logId; 					// 主键ID
	private String  invoiceNo;				//发票申请单号
	private String  merchantId;				// 商户号
	private String  belongProvince;			// 所属省
	private String  belongCity; 			//所属城市
	private String  belongCounty;			// 所属县
	private String  merchantName;			// 企业名称
	private String  merchantTax;			// 企业税号
	private String  taxDept;				// 税务机关代码
	private String  competentTaxName;		// 主管税务机关名称
	private String  taxPhone;				// 税盘分机号
	private String  invoiceCert;			// 电子发票金税盘证书口令
	private String  sellerAddr;				// 销方地址
	private String  sellerPhone;			// 销方电话
	private String  sellerAccount;			// 销方银行账号
	private String  payee;					// 收款人
	private String  reviewer;				// 复核人
	private String  issuer;					// 开票人
	private String  taxDiskAddr;			// 金税盘邮寄地址
	private String  taxDiskType;			// 金税盘快递方式
	private String  taxDiskNo;				// 金税盘快递单号
	private String  overTaxDiskType;		// 转交金税盘快递方式
	private String  overTaxDiskNo;			// 转交金税盘快递单号
	private String  totalInvoice;			// 开票次数
	private String  isVerify;				// 是否有效
	private String  enableState;			// 启用/禁用
	private String  remark;					// 备注
	private String  invoiceState;			// '发票状态: 1--保存，2--提交
	private String  status;					// 审核状态:1--申请中，2--编制中，3--待转交，4--待开通，5--已开通，6--已终止
	private String  createTime;				// 创建时间
	private String  creator;				// 创建人
	private String  updateTime;				// 修改时间
	private String  updator;				// 修改人
	private String  amount;					// 充值金额
	private String  projectName;			// 项目名称
	private String  taxRate;				// 税率
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getBelongProvince() {
		return belongProvince;
	}
	public void setBelongProvince(String belongProvince) {
		this.belongProvince = belongProvince;
	}
	public String getBelongCity() {
		return belongCity;
	}
	public void setBelongCity(String belongCity) {
		this.belongCity = belongCity;
	}
	public String getBelongCounty() {
		return belongCounty;
	}
	public void setBelongCounty(String belongCounty) {
		this.belongCounty = belongCounty;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantTax() {
		return merchantTax;
	}
	public void setMerchantTax(String merchantTax) {
		this.merchantTax = merchantTax;
	}
	public String getTaxDept() {
		return taxDept;
	}
	public void setTaxDept(String taxDept) {
		this.taxDept = taxDept;
	}
	public String getCompetentTaxName() {
		return competentTaxName;
	}
	public void setCompetentTaxName(String competentTaxName) {
		this.competentTaxName = competentTaxName;
	}
	public String getTaxPhone() {
		return taxPhone;
	}
	public void setTaxPhone(String taxPhone) {
		this.taxPhone = taxPhone;
	}
	public String getInvoiceCert() {
		return invoiceCert;
	}
	public void setInvoiceCert(String invoiceCert) {
		this.invoiceCert = invoiceCert;
	}
	public String getSellerAddr() {
		return sellerAddr;
	}
	public void setSellerAddr(String sellerAddr) {
		this.sellerAddr = sellerAddr;
	}
	public String getSellerPhone() {
		return sellerPhone;
	}
	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}
	public String getSellerAccount() {
		return sellerAccount;
	}
	public void setSellerAccount(String sellerAccount) {
		this.sellerAccount = sellerAccount;
	}
	public String getPayee() {
		return payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getReviewer() {
		return reviewer;
	}
	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public String getTaxDiskAddr() {
		return taxDiskAddr;
	}
	public void setTaxDiskAddr(String taxDiskAddr) {
		this.taxDiskAddr = taxDiskAddr;
	}
	public String getTaxDiskType() {
		return taxDiskType;
	}
	public void setTaxDiskType(String taxDiskType) {
		this.taxDiskType = taxDiskType;
	}
	public String getTaxDiskNo() {
		return taxDiskNo;
	}
	public void setTaxDiskNo(String taxDiskNo) {
		this.taxDiskNo = taxDiskNo;
	}
	public String getOverTaxDiskType() {
		return overTaxDiskType;
	}
	public void setOverTaxDiskType(String overTaxDiskType) {
		this.overTaxDiskType = overTaxDiskType;
	}
	public String getOverTaxDiskNo() {
		return overTaxDiskNo;
	}
	public void setOverTaxDiskNo(String overTaxDiskNo) {
		this.overTaxDiskNo = overTaxDiskNo;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getInvoiceState() {
		return invoiceState;
	}
	public void setInvoiceState(String invoiceState) {
		this.invoiceState = invoiceState;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdator() {
		return updator;
	}
	public void setUpdator(String updator) {
		this.updator = updator;
	}
	public String getTotalInvoice() {
		return totalInvoice;
	}
	public void setTotalInvoice(String totalInvoice) {
		this.totalInvoice = totalInvoice;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getIsVerify() {
		return isVerify;
	}
	public void setIsVerify(String isVerify) {
		this.isVerify = isVerify;
	}
	public String getEnableState() {
		return enableState;
	}
	public void setEnableState(String enableState) {
		this.enableState = enableState;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
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
