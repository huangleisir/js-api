package com.jst.prodution.merchant.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantNetwork;

public class MerchantNetworkBean extends BaseBean{

	private static final long serialVersionUID = 1L;

	private String networkCode;

    private String networkName;

    private String networkShortName;

    private String merchantId;

    private String companyName;

    private String state;

    private String contactPerson;

    private String contactTel;

    private String email;

    private String address;

    private String zipCode;

    private String creator;

    private Date createTime;

    private String updater;

    private Date updateTime;
    
    private List<MerchantNetwork> merchantNetworkList;

	public String getNetworkCode() {
		return networkCode;
	}

	public void setNetworkCode(String networkCode) {
		this.networkCode = networkCode;
	}

	public String getNetworkName() {
		return networkName;
	}

	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

	public String getNetworkShortName() {
		return networkShortName;
	}

	public void setNetworkShortName(String networkShortName) {
		this.networkShortName = networkShortName;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactTel() {
		return contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public List<MerchantNetwork> getMerchantNetworkList() {
		return merchantNetworkList;
	}

	public void setMerchentNetworkList(List<MerchantNetwork> merchantNetworkList) {
		this.merchantNetworkList = merchantNetworkList;
	}
}
