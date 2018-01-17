package com.jst.prodution.payment.model;

/**
 * 审核配置
 * @author Administrator
 *
 */
public class ReviewConfig implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	private String configId;		//配置ID
	private String payType;  		//提现类型：01-个人提现 02-商户提现 03-理财回款 04-信贷放款 05-人工出款 06-收入出款 07-其他出款
	private String reviewLevel;		//审核层次：01一审 02二审 03不审
	private Long reviewAmount;		//审核金额
	private String sysPayFlag;		//是否系统出款：Y是 N否
	
	public String getConfigId() {
		return configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getReviewLevel() {
		return reviewLevel;
	}
	public void setReviewLevel(String reviewLevel) {
		this.reviewLevel = reviewLevel;
	}
	public Long getReviewAmount() {
		return reviewAmount;
	}
	public void setReviewAmount(Long reviewAmount) {
		this.reviewAmount = reviewAmount;
	}
	public String getSysPayFlag() {
		return sysPayFlag;
	}
	public void setSysPayFlag(String sysPayFlag) {
		this.sysPayFlag = sysPayFlag;
	}

}
