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

package com.jst.prodution.settlement.model;

import java.util.Date;

/** 
 * 
 * @Package: com.jst.prodution.tran.model  
 * @ClassName: QueryClearListBeanModel 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年4月21日 上午9:47:13 
 * @version V1.0 
 

 */
public class QueryClearListBeanModel implements java.io.Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer settlementDate;
    
    private String merchantExtenalNo;//外部商户订单号
    private String settSeq;
    private String merchantId;//商户号
    private String settStatus;//结算状态
    private String tranSeq;//交易流水
    
    private String merchantMemberId;//商户ID

    private String merchantName;//商户名称

    private Long tranAmount;//交易金额
    private String settAmountType;//结算金额类型(结算金额来源)
    private Long settAmount;//结算金额



    private Long othAmt;//分润金额
    private Long feeAmt;//收费金额
    private  Long disCountAmt ;//优惠金额

    private  Long payAmount;//实际付款金额
    private String outMchNo;

    private String outMchmemId;

    private String outMchName;

    private String inMchNo;

    private String inMchmemId;

    private String inMchName;
    private String inBankCard;//拓展商
    private Integer clearDate;

    private String clearSeq;

    private Integer tranDate;

    public String getMerchantLvl() {
        return merchantLvl;
    }

    public void setMerchantLvl(String merchantLvl) {
        this.merchantLvl = merchantLvl;
    }

    private String merchantLvl;
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
    public Long getOthAmt() {
        return othAmt;
    }

    public void setOthAmt(Long othAmt) {
        this.othAmt = othAmt;
    }

    public Long getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(Long feeAmt) {
        this.feeAmt = feeAmt;
    }
    /**
     * @return the outMchNo
     */
    public String getOutMchNo() {
        return outMchNo;
    }
    /**
     * @param outMchNo the outMchNo to set
     */
    public void setOutMchNo(String outMchNo) {
        this.outMchNo = outMchNo;
    }
    /**
     * @return the outMchmemId
     */
    public String getOutMchmemId() {
        return outMchmemId;
    }
    /**
     * @param outMchmemId the outMchmemId to set
     */
    public void setOutMchmemId(String outMchmemId) {
        this.outMchmemId = outMchmemId;
    }
    /**
     * @return the outMchName
     */
    public String getOutMchName() {
        return outMchName;
    }
    /**
     * @param outMchName the outMchName to set
     */
    public void setOutMchName(String outMchName) {
        this.outMchName = outMchName;
    }
    /**
     * @return the inMchmemId
     */
    public String getInMchmemId() {
        return inMchmemId;
    }
    /**
     * @param inMchmemId the inMchmemId to set
     */
    public void setInMchmemId(String inMchmemId) {
        this.inMchmemId = inMchmemId;
    }
    /**
     * @return the inMchNo
     */
    public String getInMchNo() {
        return inMchNo;
    }
    /**
     * @param inMchNo the inMchNo to set
     */
    public void setInMchNo(String inMchNo) {
        this.inMchNo = inMchNo;
    }
    /**
     * @return the inMchName
     */
    public String getInMchName() {
        return inMchName;
    }
    /**
     * @param inMchName the inMchName to set
     */
    public void setInMchName(String inMchName) {
        this.inMchName = inMchName;
    }
    /**
     * @return the clearDate
     */
    public Integer getClearDate() {
        return clearDate;
    }
    /**
     * @param clearDate the clearDate to set
     */
    public void setClearDate(Integer clearDate) {
        this.clearDate = clearDate;
    }
    /**
     * @return the clearSeq
     */
    public String getClearSeq() {
        return clearSeq;
    }
    /**
     * @param clearSeq the clearSeq to set
     */
    public void setClearSeq(String clearSeq) {
        this.clearSeq = clearSeq;
    }
    /**
     * @return the tranDate
     */
    public Integer getTranDate() {
        return tranDate;
    }
    /**
     * @param tranDate the tranDate to set
     */
    public void setTranDate(Integer tranDate) {
        this.tranDate = tranDate;
    }


    public Long getDisCountAmt() {
        return disCountAmt;
    }

    public void setDisCountAmt(Long disCountAmt) {
        this.disCountAmt = disCountAmt;
    }
    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }


    public String getInBankCard() {
        return inBankCard;
    }

    public void setInBankCard(String inBankCard) {
        this.inBankCard = inBankCard;
    }
}
