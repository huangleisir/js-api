package com.jst.prodution.cashdesk.listBean;

import com.jst.prodution.base.bean.BaseBean;

public class CashDeskPayCardBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String payType;//支付方式（01：余额，02：借记卡，03：贷记卡，04：预付卡）（目前不支持组合支付）
	private String payCardNo;// 支付号码
	private String mechanismCode;// 卡所属机构号
	private String mechanismName;// 卡所属机构名称
	private String imagePath;// 图片路径
	private String priority;// 优先级
	private Long amount;//可用额度
	private Integer amountSingleLimit;// 单次限额
	private Integer amountDayLimit;// 单日限额
	private String mainChannelCode;// 主通道编码

	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getPayCardNo() {
		return payCardNo;
	}
	public void setPayCardNo(String payCardNo) {
		this.payCardNo = payCardNo;
	}
	public String getMechanismCode() {
		return mechanismCode;
	}
	public void setMechanismCode(String mechanismCode) {
		this.mechanismCode = mechanismCode;
	}
	public String getMechanismName() {
		return mechanismName;
	}
	public void setMechanismName(String mechanismName) {
		this.mechanismName = mechanismName;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public Integer getAmountSingleLimit() {
		return amountSingleLimit;
	}
	public void setAmountSingleLimit(Integer amountSingleLimit) {
		this.amountSingleLimit = amountSingleLimit;
	}
	public Integer getAmountDayLimit() {
		return amountDayLimit;
	}
	public void setAmountDayLimit(Integer amountDayLimit) {
		this.amountDayLimit = amountDayLimit;
	}
	public String getMainChannelCode() {
		return mainChannelCode;
	}
	public void setMainChannelCode(String mainChannelCode) {
		this.mainChannelCode = mainChannelCode;
	}

}
