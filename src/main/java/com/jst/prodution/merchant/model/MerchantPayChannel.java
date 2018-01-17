package com.jst.prodution.merchant.model;

public class MerchantPayChannel implements java.io.Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer seqInx;

    private String payChannel;

    private String payType;

    private String payUserId;

    private String appId;

    public Integer getSeqInx() {
        return seqInx;
    }

    public void setSeqInx(Integer seqInx) {
        this.seqInx = seqInx;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getPayUserId() {
        return payUserId;
    }

    public void setPayUserId(String payUserId) {
        this.payUserId = payUserId == null ? null : payUserId.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }
}