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

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.tran.serviceBean  
 * @ClassName: TranCoreFeeOrderBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年1月16日 下午5:01:40 
 * @version V1.0 
 

 */
public class TranCoreFeeOrderBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;


    private Integer settlementDate; //结算日期
    
    private Integer tranDate;   //交易订单日期
    
    private String  feeInOut;   //交易内计费/交易外计费

    private String merchantId;  //商户号

    private String merchantMemberId;//商户ID

    private Integer tranAmountTotal;//交易总金额

    private Integer settlementAmountTotal;//结算金额汇总
    
    private Integer feeAmountTotal;//手续费汇总
    
    private Integer thdAmountTotal;//分润金额汇总
    
    private List<TranCoreFeeBean> tranCoreFeeBeanList;

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getMerchantMemberId() {
        return merchantMemberId;
    }

    public void setMerchantMemberId(String merchantMemberId) {
        this.merchantMemberId = merchantMemberId == null ? null : merchantMemberId.trim();
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
     * @return the tranAmountTotal
     */
    public Integer getTranAmountTotal() {
        return tranAmountTotal;
    }

    /**
     * @param tranAmountTotal the tranAmountTotal to set
     */
    public void setTranAmountTotal(Integer tranAmountTotal) {
        this.tranAmountTotal = tranAmountTotal;
    }

    /**
     * @return the settlementAmountTotal
     */
    public Integer getSettlementAmountTotal() {
        return settlementAmountTotal;
    }

    /**
     * @param settlementAmountTotal the settlementAmountTotal to set
     */
    public void setSettlementAmountTotal(Integer settlementAmountTotal) {
        this.settlementAmountTotal = settlementAmountTotal;
    }

    /**
     * @return the tranCoreFeeBeanList
     */
    public List<TranCoreFeeBean> getTranCoreFeeBeanList() {
        return tranCoreFeeBeanList;
    }

    /**
     * @param tranCoreFeeBeanList the tranCoreFeeBeanList to set
     */
    public void setTranCoreFeeBeanList(List<TranCoreFeeBean> tranCoreFeeBeanList) {
        this.tranCoreFeeBeanList = tranCoreFeeBeanList;
    }

    /**
     * @return the feeAmountTotal
     */
    public Integer getFeeAmountTotal() {
        return feeAmountTotal;
    }

    /**
     * @param feeAmountTotal the feeAmountTotal to set
     */
    public void setFeeAmountTotal(Integer feeAmountTotal) {
        this.feeAmountTotal = feeAmountTotal;
    }

    /**
     * @return the thdAmountTotal
     */
    public Integer getThdAmountTotal() {
        return thdAmountTotal;
    }

    /**
     * @param thdAmountTotal the thdAmountTotal to set
     */
    public void setThdAmountTotal(Integer thdAmountTotal) {
        this.thdAmountTotal = thdAmountTotal;
    }

    /**
     * @return the feeInOut
     */
    public String getFeeInOut() {
        return feeInOut;
    }

    /**
     * @param feeInOut the feeInOut to set
     */
    public void setFeeInOut(String feeInOut) {
        this.feeInOut = feeInOut;
    }
}
