package com.jst.prodution.paycore.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 *@description:支付核心退款Bean
 *@author  widon
 *@date: 2017年10月25日 下午8:08:22
 *@since: JDK 1.8
 *@version:V1.0.0
 */
public class PayCoreRefundBean extends BaseBean {
    private String busRefundNo;             //交易系统退款流水号   , 系统自动退款无
    private String busNo;                   //交易系统支付流水号    ,必输
    private String payNo;                   //磐石(支付核心)支付流水号  ,必输
    private String mchRefundId;             //商户退款单号
    private String mchOrderId;              //商户支付订单号   ,必输

    private Long refundAmount;              //退款金额  ,必输
    private Long totalAmount;              //原订单总金额  ,必输
    private String payChannelId;           //支付渠道  ,必输
    private String payType;                //支付类型 
    private String description;            //退款描述
    private String refundFrom;             //退款发起源  0-B门户,1-商户后台(app),2-OMS,3-系统自动退款  ,必输          
    
    
    /**
     * 输出
     */
    private String refundNo;                //磐石(支付核心)退款流水号
    private String orderState;              //退款订单状态
    
    
    
    
    
    public String getMchRefundId() {
        return mchRefundId;
    }

    public void setMchRefundId(String mchRefundId) {
        this.mchRefundId = mchRefundId;
    }

    public String getMchOrderId() {
        return mchOrderId;
    }

    public void setMchOrderId(String mchOrderId) {
        this.mchOrderId = mchOrderId;
    }

    public String getRefundFrom() {
        return refundFrom;
    }

    public void setRefundFrom(String refundFrom) {
        this.refundFrom = refundFrom;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPayChannelId() {
        return payChannelId;
    }

    public void setPayChannelId(String payChannelId) {
        this.payChannelId = payChannelId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBusRefundNo() {
        return busRefundNo;
    }

    public void setBusRefundNo(String busRefundNo) {
        this.busRefundNo = busRefundNo;
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }
    
    
    
    

}
