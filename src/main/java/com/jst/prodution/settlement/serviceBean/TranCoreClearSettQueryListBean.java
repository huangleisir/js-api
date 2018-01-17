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

package com.jst.prodution.settlement.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.tran.serviceBean  
 * @ClassName: TranCoreClearSettQueryListBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年4月14日 下午5:36:07 
 * @version V1.0 
 

 */
public class TranCoreClearSettQueryListBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    //查询条件
    private Integer settlementDate;    
    private String merchantExtenalNo;//外部商户订单号
    private String settStatus;//结算状态
    private String merchantId;//商户号
    private String settAmountType;//结算金额类型
    private String settSeq;//结算流水
    
    private String merchantMemberId;//商户ID

    private String merchantName;//商户名称
    private String tranSeq;//交易流水
    private Long tranAmount;//交易金额
    
    private Long settAmount;//结算金额
    private Long feeAmount;//手续费金额
    private Long othAmount;//分润金额
    private  Long disCountAmt ;//优惠金额

    private Integer tranDateStart;//交易日期
    private Integer tranDateEnd;//交易日期
    private Integer clearStart;//清分日期
    private Integer clearEnd;//清分日期
    private  String merchantLvl;//商户级别 1--1级商户，2--2级商户

    private String inBankCard;//拓展商
    private  Long payAmount;//实际付款金额
    private  String jstMerchantId;

    private List<TranCoreClearSettOrderBean> lstOrderBean;

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

    public Integer getTranDateStart() {
        return tranDateStart;
    }

    public void setTranDateStart(Integer tranDateStart) {
        this.tranDateStart = tranDateStart;
    }

    public Integer getTranDateEnd() {
        return tranDateEnd;
    }

    public void setTranDateEnd(Integer tranDateEnd) {
        this.tranDateEnd = tranDateEnd;
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
     * @return the lstOrderBean
     */
    public List<TranCoreClearSettOrderBean> getLstOrderBean() {
        return lstOrderBean;
    }

    /**
     * @param lstOrderBean the lstOrderBean to set
     */
    public void setLstOrderBean(List<TranCoreClearSettOrderBean> lstOrderBean) {
        this.lstOrderBean = lstOrderBean;
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


    public String getMerchantLvl() {
        return merchantLvl;
    }

    public void setMerchantLvl(String merchantLvl) {
        this.merchantLvl = merchantLvl;
    }

    public Integer getClearStart() {
        return clearStart;
    }

    public void setClearStart(Integer clearStart) {
        this.clearStart = clearStart;
    }

    public Integer getClearEnd() {
        return clearEnd;
    }

    public void setClearEnd(Integer clearEnd) {
        this.clearEnd = clearEnd;
    }

    public String getInBankCard() {
        return inBankCard;
    }

    public void setInBankCard(String inBankCard) {
        this.inBankCard = inBankCard;
    }

    public String getJstMerchantId() {
        return jstMerchantId;
    }

    public void setJstMerchantId(String jstMerchantId) {
        this.jstMerchantId = jstMerchantId;
    }
}
