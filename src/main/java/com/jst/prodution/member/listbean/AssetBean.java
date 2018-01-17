package com.jst.prodution.member.listbean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 用户资产信息
 * @author 吴安辉
 *
 */
public class AssetBean  extends BaseBean{

	private static final long serialVersionUID = 1L;
	private String payType; 			//01-余额户，02-借记卡(快捷)，03-贷记卡(快捷)，04-捷顺通卡
	private String acctType;			//01余额户时查询的账户类型（01基本户/余额户   02待结算户）
	private String payCardNo;			//若是卡位卡凭证号(银行卡号)，若是积分或者余额则为内部虚拟账户
	private String mechanismCode;		//卡所属机构号
	private String mechanismName;		//卡所属机构名称
	private Long amount;				//余额
	private Long freeAmount;				//可用余额
	private String priority;			//优先级
	private String imagePath;			// 图片路径
//	private Integer amountSingleLimit;   // 单次限额
//	private Integer amountDayLimit;		// 单日限额
//	private String channelCodeChild;// 子通道编号
//	private String channelCodeParent;// 父通道编号
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
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
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public Long getFreeAmount() {
		return freeAmount;
	}
	public void setFreeAmount(Long freeAmount) {
		this.freeAmount = freeAmount;
	}
	
//	public Integer getAmountSingleLimit() {
//		return amountSingleLimit;
//	}
//	public void setAmountSingleLimit(Integer amountSingleLimit) {
//		this.amountSingleLimit = amountSingleLimit;
//	}
//	public Integer getAmountDayLimit() {
//		return amountDayLimit;
//	}
//	public void setAmountDayLimit(Integer amountDayLimit) {
//		this.amountDayLimit = amountDayLimit;
//	}
//	public String getChannelCodeParent() {
//		return channelCodeParent;
//	}
//	public void setChannelCodeParent(String channelCodeParent) {
//		this.channelCodeParent = channelCodeParent;
//	}
}
