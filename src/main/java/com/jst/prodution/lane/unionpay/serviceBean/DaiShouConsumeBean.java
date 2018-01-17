package com.jst.prodution.lane.unionpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 银联-代收-消费bean
 * @author pengyuanjun
 * @date 2017-11-20
 */
public class DaiShouConsumeBean extends BaseBean {
	private static final long serialVersionUID = -6314905222355139281L;
	/**
	 * 商户订单号
	 */
	private String orderId;
	/**
	 * 交易时间
	 */
	private String tradeTime;
	/**
	 * 金额(单位分,不要带小数点)
	 */
	private int money;
	/**
	 * 卡号
	 */
	private String accNo;
	/**
	 * 交易状态(响应输出): 0交易已受理   1交易状态未确定(通过查询来确定)  2交易失败
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

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
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
