package com.jst.prodution.lane.cmbpay.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
 * @Package: com.jst.prodution.lane.cmbpay.serviceBean
 * @ClassName: LaneCMBPayBean.java
 * @Description: 招行一网通支付bean
 *
 * @author: wanghuai
 * @date: 2018年1月17日 上午11:40:39 
 * @version: V1.0
 *
 */
public class LaneCMBPayBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 订单创建时间 : yyyyMMddHHmmss
	 */
	private String createTime;   	//订单创建时间-yyyyMMddHHmmss
	/**
	 * 磐石支付流水号
	 */
	private String payNo;			//磐石支付流水号
	/**
	 * 订单金额
	 */
	private String totalAmount;		//订单金额
	/**
	 * 客户协议号
	 */
	private String agrNo;			//客户协议号
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getAgrNo() {
		return agrNo;
	}
	public void setAgrNo(String agrNo) {
		this.agrNo = agrNo;
	}
	
}
