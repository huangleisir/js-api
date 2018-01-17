package com.jst.prodution.lane.unionpay.serviceBean;

import java.util.Map;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 银联-代收-消费通知bean
 * @author pengyuanjun
 * @date 2017-11-21
 */
public class DaiShouConsumeNoticeBean extends BaseBean {

	private static final long serialVersionUID = 1571046889209581897L;
	/**
	 * 银联-代收-消费通知参数
	 */
	private Map<String, String> noticeMap;
	/**
	 * 商户订单号
	 */
	private String orderId;
	/**
	 * 卡号
	 */
	private String accNo;
	/**
	 * 查询流水号
	 */
	private String queryId;
	/**
	 * 状态
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

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getQueryId() {
		return queryId;
	}

	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
