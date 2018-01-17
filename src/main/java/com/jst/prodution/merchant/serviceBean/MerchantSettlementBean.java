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

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantBank;
import com.jst.prodution.merchant.model.MerchantSettlementConf;

/** 
 * 
 * @Package: com.jst.prodution.merchant.serviceBean  
 * @ClassName: MerchantSettlementBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年6月5日 下午6:36:18 
 * @version V1.0 
 

 */
public class MerchantSettlementBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String merchantId;
    
    private String merchantName;
    
    private String logId;

    private String userId;

    private String type;

    private String state;

    private String settlementType;

    private String cycle;

    private String rate;

    private String rateCycle;

    private String contactName;

    private String contactTel;

    private String contactEmail;

    private String feeInOut;

    private String settleCycleType;

    private Long settleMinAmount;

    private Integer settleMaxCycle;

    private String settleByFestv;
    private String creator;

    private String updator;
    private String reviewState;                     //审核状态(0待审核,1审核通过 2驳回 3 不通过)
    private String reviewLog;                    //审核记录
    private String isSettle;                     //是否二清清算（0-否，1-是）
    private String isMatch;                    //是否二清对账（0-否，1-是）
    private String merchantLevel;           //商户级别
    private List<MerchantSettlementConf> MerchantSettlementConfLst;
    private MerchantBank merchantBank;
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType == null ? null : settlementType.trim();
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle == null ? null : cycle.trim();
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    public String getRateCycle() {
        return rateCycle;
    }

    public void setRateCycle(String rateCycle) {
        this.rateCycle = rateCycle == null ? null : rateCycle.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }


    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    public String getFeeInOut() {
        return feeInOut;
    }

    public void setFeeInOut(String feeInOut) {
        this.feeInOut = feeInOut == null ? null : feeInOut.trim();
    }

    public String getSettleCycleType() {
        return settleCycleType;
    }

    public void setSettleCycleType(String settleCycleType) {
        this.settleCycleType = settleCycleType == null ? null : settleCycleType.trim();
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
        this.settleByFestv = settleByFestv == null ? null : settleByFestv.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }


    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    public List<MerchantSettlementConf> getMerchantSettlementConfLst() {
        return MerchantSettlementConfLst;
    }

    public void setMerchantSettlementConfLst(List<MerchantSettlementConf> merchantSettlementConfLst) {
        MerchantSettlementConfLst = merchantSettlementConfLst;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public MerchantBank getMerchantBank() {
        return merchantBank;
    }

    public void setMerchantBank(MerchantBank merchantBank) {
        this.merchantBank = merchantBank;
    }

    public String getReviewState() {
        return reviewState;
    }

    public void setReviewState(String reviewState) {
        this.reviewState = reviewState;
    }

    public String getReviewLog() {
        return reviewLog;
    }

    public void setReviewLog(String reviewLog) {
        this.reviewLog = reviewLog;
    }

    public String getIsSettle() {
        return isSettle;
    }

    public void setIsSettle(String isSettle) {
        this.isSettle = isSettle;
    }

    public String getIsMatch() {
        return isMatch;
    }

    public void setIsMatch(String isMatch) {
        this.isMatch = isMatch;
    }

    public String getMerchantLevel() {
        return merchantLevel;
    }

    public void setMerchantLevel(String merchantLevel) {
        this.merchantLevel = merchantLevel;
    }
}
