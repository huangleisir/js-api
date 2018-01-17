package com.jst.prodution.payment.model;

/**
 * 提现通道配置
 * @author Administrator
 *
 */
public class LaneConfig implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer configId;
	private String payType;
	private String payLane;
	private Long payAmount;
	
	public Integer getConfigId() {
		return configId;
	}
	public void setConfigId(Integer configId) {
		this.configId = configId;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getPayLane() {
		return payLane;
	}
	public void setPayLane(String payLane) {
		this.payLane = payLane;
	}
	public Long getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}
	
}
