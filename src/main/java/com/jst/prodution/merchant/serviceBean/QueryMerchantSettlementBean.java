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

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.merchant.serviceBean  
 * @ClassName: QueryMerchantSettlementBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年4月10日 下午2:29:14 
 * @version V1.0 
 

 */
public class QueryMerchantSettlementBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String logId;                       //记录ID
    private String userId;                      //商户ID
    private String type;                        //类型：1结算
    private String state;                       //状态：1 正在使用 2未使用
    private String settlementType;              //结算类型 2-结算到余额(人工结算),1-结算到银行卡(自动结算到银行卡)
    private String cycle;                       //结算周期
    private String rate;                        //结算费率
    private String rateCycle;                   //结算费率周期
    private String contactName;                 //结算联系人姓名
    private String contactTel;                  //结算联系人电话
    private String contactEmail;                //结算联系人邮箱
    private String creator;                     //申请人
    private String createTime;                  //申请时间
    private String updator;                     //修改人
    private String updateTime;                  //修改时间
    
     private String feeInOut;                    //交易内/外计费标志01-交易内结算，02--交易外结算
     private String settleCycleType;    //结算方式 'N:T+N,W:周结,M:月结,HM:半月结

     private Long settleMinAmount;   //'结算起始金额'

     private Integer settleMaxCycle;//结算最长周期

     private String settleByFestv;   //是否跨节假日，Y-是,N-否
     private String payChannelId;//支付渠道
    public String getLogId() {
        return logId;
    }
    public void setLogId(String logId) {
        this.logId = logId;
    }
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
    public String getRate() {
        return rate;
    }
    public void setRate(String rate) {
        this.rate = rate;
    }
    public String getRateCycle() {
        return rateCycle;
    }
    public void setRateCycle(String rateCycle) {
        this.rateCycle = rateCycle;
    }
    public String getContactName() {
        return contactName;
    }
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    public String getContactTel() {
        return contactTel;
    }
    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }
    public String getContactEmail() {
        return contactEmail;
    }
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getUpdator() {
        return updator;
    }
    public void setUpdator(String updator) {
        this.updator = updator;
    }
    public String getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
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
