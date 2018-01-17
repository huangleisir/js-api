package com.jst.prodution.lane.cmbpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
* @ClassName: LaneCCBRefundBean 
* @Description: TODO(对外暴露一网通退款bean) 
* @author zcb
* @date 2018年1月16日 上午10:19:58 
*
 */
public class LaneCMBRefundBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	/*入参*/
	private String orderNo;					//M-商户订单号，支付时的订单号
	private String refundSerialNo;			//O-退款流水号
	private Long amount;					//M-退款金额(单位分)
	private String date;					//M-商户订单日期，支付时的订单日期格式：yyyyMMdd
	private String refundDateTime;			//M-退款时间 
	private String desc;					//O-退款描述	

	/*出参*/
	private String dateTime;				//M-响应时间,银行返回该数据的时间，精确到秒格式：yyyyMMddHHmmss
	private String bankSerialNo;			//M-银行的退款流水号
	private String refundRefNo;				//M-银行的退款参考号
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getRefundDateTime() {
		return refundDateTime;
	}

	public void setRefundDateTime(String refundDateTime) {
		this.refundDateTime = refundDateTime;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getBankSerialNo() {
		return bankSerialNo;
	}

	public void setBankSerialNo(String bankSerialNo) {
		this.bankSerialNo = bankSerialNo;
	}

	public String getRefundRefNo() {
		return refundRefNo;
	}

	public void setRefundRefNo(String refundRefNo) {
		this.refundRefNo = refundRefNo;
	}

	public String getRefundSerialNo() {
		return refundSerialNo;
	}

	public void setRefundSerialNo(String refundSerialNo) {
		this.refundSerialNo = refundSerialNo;
	}
}
