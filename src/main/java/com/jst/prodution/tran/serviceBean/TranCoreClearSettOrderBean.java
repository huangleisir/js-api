/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/

package com.jst.prodution.tran.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.tran.serviceBean  
 * @ClassName: TranCoreClearSettOrderBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年4月14日 下午5:36:44 
 * @version V1.0 
 

 */
public class TranCoreClearSettOrderBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer settlementDate;
    
    private String merchantExtenalNo;//外部商户订单号
    private String settSeq;
    private String merchantId;//商户号
    
    private String merchantMemberId;//商户ID

    private String merchantName;//商户名称
    private String tranSeq;//交易流水
    private Long tranAmount;//交易金额
    private String settAmountType;//结算金额类型(结算金额来源)
    private Long settAmount;//结算金额
    private Long feeAmount;//手续费金额
    private Long othAmount;//分润金额
    
    private String settStatus;//结算状态

    /**
     * @return the settlementDate
     */
    public Integer getSettlementDate() {
        return settlementDate;
    }

    /**
     * @param settlementDate the settlementDate to set
     */
    public void setSettlementDate(Integer settlementDate) {
        this.settlementDate = settlementDate;
    }

    /**
     * @return the merchantExtenalNo
     */
    public String getMerchantExtenalNo() {
        return merchantExtenalNo;
    }

    /**
     * @param merchantExtenalNo the merchantExtenalNo to set
     */
    public void setMerchantExtenalNo(String merchantExtenalNo) {
        this.merchantExtenalNo = merchantExtenalNo;
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
     * @return the merchantMemberId
     */
    public String getMerchantMemberId() {
        return merchantMemberId;
    }

    /**
     * @param merchantMemberId the merchantMemberId to set
     */
    public void setMerchantMemberId(String merchantMemberId) {
        this.merchantMemberId = merchantMemberId;
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

    /**
     * @return the tranAmount
     */
    public Long getTranAmount() {
        return tranAmount;
    }

    /**
     * @param tranAmount the tranAmount to set
     */
    public void setTranAmount(Long tranAmount) {
        this.tranAmount = tranAmount;
    }

    /**
     * @return the settAmount
     */
    public Long getSettAmount() {
        return settAmount;
    }

    /**
     * @param settAmount the settAmount to set
     */
    public void setSettAmount(Long settAmount) {
        this.settAmount = settAmount;
    }

    /**
     * @return the feeAmount
     */
    public Long getFeeAmount() {
        return feeAmount;
    }

    /**
     * @param feeAmount the feeAmount to set
     */
    public void setFeeAmount(Long feeAmount) {
        this.feeAmount = feeAmount;
    }

    /**
     * @return the othAmount
     */
    public Long getOthAmount() {
        return othAmount;
    }

    /**
     * @param othAmount the othAmount to set
     */
    public void setOthAmount(Long othAmount) {
        this.othAmount = othAmount;
    }

    /**
     * @return the settStatus
     */
    public String getSettStatus() {
        return settStatus;
    }

    /**
     * @param settStatus the settStatus to set
     */
    public void setSettStatus(String settStatus) {
        this.settStatus = settStatus;
    }

    /**
     * @return the settSeq
     */
    public String getSettSeq() {
        return settSeq;
    }

    /**
     * @param settSeq the settSeq to set
     */
    public void setSettSeq(String settSeq) {
        this.settSeq = settSeq;
    }

    /**
     * @return the settAmountType
     */
    public String getSettAmountType() {
        return settAmountType;
    }

    /**
     * @param settAmountType the settAmountType to set
     */
    public void setSettAmountType(String settAmountType) {
        this.settAmountType = settAmountType;
    }

    /**
     * @return the tranSeq
     */
    public String getTranSeq() {
        return tranSeq;
    }

    /**
     * @param tranSeq the tranSeq to set
     */
    public void setTranSeq(String tranSeq) {
        this.tranSeq = tranSeq;
    }
    
    
}
