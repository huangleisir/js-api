package com.jst.prodution.upay.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class UpayBarCodePayNotifyBean extends BaseBean {

	private static final long serialVersionUID = 7576023761966702431L;
	/**
	 * 支付流水
	 */
	private String payNo;					//支付流水
	/**
	 * 支付状态
	 */
	private String status;					//支付状态
	/**
	 * 支付渠道
	 */
	private String payChannelId;			//支付渠道
	/**
	 * 二级支付渠道
	 */
	private String payChannelCode;         //二级支付渠道
	/**
	 * 业务处理成功失败标识
	 */
	private boolean flag ;           		//业务处理成功失败标识，2017-12-13起废弃，不用该字段标识
	/**
	 * 支付渠道流水号(微信、支付宝)
	 */
    private String externTransactionId;		//支付渠道流水号(微信、支付宝) 
    /**
     * 支付成功时间
     */
    private Date paySuccessTime;          //支付成功时间
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPayChannelId() {
		return payChannelId;
	}
	public void setPayChannelId(String payChannelId) {
		this.payChannelId = payChannelId;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getExternTransactionId() {
		return externTransactionId;
	}
	public void setExternTransactionId(String externTransactionId) {
		this.externTransactionId = externTransactionId;
	}
    public String getPayChannelCode() {
        return payChannelCode;
    }
    public void setPayChannelCode(String payChannelCode) {
        this.payChannelCode = payChannelCode;
    }
    public Date getPaySuccessTime() {
        return paySuccessTime;
    }
    public void setPaySuccessTime(Date paySuccessTime) {
        this.paySuccessTime = paySuccessTime;
    }

}
