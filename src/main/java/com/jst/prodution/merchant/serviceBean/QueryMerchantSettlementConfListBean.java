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

package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantSettlementConf;

/** 
 * 
 * @Package: com.jst.prodution.merchant.serviceBean  
 * @ClassName: QueryMerchantSettlementConfListBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年1月17日 下午3:31:35 
 * @version V1.0 
 

 */
public class QueryMerchantSettlementConfListBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String userId;
    
    private String settlementType;              //结算方向  1--结算到银行卡2--结算到余额
    private String cycle;                       //结算周期
    private String feeInOut;//交易内计费、交易外计费
    private String settleCycleType;    //结算方式 'N:T+N,W:周结,M:月结,HM:半月结

    private Long settleMinAmount;   //'结算起始金额'

    private Integer settleMaxCycle;//结算最长周期

    private String settleByFestv;   //是否跨节假日，Y-是,N-否
    private String payChannelId;//支付渠道
    
    private List<MerchantSettlementConf> merchantSettlementConfList;

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the merchantSettlementConfList
     */
    public List<MerchantSettlementConf> getMerchantSettlementConfList() {
        return merchantSettlementConfList;
    }

    /**
     * @param merchantSettlementConfList the merchantSettlementConfList to set
     */
    public void setMerchantSettlementConfList(List<MerchantSettlementConf> merchantSettlementConfList) {
        this.merchantSettlementConfList = merchantSettlementConfList;
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

    public String getPayChannelId() {
        return payChannelId;
    }

    public void setPayChannelId(String payChannelId) {
        this.payChannelId = payChannelId;
    }
}
