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

package com.jst.prodution.merchant.model;

import java.io.Serializable;
import java.util.Date;

/** 
 * 
 * @Package: com.jst.prodution.merchant.model  
 * @ClassName: MerchantSettInfo 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年7月12日 下午5:03:10 
 * @version V1.0 
 

 */
public class MerchantSettInfo implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String userId;                      //商户ID
    private String type;                        //类型：1结算
    private String state;                       //状态：1 正在使用 2未使用
    private String settlementType;              //结算方向  1--结算到银行卡(自动结算到银行卡)2--结算到余额
    private String cycle;                       //结算周期
    private String feeInOut;                    //结算类型 01-交易内收费，02-交易外收费
    private String settleCycleType;    //结算方式 'N:T+N,W:周结,M:月结,HM:半月结
    private Long settleMinAmount;   //'结算起始金额'
    private Integer settleMaxCycle;//结算最长周期
    private String settleByFestv;   //是否跨节假日，Y-是,N-否 
    private String reviewState;                     //审核状态(0待审核,1审核通过 2驳回 3 不通过)
    private String merchantId;              //商户号
    private String companyName;             //企业全称
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getSettlementType() {
        return settlementType;
    }
    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
    }
    public String getCycle() {
        return cycle;
    }
    public void setCycle(String cycle) {
        this.cycle = cycle;
    }
    public String getFeeInOut() {
        return feeInOut;
    }
    public void setFeeInOut(String feeInOut) {
        this.feeInOut = feeInOut;
    }
    public String getSettleCycleType() {
        return settleCycleType;
    }
    public void setSettleCycleType(String settleCycleType) {
        this.settleCycleType = settleCycleType;
    }
    public Long getSettleMinAmount() {
        return settleMinAmount;
    }
    public void setSettleMinAmount(Long settleMinAmount) {
        this.settleMinAmount = settleMinAmount;
    }
    public Integer getSettleMaxCycle() {
        return settleMaxCycle;
    }
    public void setSettleMaxCycle(Integer settleMaxCycle) {
        this.settleMaxCycle = settleMaxCycle;
    }
    public String getSettleByFestv() {
        return settleByFestv;
    }
    public void setSettleByFestv(String settleByFestv) {
        this.settleByFestv = settleByFestv;
    }
    public String getReviewState() {
        return reviewState;
    }
    public void setReviewState(String reviewState) {
        this.reviewState = reviewState;
    }
    public String getMerchantId() {
        return merchantId;
    }
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
