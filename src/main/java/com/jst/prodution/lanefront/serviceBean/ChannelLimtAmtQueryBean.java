package com.jst.prodution.lanefront.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 通道限额查询
 * 
 * @author
 *
 */
public class ChannelLimtAmtQueryBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String bankCardNo;// 银行卡号
	private String userId;// 用户标识
	private String bankCode;// 银行编码
	private String channelCodeChild;// 子通道编号
	private String channelCodeParent;// 父通道编号
	private String channelDesc;// 通道描述
	private Integer singleAmountMax;// 单笔交易额度上限
	private Integer singleAmountMin;// 单笔交易额度下限
	private Integer dayAmountMax;// 单日交易额度上限
	private String payType;// 支付类型
	private String bankName;// 银行名称
	private List<ChannelLimtAmtQueryBean> channelLimtAmtQueryBeanList;// 查询结果

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

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getChannelCodeChild() {
		return channelCodeChild;
	}

	public void setChannelCodeChild(String channelCodeChild) {
		this.channelCodeChild = channelCodeChild;
	}

	public String getChannelCodeParent() {
		return channelCodeParent;
	}

	public void setChannelCodeParent(String channelCodeParent) {
		this.channelCodeParent = channelCodeParent;
	}

	public String getChannelDesc() {
		return channelDesc;
	}

	public void setChannelDesc(String channelDesc) {
		this.channelDesc = channelDesc;
	}

	public Integer getSingleAmountMax() {
		return singleAmountMax;
	}

	public void setSingleAmountMax(Integer singleAmountMax) {
		this.singleAmountMax = singleAmountMax;
	}

	public Integer getSingleAmountMin() {
		return singleAmountMin;
	}

	public void setSingleAmountMin(Integer singleAmountMin) {
		this.singleAmountMin = singleAmountMin;
	}

	public Integer getDayAmountMax() {
		return dayAmountMax;
	}

	public void setDayAmountMax(Integer dayAmountMax) {
		this.dayAmountMax = dayAmountMax;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public List<ChannelLimtAmtQueryBean> getChannelLimtAmtQueryBeanList() {
		return channelLimtAmtQueryBeanList;
	}

	public void setChannelLimtAmtQueryBeanList(List<ChannelLimtAmtQueryBean> channelLimtAmtQueryBeanList) {
		this.channelLimtAmtQueryBeanList = channelLimtAmtQueryBeanList;
	}

}
