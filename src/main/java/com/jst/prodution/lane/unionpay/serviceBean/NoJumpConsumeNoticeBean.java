package com.jst.prodution.lane.unionpay.serviceBean;

import java.util.Map;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 银联无跳转-消费通知bean
 * @author pengyuanjun
 *
 */
public class NoJumpConsumeNoticeBean extends BaseBean {

	private static final long serialVersionUID = 6060797374816591955L;
	/**
	 * 银联无跳转-消费回调通知参数
	 */
	private Map<String, String> noticeMap;
	/**
	 * 商户订单号
	 */
	private String orderId;
	/**
	 * 银联消费流水号
	 */
	private String tradeSerialNo;
	/**
	 * token
	 */
	private String token;
	/**
	 * 状态 0成功 1失败
	 */
	private int status;

	public Map<String, String> getNoticeMap() {
		return noticeMap;
	}
	public void setNoticeMap(Map<String, String> noticeMap) {
		this.noticeMap = noticeMap;
	}

	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getTradeSerialNo() {
		return tradeSerialNo;
	}
	public void setTradeSerialNo(String tradeSerialNo) {
		this.tradeSerialNo = tradeSerialNo;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
