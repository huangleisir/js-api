package com.jst.prodution.merchant.model;

public class MerchantPayConfKey implements java.io.Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String userId;

    private String payChannel;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }
}