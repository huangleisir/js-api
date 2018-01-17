package com.jst.prodution.tran.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class TranCoreQRResUpdateBean extends BaseBean {
	
    private static final long serialVersionUID = 1L;

    private String busNo;   //内部订单号            必输

    private String state;    //状态 0-成功，1-待处理，2-处理中，3-失败,4,已退款5,已过期   必输
    
    private String merchantExtenalNo;     //外部订单号  必输
    
	private String payChannelId		;//(添加字段)支付渠道号 WeChat:微信，Alipay：支付宝，JYF：捷易付

//    private String busType; //交易类型    1-普通扫码，2-超级扫码       必输

    private Integer tranFee;  //手续费            可输

    private Integer tranDate; //交易日期          可输

    private Date tranTime;    //交易时间         可输

    private String appId;     //账号id    可输

    private String sceneCode; //场景码       输出

    private String remark;                  //备注   可输

    private String updateUser;				//可输

    private Date updateTime;				//可输

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getTranFee() {
		return tranFee;
	}

	public void setTranFee(Integer tranFee) {
		this.tranFee = tranFee;
	}

	public Integer getTranDate() {
		return tranDate;
	}

	public void setTranDate(Integer tranDate) {
		this.tranDate = tranDate;
	}

	public Date getTranTime() {
		return tranTime;
	}

	public void setTranTime(Date tranTime) {
		this.tranTime = tranTime;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getMerchantExtenalNo() {
		return merchantExtenalNo;
	}

	public void setMerchantExtenalNo(String merchantExtenalNo) {
		this.merchantExtenalNo = merchantExtenalNo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getSceneCode() {
		return sceneCode;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getPayChannelId() {
		return payChannelId;
	}

	public void setPayChannelId(String payChannelId) {
		this.payChannelId = payChannelId;
	}
    
}
