package com.jst.prodution.cashdesk.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.cashdesk.listBean.CashDeskPaySceneBean;

public class CashDeskPaySceneListBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;

	private String sceneCode;//场景码

    //private String sceneName;//场景名称

    //private String sceneTypeName;//场景类名称

    private String sceneTypeCode;//场景类编码(01:消费)

    //private String channelName;//渠道名称

    private String channelCode;//渠道编码(01:app)

    //private String operSceneName;//操作场景名称

    private String operSceneCode;//操作场景码(01:充值，02:支付)

    private String sceneProduct;//0-关闭，1-开通，第一位是余额，第二位是借记卡，第三位是贷记卡，第四位是捷顺通卡

    private String isFreePassword;//是否支持免密

    private Integer state;//0-启用，1-禁用
    
	private List<CashDeskPaySceneBean> cashDeskPaySceneBeanList;

	public String getSceneCode() {
		return sceneCode;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSceneTypeCode() {
		return sceneTypeCode;
	}

	public void setSceneTypeCode(String sceneTypeCode) {
		this.sceneTypeCode = sceneTypeCode;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getOperSceneCode() {
		return operSceneCode;
	}

	public void setOperSceneCode(String operSceneCode) {
		this.operSceneCode = operSceneCode;
	}

	public String getSceneProduct() {
		return sceneProduct;
	}

	public void setSceneProduct(String sceneProduct) {
		this.sceneProduct = sceneProduct;
	}

	public String getIsFreePassword() {
		return isFreePassword;
	}

	public void setIsFreePassword(String isFreePassword) {
		this.isFreePassword = isFreePassword;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public List<CashDeskPaySceneBean> getCashDeskPaySceneBeanList() {
		return cashDeskPaySceneBeanList;
	}

	public void setCashDeskPaySceneBeanList(
			List<CashDeskPaySceneBean> cashDeskPaySceneBeanList) {
		this.cashDeskPaySceneBeanList = cashDeskPaySceneBeanList;
	}


}