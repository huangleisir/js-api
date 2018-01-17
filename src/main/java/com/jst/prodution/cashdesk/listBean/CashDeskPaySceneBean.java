package com.jst.prodution.cashdesk.listBean;

import com.jst.prodution.base.bean.BaseBean;

public class CashDeskPaySceneBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;

	private String sceneCode;

    private String sceneName;

    private String sceneTypeName;

    private String sceneTypeCode;

    private String channelName;

    private String channelCode;

    private String operSceneName;

    private String operSceneCode;

    private String sceneProduct;

    private String isFreePassword;

    private Integer state;

    public String getSceneCode() {
        return sceneCode;
    }

    public void setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode == null ? null : sceneCode.trim();
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName == null ? null : sceneName.trim();
    }

    public String getSceneTypeName() {
        return sceneTypeName;
    }

    public void setSceneTypeName(String sceneTypeName) {
        this.sceneTypeName = sceneTypeName == null ? null : sceneTypeName.trim();
    }

    public String getSceneTypeCode() {
        return sceneTypeCode;
    }

    public void setSceneTypeCode(String sceneTypeCode) {
        this.sceneTypeCode = sceneTypeCode == null ? null : sceneTypeCode.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getOperSceneName() {
        return operSceneName;
    }

    public void setOperSceneName(String operSceneName) {
        this.operSceneName = operSceneName == null ? null : operSceneName.trim();
    }

    public String getOperSceneCode() {
        return operSceneCode;
    }

    public void setOperSceneCode(String operSceneCode) {
        this.operSceneCode = operSceneCode == null ? null : operSceneCode.trim();
    }

    public String getSceneProduct() {
        return sceneProduct;
    }

    public void setSceneProduct(String sceneProduct) {
        this.sceneProduct = sceneProduct == null ? null : sceneProduct.trim();
    }

    public String getIsFreePassword() {
        return isFreePassword;
    }

    public void setIsFreePassword(String isFreePassword) {
        this.isFreePassword = isFreePassword == null ? null : isFreePassword.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
