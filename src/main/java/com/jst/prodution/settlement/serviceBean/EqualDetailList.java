package com.jst.prodution.settlement.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.settlement.model.EqualDetail;

public class EqualDetailList extends BaseBean{
	private static final long serialVersionUID = 1L;
	private String channelType;				//通道类型 00001001-支付宝 00001002-微信   00001009-ETC 00001010-民生  00008888-金科
	private String paymentType;				//交易类型
    private String reconcSt;               //勾兑明细结果 :1:短款挂账 2:长款挂账 3:日切长款冲销 4:日切短款冲销 5金额不一致
	private String busNo;					//交易流水号
	private String merchantId;				//商户号
	private String psMerchantId;			//磐石商户号
	private String tranMoneySum;			//金额总和
    private String tranDate;                //交易日期
    private String jobDate;                //对账日期
	private boolean collectStatus;			//是否需要汇总
	private String merchantName;             //商户名称
	private List<EqualDetail> pageList;
	
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
     * @return the jobDate
     */
    public String getJobDate() {
        return jobDate;
    }
    /**
     * @param jobDate the jobDate to set
     */
    public void setJobDate(String jobDate) {
        this.jobDate = jobDate;
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
    /**
     * @return the psMerchantId
     */
    public String getPsMerchantId() {
        return psMerchantId;
    }
    /**
     * @param psMerchantId the psMerchantId to set
     */
    public void setPsMerchantId(String psMerchantId) {
        this.psMerchantId = psMerchantId;
    }
    public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	/**
     * @return the tranDate
     */
    public String getTranDate() {
        return tranDate;
    }
    /**
     * @param tranDate the tranDate to set
     */
    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
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
	public List<EqualDetail> getPageList() {
		return pageList;
	}
	public void setPageList(List<EqualDetail> pageList) {
		this.pageList = pageList;
	}
}
