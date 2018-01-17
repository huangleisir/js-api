package com.jst.prodution.merchant.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantTerminal;

public class MerchantTerminalBean extends BaseBean{

	private static final long serialVersionUID = 1L;

	private String terminalCode;
	
	private String terminalType;

    private String networkCode;

    private String networkName;

    private String merchantId;

    private String companyName;

    private String state;

    private String acceptChannel;

    private String posProperty;

    private String lotCode;

    private String lotName;

    private String cusAllowFlag;

    private String reAllowFlag;

    private String isCheckMac;

    private String testFlag;

    private String creator;

    private Date createTime;

    private String updater;

    private Date updateTime;
    
    private List<MerchantTerminal> merchantTerminalList;

	public String getTerminalCode() {
		return terminalCode;
	}

	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}

	public String getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

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

	public String getAcceptChannel() {
		return acceptChannel;
	}

	public void setAcceptChannel(String acceptChannel) {
		this.acceptChannel = acceptChannel;
	}

	public String getPosProperty() {
		return posProperty;
	}

	public void setPosProperty(String posProperty) {
		this.posProperty = posProperty;
	}

	public String getLotCode() {
		return lotCode;
	}

	public void setLotCode(String lotCode) {
		this.lotCode = lotCode;
	}

	public String getLotName() {
		return lotName;
	}

	public void setLotName(String lotName) {
		this.lotName = lotName;
	}

	public String getCusAllowFlag() {
		return cusAllowFlag;
	}

	public void setCusAllowFlag(String cusAllowFlag) {
		this.cusAllowFlag = cusAllowFlag;
	}

	public String getReAllowFlag() {
		return reAllowFlag;
	}

	public void setReAllowFlag(String reAllowFlag) {
		this.reAllowFlag = reAllowFlag;
	}

	public String getIsCheckMac() {
		return isCheckMac;
	}

	public void setIsCheckMac(String isCheckMac) {
		this.isCheckMac = isCheckMac;
	}

	public String getTestFlag() {
		return testFlag;
	}

	public void setTestFlag(String testFlag) {
		this.testFlag = testFlag;
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

	public List<MerchantTerminal> getMerchantTerminalList() {
		return merchantTerminalList;
	}

	public void setMerchantTerminalList(List<MerchantTerminal> merchantTerminalList) {
		this.merchantTerminalList = merchantTerminalList;
	}
}
