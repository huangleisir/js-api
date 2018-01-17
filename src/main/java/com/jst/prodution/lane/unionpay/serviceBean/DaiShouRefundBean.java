package com.jst.prodution.lane.unionpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 银联-代收-退货bean
 * @author pengyuanjun
 * @date 2017-11-20
 */
public class DaiShouRefundBean extends BaseBean {
	private static final long serialVersionUID = 2737591917607884002L;
	/**
	 * 商品订单号
	 */
	private String orderId;
	/**
	 * 交易时间
	 */
	private String tradeTime;
	/**
	 * 退款金额
	 */
	private int money;
	/**
	 * 原消费交易返回的的queryId，可以从消费交易后台通知接口中或者交易状态查询接口中获取
	 */
	private String origQryId;

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

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getOrigQryId() {
		return origQryId;
	}

	public void setOrigQryId(String origQryId) {
		this.origQryId = origQryId;
	}
}
