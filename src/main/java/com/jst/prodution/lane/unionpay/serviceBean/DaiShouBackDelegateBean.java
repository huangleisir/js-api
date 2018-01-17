package com.jst.prodution.lane.unionpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * @desc 银联-代收-后台委托bean
 * @author pengyuanjun
 * @date 2017-11-20
 */
public class DaiShouBackDelegateBean extends BaseBean {
	private static final long serialVersionUID = 3896585605052286024L;
	/**
	 * 商户订单号
	 */
	private String orderId;
	/**
	 * 交易时间
	 */
	private String tradeTime;
	/**
	 * 身份证号
	 */
	private String certifId;
	/**
	 * 真实姓名
	 */
	private String fullName;
	/**
	 * 手机号码
	 */
	private String phoneNo;
	/**
	 * cvn2码
	 */
	private String cvn2;
	/**
	 * 过期时间
	 */
	private String expired;
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

	public String getCertifId() {
		return certifId;
	}

	public void setCertifId(String certifId) {
		this.certifId = certifId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCvn2() {
		return cvn2;
	}

	public void setCvn2(String cvn2) {
		this.cvn2 = cvn2;
	}

	public String getExpired() {
		return expired;
	}

	public void setExpired(String expired) {
		this.expired = expired;
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
