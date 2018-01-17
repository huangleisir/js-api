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

/** 
 * 
 * @Package: com.jst.prodution.merchant.serviceBean  
 * @ClassName: MerchantSettlementListBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年6月6日 下午4:25:23 
 * @version V1.0 
 

 */
public class MerchantSettlementListBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String merchantId;//商户号
    
    private String merchantName;//商户名称
    
    private String settleCycleType;//结算方式
    private String settlementType;//结算类型1--结算到银行卡(自动提现)2--结算到余额(人工提现)
    private String payChannel;      //支付机构
    private String reviewState;                     //审核状态(0待审核,1审核通过 2驳回 3 不通过)
    private String reviewLog;                    //审核记录
    private String isSettle;                     //是否二清清算（0-否，1-是）
    private String isMatch;                    //是否二清对账（0-否，1-是）
    private String merchantLevel;           //商户级别
    private List<MerchantSettlementBean> listBean;

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

    public String getSettleCycleType() {
        return settleCycleType;
    }

    public void setSettleCycleType(String settleCycleType) {
        this.settleCycleType = settleCycleType;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public List<MerchantSettlementBean> getListBean() {
        return listBean;
    }

    public void setListBean(List<MerchantSettlementBean> listBean) {
        this.listBean = listBean;
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
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
