package com.jst.prodution.lane.unionpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 银联-代收-消费查询bean
 * @author pengyuanjun
 * @date 2017-11-20
 */
public class DaiShouConsumeQueryBean extends BaseBean {

	private static final long serialVersionUID = -5503306142619637605L;

	/**
	 * 商户订单号，每次发交易测试需修改为被查询的交易的订单号
	 */
	private String orderId;
	/**
	 * 订单发送时间，每次发交易测试需修改为被查询的交易的订单发送时间
	 */
	private String tradeTime;
	/**
	 * 交易状态 0交易成功  1订单状态未明  2交易失败
	 */
	private int status;
	/**
	 * 
	 */
	private String tradeSerialNo;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTradeSerialNo() {
		return tradeSerialNo;
	}

	public void setTradeSerialNo(String tradeSerialNo) {
		this.tradeSerialNo = tradeSerialNo;
	}

}
