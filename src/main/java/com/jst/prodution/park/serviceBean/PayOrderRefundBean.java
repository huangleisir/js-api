/*
* Copyright (c) 2015-2018 SHENZHEN JST SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class PayOrderRefundBean extends BaseBean{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id; // 主键

    private String orderId; // 原平台订单号

    private String orderRefund; // 智慧停车退款订单号

    private String parkpayssn; // 智慧停车支付流水号

    private String parkpayssnRefund; // 原平台退款流水号

    private int amt; // 金额

    private String createTime; // 退款创建时间

    private String successTime; // 退款成功时间

    private String busrefundno; // 统一收银台退款流水号

    private int status; // 0-初始状态，1-退款失败，2-退款中，3-退款成功

    private String version; // 版本号
    
    private int platformType; // 发起退款平台，0：云平台发起退款，1：智慧停车自动退款

    private List<PayOrderRefundBean> refundList;
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderRefund() {
		return orderRefund;
	}

	public void setOrderRefund(String orderRefund) {
		this.orderRefund = orderRefund;
	}

	public String getParkpayssn() {
		return parkpayssn;
	}

	public void setParkpayssn(String parkpayssn) {
		this.parkpayssn = parkpayssn;
	}

	public String getParkpayssnRefund() {
		return parkpayssnRefund;
	}

	public void setParkpayssnRefund(String parkpayssnRefund) {
		this.parkpayssnRefund = parkpayssnRefund;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getSuccessTime() {
		return successTime;
	}

	public void setSuccessTime(String successTime) {
		this.successTime = successTime;
	}

	public String getBusrefundno() {
		return busrefundno;
	}

	public void setBusrefundno(String busrefundno) {
		this.busrefundno = busrefundno;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getPlatformType() {
		return platformType;
	}

	public void setPlatformType(int platformType) {
		this.platformType = platformType;
	}

	public List<PayOrderRefundBean> getRefundList() {
		return refundList;
	}

	public void setRefundList(List<PayOrderRefundBean> refundList) {
		this.refundList = refundList;
	}
	
}
