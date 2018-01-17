package com.jst.prodution.park.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class PropayRecordInfoBean extends BaseBean{
	private static final long serialVersionUID = 1L;
	String tranDate;//交易时间
	String orderNo;//商品订单号
	String carNo;//车牌
	String merchantId;//商户号
	String jstMerchantId;//卡系统商户号
	
	String amountTotalFee;//实收金额汇总
	String amountServiceFee;//应收金额汇总
	String amountDiscountFee;//优惠金额汇总
	
	List<PropayRecordList> propayRecordInfoList;

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
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


	public String getAmountTotalFee() {
		return amountTotalFee;
	}

	public void setAmountTotalFee(String amountTotalFee) {
		this.amountTotalFee = amountTotalFee;
	}

	public String getAmountServiceFee() {
		return amountServiceFee;
	}

	public void setAmountServiceFee(String amountServiceFee) {
		this.amountServiceFee = amountServiceFee;
	}

	public String getAmountDiscountFee() {
		return amountDiscountFee;
	}

	public void setAmountDiscountFee(String amountDiscountFee) {
		this.amountDiscountFee = amountDiscountFee;
	}

	public List<PropayRecordList> getPropayRecordInfoList() {
		return propayRecordInfoList;
	}

	public void setPropayRecordInfoList(List<PropayRecordList> propayRecordInfoList) {
		this.propayRecordInfoList = propayRecordInfoList;
	}

    @Override
    public String toString() {
        return "PropayRecordInfoBean [tranDate=" + tranDate + ", orderNo=" + orderNo + ", carNo=" + carNo
                + ", merchantId=" + merchantId + ", jstMerchantId=" + jstMerchantId + ", amountTotalFee="
                + amountTotalFee + ", amountServiceFee=" + amountServiceFee + ", amountDiscountFee=" + amountDiscountFee
                + ", propayRecordInfoList=" + propayRecordInfoList + "]";
    }

	
}
