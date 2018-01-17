package com.jst.prodution.lane.unionpay.serviceBean;

import java.util.Map;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 银联无跳转-退货通知bean
 * @author pengyuanjun
 */
public class NoJumpRefundNoticeBean extends BaseBean {

	private static final long serialVersionUID = 6672254010633104836L;

	/**
	 * 银联-无跳转-退货回调通知参数
	 */
	private Map<String, String> noticeMap;
	/**
	 * 查询流水号[由银联返回，用于在后续类交易中唯一标识一笔交易]
	 */
	private String queryId;
	/**
	 * 原交易查询流水号[原始消费交易的queryId]
	 */
	private String origQryId;
	/**
	 * 退款状态[0成功 1失败]
	 */
	private int status;

	public String getQueryId() {
		return queryId;
	}

	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}

	public String getOrigQryId() {
		return origQryId;
	}

	public void setOrigQryId(String origQryId) {
		this.origQryId = origQryId;
	}

	public Map<String, String> getNoticeMap() {
		return noticeMap;
	}

	public void setNoticeMap(Map<String, String> noticeMap) {
		this.noticeMap = noticeMap;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
