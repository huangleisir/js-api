package com.jst.prodution.tran.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class TranPayWayQueryListBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	 private String payId; //支付渠道表主键

    private String busNo;  //支付订单流水号

    private String payStatus;  //支付状态 0-成功，1-待处理，2-处理中，3-失败,5,已过期
    
	private String[] payStatusArray;//0-成功，1-待处理，2-处理中，3-失败,4,已退款5,已过期

    private String payWay; //支付渠道号:1，WeChat:微信，2，Alipay：支付宝，3，JYF：捷易付

    private String payCerNo; //支付凭证号

    private String payCerNoMark;//支付凭证号备注

    private Long payAmount; //支付金额

    private String remark;   //备注

    private String createUser;

    private String updateUser;

    private Date createTime;

    private Date updateTime;
    
	private String isByPage;// 是否分页 Y , N

    private List<TranPayWayQueryListBean> tranPayWayBeanList;

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getPayWay() {
		return payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public String getPayCerNo() {
		return payCerNo;
	}

	public void setPayCerNo(String payCerNo) {
		this.payCerNo = payCerNo;
	}

	public String getPayCerNoMark() {
		return payCerNoMark;
	}

	public void setPayCerNoMark(String payCerNoMark) {
		this.payCerNoMark = payCerNoMark;
	}

	public Long getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getIsByPage() {
		return isByPage;
	}

	public void setIsByPage(String isByPage) {
		this.isByPage = isByPage;
	}

	public String[] getPayStatusArray() {
		return payStatusArray;
	}

	public void setPayStatusArray(String[] payStatusArray) {
		this.payStatusArray = payStatusArray;
	}

	public List<TranPayWayQueryListBean> getTranPayWayBeanList() {
		return tranPayWayBeanList;
	}

	public void setTranPayWayBeanList(List<TranPayWayQueryListBean> tranPayWayBeanList) {
		this.tranPayWayBeanList = tranPayWayBeanList;
	}

}
