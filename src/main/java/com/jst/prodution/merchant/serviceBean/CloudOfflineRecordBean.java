package com.jst.prodution.merchant.serviceBean;


public class CloudOfflineRecordBean implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	    String logId ;// 记录id号
		String tranDate;
		String inTime;
		String outTime;
		String merchantId;
		String jstMerchantId;
		String merchantIdName;
		String cardParkNo;//车场编号
		String cardParkName;
		String cardNo;//车牌
		String orderType;
		String orderNo;
		String tranAmount;//实收金额
		String needAmount;//应收金额
		String disCountAmt ;//优惠金额
		String payType;
		String tranState;//交易状态
		
	public String getLogId() {
        return logId;
    }
    public void setLogId(String logId) {
        this.logId = logId;
    }
    public String getTranDate() {
		return tranDate;
	}
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getJstMerchantId() {
		return jstMerchantId;
	}
	public void setJstMerchantId(String jstMerchantId) {
		this.jstMerchantId = jstMerchantId;
	}
	public String getMerchantIdName() {
		return merchantIdName;
	}
	public void setMerchantIdName(String merchantIdName) {
		this.merchantIdName = merchantIdName;
	}
	public String getCardParkNo() {
		return cardParkNo;
	}
	public void setCardParkNo(String cardParkNo) {
		this.cardParkNo = cardParkNo;
	}
	public String getCardParkName() {
		return cardParkName;
	}
	public void setCardParkName(String cardParkName) {
		this.cardParkName = cardParkName;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getTranAmount() {
		return tranAmount;
	}
	public void setTranAmount(String tranAmount) {
		this.tranAmount = tranAmount;
	}
	public String getNeedAmount() {
		return needAmount;
	}
	public void setNeedAmount(String needAmount) {
		this.needAmount = needAmount;
	}
	public String getDisCountAmt() {
		return disCountAmt;
	}
	public void setDisCountAmt(String disCountAmt) {
		this.disCountAmt = disCountAmt;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getTranState() {
		return tranState;
	}
	public void setTranState(String tranState) {
		this.tranState = tranState;
	}
    @Override
    public String toString() {
        return "CloudOfflineRecordBean [logId=" + logId + ", tranDate=" + tranDate + ", inTime=" + inTime + ", outTime="
                + outTime + ", merchantId=" + merchantId + ", jstMerchantId=" + jstMerchantId + ", merchantIdName="
                + merchantIdName + ", cardParkNo=" + cardParkNo + ", cardParkName=" + cardParkName + ", cardNo="
                + cardNo + ", orderType=" + orderType + ", orderNo=" + orderNo + ", tranAmount=" + tranAmount
                + ", needAmount=" + needAmount + ", disCountAmt=" + disCountAmt + ", payType=" + payType
                + ", tranState=" + tranState + "]";
    }
	
}
