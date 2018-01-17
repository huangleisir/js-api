package com.jst.prodution.paycore.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

/**
 *@description:
 *@author  widon
 *@date: 2017年10月17日 下午2:23:16
 *@since: JDK 1.8
 *@version:V1.0.0
 */
public class PayCorePayOrderResUpdateBean extends BaseBean {
    private String payNo;       //支付流水号
    private String busNo;        //交易流水号   ,必输
    private Integer payStatus;   //支付状态
    private String payChannelId;// 支付渠道id   ,必输
    private String payType;     // 支付模式      ,微信支付宝需要回传
    private Long   totalAmount;    //订单金额(通道实际支付金额)   
    private String externTransactionId;   //支付宝，微信交易流水号  块钱的交易流水号为ref_num
    private String orderType;    //订单业务类型
    private String remark;  //备注  ，用于银联失败回调时，记录失败原因
    private Date paySuccessTime;  //支付成功时间

    
    
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getOrderType() {
        return orderType;
    }
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
    public String getExternTransactionId() {
        return externTransactionId;
    }
    public void setExternTransactionId(String externTransactionId) {
        this.externTransactionId = externTransactionId;
    }
    
    public String getPayNo() {
        return payNo;
    }
    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }
    public String getBusNo() {
        return busNo;
    }
    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }
    public Integer getPayStatus() {
        return payStatus;
    }
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
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
    public Long getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }
	public Date getPaySuccessTime() {
		return paySuccessTime;
	}
	public void setPaySuccessTime(Date paySuccessTime) {
		this.paySuccessTime = paySuccessTime;
	}

}
