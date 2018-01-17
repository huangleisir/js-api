package com.jst.prodution.payment.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 付款中心付款回调bean
 * @author Administrator
 *
 */
public class PayOrderCallBackBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String payOrderNo;			//付款中心订单号
	private String laneOrderNo;			//付款通道流水号
	private String bankBusNo;			//银行回执流水号
	private Date payTime;				//付款时间
	private String payState;			//付款状态：Y成功 N失败
	private String mark;				//备注
	
	public String getPayOrderNo() {
		return payOrderNo;
	}
	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}
	public String getLaneOrderNo() {
		return laneOrderNo;
	}
	public void setLaneOrderNo(String laneOrderNo) {
		this.laneOrderNo = laneOrderNo;
	}
	public String getBankBusNo() {
		return bankBusNo;
	}
	public void setBankBusNo(String bankBusNo) {
		this.bankBusNo = bankBusNo;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public String getPayState() {
		return payState;
	}
	public void setPayState(String payState) {
		this.payState = payState;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
}
