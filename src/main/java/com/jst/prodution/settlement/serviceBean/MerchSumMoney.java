package com.jst.prodution.settlement.serviceBean;

import java.io.Serializable;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;



/**
 * 
* @ClassName: equalDetail 
* @Description: TODO(商户总金额汇总实体类) 
* @author zcb 
* @date 2017年8月22日 下午2:21:38 
*
 */
public class MerchSumMoney  extends BaseBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String tranDate;				//交易日期
	private String paymentType;				//交易类型
	private String sumTranMoney;				//交易金额
	private String sumLongMoney;               //长款总交易金额
	private String sumShortMoney;               //短款总交易金额

	private String merchantId;				//卡商户号
	private String psMerchantId;             //磐石商户号
	private List<MerchSumMoney> merchSumMoney;
	
    /**
     * @return the merchSumMoney
     */
    public List<MerchSumMoney> getMerchSumMoney() {
        return merchSumMoney;
    }
    /**
     * @param merchSumMoney the merchSumMoney to set
     */
    public void setMerchSumMoney(List<MerchSumMoney> merchSumMoney) {
        this.merchSumMoney = merchSumMoney;
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
    /**
     * @return the paymentType
     */
    public String getPaymentType() {
        return paymentType;
    }
    /**
     * @param paymentType the paymentType to set
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    /**
     * @return the sumTranMoney
     */
    public String getSumTranMoney() {
        return sumTranMoney;
    }
    /**
     * @param sumTranMoney the sumTranMoney to set
     */
    public void setSumTranMoney(String sumTranMoney) {
        this.sumTranMoney = sumTranMoney;
    }
    /**
     * @return the sumLongMoney
     */
    public String getSumLongMoney() {
        return sumLongMoney;
    }
    /**
     * @param sumLongMoney the sumLongMoney to set
     */
    public void setSumLongMoney(String sumLongMoney) {
        this.sumLongMoney = sumLongMoney;
    }
    /**
     * @return the sumShortMoney
     */
    public String getSumShortMoney() {
        return sumShortMoney;
    }
    /**
     * @param sumShortMoney the sumShortMoney to set
     */
    public void setSumShortMoney(String sumShortMoney) {
        this.sumShortMoney = sumShortMoney;
    }
    /**
     * @return the merchantId
     */
    public String getMerchantId() {
        return merchantId;
    }
    /**
     * @param merchantId the merchantId to set
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
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



}
