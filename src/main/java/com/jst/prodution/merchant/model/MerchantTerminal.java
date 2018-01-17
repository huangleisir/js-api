package com.jst.prodution.merchant.model;

import java.io.Serializable;
import java.util.Date;

public class MerchantTerminal implements Serializable{

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

    public String getTerminalCode() {
        return terminalCode;
    }

    public void setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode == null ? null : terminalCode.trim();
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
        this.networkCode = networkCode == null ? null : networkCode.trim();
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName == null ? null : networkName.trim();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getAcceptChannel() {
        return acceptChannel;
    }

    public void setAcceptChannel(String acceptChannel) {
        this.acceptChannel = acceptChannel == null ? null : acceptChannel.trim();
    }

    public String getPosProperty() {
        return posProperty;
    }

    public void setPosProperty(String posProperty) {
        this.posProperty = posProperty == null ? null : posProperty.trim();
    }

    public String getLotCode() {
        return lotCode;
    }

    public void setLotCode(String lotCode) {
        this.lotCode = lotCode == null ? null : lotCode.trim();
    }

    public String getLotName() {
        return lotName;
    }

    public void setLotName(String lotName) {
        this.lotName = lotName == null ? null : lotName.trim();
    }

    public String getCusAllowFlag() {
        return cusAllowFlag;
    }

    public void setCusAllowFlag(String cusAllowFlag) {
        this.cusAllowFlag = cusAllowFlag == null ? null : cusAllowFlag.trim();
    }

    public String getReAllowFlag() {
        return reAllowFlag;
    }

    public void setReAllowFlag(String reAllowFlag) {
        this.reAllowFlag = reAllowFlag == null ? null : reAllowFlag.trim();
    }

    public String getIsCheckMac() {
        return isCheckMac;
    }

    public void setIsCheckMac(String isCheckMac) {
        this.isCheckMac = isCheckMac == null ? null : isCheckMac.trim();
    }

    public String getTestFlag() {
        return testFlag;
    }

    public void setTestFlag(String testFlag) {
        this.testFlag = testFlag == null ? null : testFlag.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
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
        this.updater = updater == null ? null : updater.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}