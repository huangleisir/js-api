package com.jst.prodution.merchant.model;

import java.io.Serializable;

public class MerchantChangeLog implements Serializable {

    private static final long serialVersionUID = 1L;
    private String merchantId;

    private String merchantName;

    private String merchantStatus;

    private String modifyTime;

    private String isSynchro;

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(String merchantStatus) {
        this.merchantStatus = merchantStatus == null ? null : merchantStatus.trim();
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime == null ? null : modifyTime.trim();
    }

    public String getIsSynchro() {
        return isSynchro;
    }

    public void setIsSynchro(String isSynchro) {
        this.isSynchro = isSynchro;
    }
}