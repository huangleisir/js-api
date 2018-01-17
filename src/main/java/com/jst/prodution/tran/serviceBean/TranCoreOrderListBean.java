package com.jst.prodution.tran.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 
 * @ClassName:  TranCoreConsumOrderListBean   
 * @Description:交易订单列表（充值，退款，消费）
 * @author: fxp  
 * @date:   2017年3月23日 下午8:00:19   
 *
 */
public class TranCoreOrderListBean extends BaseBean {
    private static final long serialVersionUID = 1L;
    
    private String userId;  //用户ID 必填
    
    private String orderType;  //订单类型  01：充值 ，02：消费，03：退款      10 全部  必填

    private String orderName;  //订单名称

    private String tranAmount;  //交易金额

    private String tranTime;  //交易时间

    private String state ; //订单状态
    
    private String token ; //token名称
    
    private String busNo ; //交易流水

    private String merchantIds ; //(消费订单)商户号，多个用","隔开
 
    private String merchantId ; //商户号

    private List<TranCoreOrderListBean> tranOrderList;  //交易账单列表

    
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getTranAmount() {
		return tranAmount;
	}

	public void setTranAmount(String tranAmount) {
		this.tranAmount = tranAmount;
	}

	public String getTranTime() {
		return tranTime;
	}

	public void setTranTime(String tranTime) {
		this.tranTime = tranTime;
	}

	public List<TranCoreOrderListBean> getTranOrderList() {
		return tranOrderList;
	}

	public void setTranOrderList(List<TranCoreOrderListBean> tranOrderList) {
		this.tranOrderList = tranOrderList;
	}
	
	public String getMerchantIds() {
		return merchantIds;
	}

	public void setMerchantIds(String merchantIds) {
		this.merchantIds = merchantIds;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	
}
