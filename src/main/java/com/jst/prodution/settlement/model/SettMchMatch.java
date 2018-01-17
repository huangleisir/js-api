package com.jst.prodution.settlement.model;

public class SettMchMatch {
    private String oldMerchantNo;

    private String merchantNo;

    private String isSubMch;

    public String getOldMerchantNo() {
        return oldMerchantNo;
    }

    public void setOldMerchantNo(String oldMerchantNo) {
        this.oldMerchantNo = oldMerchantNo == null ? null : oldMerchantNo.trim();
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getIsSubMch() {
        return isSubMch;
    }

    public void setIsSubMch(String isSubMch) {
        this.isSubMch = isSubMch == null ? null : isSubMch.trim();
    }
}