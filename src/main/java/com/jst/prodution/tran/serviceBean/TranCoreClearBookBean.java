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

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.tran.serviceBean  
 * @ClassName: TranCoreClearBookBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年4月10日 下午1:38:21 
 * @version V1.0 
 

 */
public class TranCoreClearBookBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String payChannelId;//支付渠道
    
    private String clearSeq;   //清算流水

    private Integer clearDate;//清算单生成日期

    private Integer tranDate;//交易日期

    private String tranSeq;//交易流水

    private String tranState;//交易状态0-成功，1-待处理，2-处理中，3-失败,4,已退款5,已过期

    private String tranType;//交易类型'1-支付，2-退款 3-代扣'

    private String merchantId;//商户号

    private String merchantMemberId;//商户ID

    private String merchantName;//商户名称

    private String payMemberId;//支付用户标识

    private String payMemberName;//支付用户名称

    private Long tranAmount;//交易金额

    private String upMerchantId;//上级商户号

    private String upMerchantMemberId;//上级商户ID

    private String upMerchantName;//上级商户名称

    private String clearStatus;//清算单状态（0--待清算，1--清算完成，2--清算失败）

    private Date createdOn;//创建时间

    private Date updatedOn;//更新时间
    
    private String merchantExtenalNo;//外部商户订单号

    public String getPayChannelId() {
        return payChannelId;
    }

    public void setPayChannelId(String payChannelId) {
        this.payChannelId = payChannelId;
    }

    public String getClearSeq() {
        return clearSeq;
    }

    public void setClearSeq(String clearSeq) {
        this.clearSeq = clearSeq == null ? null : clearSeq.trim();
    }

    public Integer getClearDate() {
        return clearDate;
    }

    public void setClearDate(Integer clearDate) {
        this.clearDate = clearDate;
    }

    public Integer getTranDate() {
        return tranDate;
    }

    public void setTranDate(Integer tranDate) {
        this.tranDate = tranDate;
    }

    public String getTranSeq() {
        return tranSeq;
    }

    public void setTranSeq(String tranSeq) {
        this.tranSeq = tranSeq == null ? null : tranSeq.trim();
    }

    public String getTranState() {
        return tranState;
    }

    public void setTranState(String tranState) {
        this.tranState = tranState == null ? null : tranState.trim();
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType == null ? null : tranType.trim();
    }

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

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getPayMemberId() {
        return payMemberId;
    }

    public void setPayMemberId(String payMemberId) {
        this.payMemberId = payMemberId == null ? null : payMemberId.trim();
    }

    public String getPayMemberName() {
        return payMemberName;
    }

    public void setPayMemberName(String payMemberName) {
        this.payMemberName = payMemberName == null ? null : payMemberName.trim();
    }

    public Long getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(Long tranAmount) {
        this.tranAmount = tranAmount;
    }

    public String getUpMerchantId() {
        return upMerchantId;
    }

    public void setUpMerchantId(String upMerchantId) {
        this.upMerchantId = upMerchantId == null ? null : upMerchantId.trim();
    }

    public String getUpMerchantMemberId() {
        return upMerchantMemberId;
    }

    public void setUpMerchantMemberId(String upMerchantMemberId) {
        this.upMerchantMemberId = upMerchantMemberId == null ? null : upMerchantMemberId.trim();
    }

    public String getUpMerchantName() {
        return upMerchantName;
    }

    public void setUpMerchantName(String upMerchantName) {
        this.upMerchantName = upMerchantName == null ? null : upMerchantName.trim();
    }

    public String getClearStatus() {
        return clearStatus;
    }

    public void setClearStatus(String clearStatus) {
        this.clearStatus = clearStatus == null ? null : clearStatus.trim();
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
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
}
