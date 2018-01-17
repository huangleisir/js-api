package com.jst.prodution.park.serviceBean;

public class PropayRecordList {
    String logId;
    String merchantId;
	String jstMerchantId;
	String tradeDate;//交易时间
	String inTime;//入场时间
	String outTime;//出场时间
	String orderNo;//商品订单号
	String totalFee;//实收金额
	String serviceFee;//应收金额
	String discountFee;//优惠金额
	String carNo;//车牌
	String remark;//备注
	public String getLogId() {
        return logId;
    }
    public void setLogId(String logId) {
        this.logId = logId;
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
    public String getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
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
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}
	public String getServiceFee() {
		return serviceFee;
	}
	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}
	public String getDiscountFee() {
		return discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
    @Override
    public String toString() {
        return "PropayRecordList [logId=" + logId + ", merchantId=" + merchantId + ", jstMerchantId=" + jstMerchantId
                + ", tradeDate=" + tradeDate + ", inTime=" + inTime + ", outTime=" + outTime + ", orderNo=" + orderNo
                + ", totalFee=" + totalFee + ", serviceFee=" + serviceFee + ", discountFee=" + discountFee + ", carNo="
                + carNo + ", remark=" + remark + "]";
    }
	
	
	
	
	
	
	
}
