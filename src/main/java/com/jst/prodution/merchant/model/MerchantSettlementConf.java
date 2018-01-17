package com.jst.prodution.merchant.model;

public class MerchantSettlementConf implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String logId;

    private String userId;          //商户ID

    private String feeType;         //1--收费，2--分润

    private String feeRate;        //分润方比例

    private String feeMerchantName;  //分润方名称

    private String feeMerchantId;   //分润方商户号

    private String feeMerchantAcct; //分润方账户
    private String payChannel;      //支付机构

    private String confStatus;      //1--状态正常,2--状态失效
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    public String getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(String feeRate) {
        this.feeRate = feeRate;
    }

    public String getFeeMerchantName() {
        return feeMerchantName;
    }

    public void setFeeMerchantName(String feeMerchantName) {
        this.feeMerchantName = feeMerchantName == null ? null : feeMerchantName.trim();
    }

    public String getFeeMerchantId() {
        return feeMerchantId;
    }

    public void setFeeMerchantId(String feeMerchantId) {
        this.feeMerchantId = feeMerchantId == null ? null : feeMerchantId.trim();
    }

    public String getFeeMerchantAcct() {
        return feeMerchantAcct;
    }

    public void setFeeMerchantAcct(String feeMerchantAcct) {
        this.feeMerchantAcct = feeMerchantAcct == null ? null : feeMerchantAcct.trim();
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getConfStatus() {
        return confStatus;
    }

    public void setConfStatus(String confStatus) {
        this.confStatus = confStatus;
    }
}