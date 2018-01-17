package com.jst.prodution.settlement.model;

import java.io.Serializable;

/**
 * 
* @ClassName: equalDetail 
* @Description: TODO(账平明细实体类) 
* @author zcb 
* @date 2017年8月22日 下午2:21:38 
*
 */
public class EqualDetail implements Serializable{

	private static final long serialVersionUID = 1L;
	private String id;
	private String busNo;	    			//交易流水号
	private String channelType;				//通道类型   4-支付宝 3-微信 5-民生 6-金科  7-ETC
	private String tranDate;				//交易日期
	private String jobDate;                //对账日期
	private String paymentType;				//交易类型
	private String tranMoney;				//交易金额
    private String payTranAmt;               //支付方交易金额
	private String businessType;			//类型 1-充值，2-支付 3 主动还款  4 自动还款
	private String merchantExtenalNo;		//外部订单号
	private String merchantId;				//卡商户号
	private String psMerchantId;             //磐石商户号
	private String merchantName;             //商户名称
	private String transName;             //商品名
	private String tranCode;				//交易类型(支付、退款)
	private String payAccNo;				//付款方交易账号
    private String reconcSt;               //勾兑明细结果
	private String rcvAccNo;               //收款方账号
	private String createdBy;				//创建人
	private String createdOn;				//创建时间
	private String updatedBy;				//修改人
	private String updatedOn;				//修改时间
	private String  mchntAcc;               //商户号
	private String  subMchntAcc;            //子商户号
	
	
	/**
     * @return the transName
     */
    public String getTransName() {
        return transName;
    }
    /**
     * @param transName the transName to set
     */
    public void setTransName(String transName) {
        this.transName = transName;
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
     * @return the mchntAcc
     */
    public String getMchntAcc() {
        return mchntAcc;
    }
    /**
     * @param mchntAcc the mchntAcc to set
     */
    public void setMchntAcc(String mchntAcc) {
        this.mchntAcc = mchntAcc;
    }
    /**
     * @return the subMchntAcc
     */
    public String getSubMchntAcc() {
        return subMchntAcc;
    }
    /**
     * @param subMchntAcc the subMchntAcc to set
     */
    public void setSubMchntAcc(String subMchntAcc) {
        this.subMchntAcc = subMchntAcc;
    }
    /**
     * @return the payTranAmt
     */
    public String getPayTranAmt() {
        return payTranAmt;
    }
    /**
     * @param payTranAmt the payTranAmt to set
     */
    public void setPayTranAmt(String payTranAmt) {
        this.payTranAmt = payTranAmt;
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
     * @return the createdBy
     */
	
    public String getCreatedBy() {
        return createdBy;
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
    /**
     * @return the rcvAccNo
     */
    public String getRcvAccNo() {
        return rcvAccNo;
    }
    /**
     * @param rcvAccNo the rcvAccNo to set
     */
    public void setRcvAccNo(String rcvAccNo) {
        this.rcvAccNo = rcvAccNo;
    }
    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    /**
     * @return the createdOn
     */
    public String getCreatedOn() {
        return createdOn;
    }
    /**
     * @param createdOn the createdOn to set
     */
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }
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
    public String getTranCode() {
		return tranCode;
	}
	public void setTranCode(String tranCode) {
		this.tranCode = tranCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getChannelType() {
		return channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}
	public String getTranDate() {
		return tranDate;
	}
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getTranMoney() {
		return tranMoney;
	}
	public void setTranMoney(String tranMoney) {
		this.tranMoney = tranMoney;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getMerchantExtenalNo() {
		return merchantExtenalNo;
	}
	public void setMerchantExtenalNo(String merchantExtenalNo) {
		this.merchantExtenalNo = merchantExtenalNo;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getPayAccNo() {
		return payAccNo;
	}
	public void setPayAccNo(String payAccNo) {
		this.payAccNo = payAccNo;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}
}
