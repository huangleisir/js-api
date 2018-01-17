/**
 * author:汤广海
 * 2016年11月1日
 * 下午3:30:24
 */
package com.jst.prodution.lanefront.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @author Administrator
 *
 */
public class ChannelRouterQueryBean extends BaseBean {

	/**
	 * 通道路由查询
	 */
	private static final long serialVersionUID = 1L;
	private String bankCardNo;// 银行卡号
	private String userId;// 用户标识
	/**
	 * 
	 * 发短信标志（1-通道发送短信，2-平台发送短信，3-不需要发送短信，代扣发送短信规则由此配置）；默认3
	 */
	private String smsFlag;
	
	public static final String SMS_FLAG_CHANNEL = "1";

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSmsFlag() {
		return smsFlag;
	}

	public void setSmsFlag(String smsFlag) {
		this.smsFlag = smsFlag;
	}

}
