package com.jst.prodution.lane.unionpay.serviceBean;

import java.util.Map;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 银联无跳转开通通知bean
 * @author pengyuanjun
 *
 */
public class NoJumpOpenNoticeBean extends BaseBean {
	private static final long serialVersionUID = 3247927141465020822L;

	/**
	 * 银联无跳转-开通回调通知参数
	 */
	private Map<String, String> noticeMap;

	/**
	 * 银联token
	 */
	private String token;
	/**
	 * token开始时间
	 */
	private String tokenBegin;
	/**
	 * token结束时间
	 */
	private String tokenEnd;

	public Map<String, String> getNoticeMap() {
		return noticeMap;
	}

	public void setNoticeMap(Map<String, String> noticeMap) {
		this.noticeMap = noticeMap;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTokenBegin() {
		return tokenBegin;
	}

	public void setTokenBegin(String tokenBegin) {
		this.tokenBegin = tokenBegin;
	}

	public String getTokenEnd() {
		return tokenEnd;
	}

	public void setTokenEnd(String tokenEnd) {
		this.tokenEnd = tokenEnd;
	}

}
