package com.jst.prodution.lane.unionpay.serviceBean;

import java.util.Map;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 银联-代收-解除委托bean
 * @author pengyuanjun
 * @date 2017-11-20
 */
public class DaiShouDeleteDelegateBean extends BaseBean {

	private static final long serialVersionUID = 7824132986542858507L;
	/**
	 * 商户订单号
	 */
	private String orderId;
	/**
	 * 交易时间
	 */
	private String tradeTime;
	/**
	 * 卡号
	 */
	private String accNo;

	/**
	 * 状态 0成功 1失败
	 */
	private int status;

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

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
