package com.jst.prodution.merchant.model;

import java.io.Serializable;
import java.util.Date;

public class MerchantMoveLog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mchntCd;
	private String bankNo;
	private String companyName;
	private Date createTime;
	private String mark;

	public MerchantMoveLog(){
		
	}
	
	public MerchantMoveLog(String mchntCd,String bankNo,String companyName,Date createTime,String mark){
		this.mchntCd = mchntCd;
		this.bankNo = bankNo;
		this.companyName = companyName;
		this.createTime = createTime;
		this.mark = mark;
	}
	
	public String getMchntCd() {
		return mchntCd;
	}
	public void setMchntCd(String mchntCd) {
		this.mchntCd = mchntCd;
	}
	public String getBankNo() {
		return bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	
}
