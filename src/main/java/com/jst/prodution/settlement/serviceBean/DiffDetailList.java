package com.jst.prodution.settlement.serviceBean;

import java.util.List;


import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.settlement.model.DiffDetail;

public class DiffDetailList extends BaseBean{
	private static final long serialVersionUID = 1L;
	private String channelType;				//通道类型
	private String paymentType;				//交易类型
	private String busNo;					//交易流水号
	private String merchantId;				//商户号
	private String psMerchantId;			//磐石商户号
	private String tranMoneySum;			//金额总和
	private boolean collectStatus;			//是否需要汇总
	private String reconcSt;               //勾兑明细结果
	private String merchantName;             //商户名称
	private List<DiffDetail> pageList;
	
	/**
     * @return the merchantName
     */
    public String getMerchantName() {
        return merchantName;
    }
    /**
     * @param merchantName the merchantName to set
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }
    /**
     * @return the reconcSt
     */
    public String getReconcSt() {
        return reconcSt;
    }
    /**
     * @param reconcSt the reconcSt to set
     */
    public void setReconcSt(String reconcSt) {
        this.reconcSt = reconcSt;
    }
    public String getChannelType() {
		return channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getTranMoneySum() {
		return tranMoneySum;
	}
	public void setTranMoneySum(String tranMoneySum) {
		this.tranMoneySum = tranMoneySum;
	}
	public boolean getCollectStatus() {
		return collectStatus;
	}
	public void setCollectStatus(boolean collectStatus) {
		this.collectStatus = collectStatus;
	}
    public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getPsMerchantId() {
		return psMerchantId;
	}
	public void setPsMerchantId(String psMerchantId) {
		this.psMerchantId = psMerchantId;
	}
	/**
     * @return the pageList
     */
    public List<DiffDetail> getPageList() {
        return pageList;
    }
    /**
     * @param pageList the pageList to set
     */
    public void setPageList(List<DiffDetail> pageList) {
        this.pageList = pageList;
    }

}
