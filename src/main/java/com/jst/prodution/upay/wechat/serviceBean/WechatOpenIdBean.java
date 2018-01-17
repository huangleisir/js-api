package com.jst.prodution.upay.wechat.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
/**
 * 
 * @Package: com.jst.prodution.upay.wechat.serviceBean
 * @ClassName: WechatOpenIdBean.java
 *
 * @author: ningxuzhou
 * @date: 2018年1月16日 下午2:15:09 
 * @version: V1.0
 *
 */
public class WechatOpenIdBean extends BaseBean {

    private static final long serialVersionUID = 1L;
    
    private String userId;

    private String openId;

    private String jstAppId;

    private String jstMchId;

    private String appId;

    private String mchId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getJstAppId() {
        return jstAppId;
    }

    public void setJstAppId(String jstAppId) {
        this.jstAppId = jstAppId;
    }

    public String getJstMchId() {
        return jstMchId;
    }

    public void setJstMchId(String jstMchId) {
        this.jstMchId = jstMchId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

}
