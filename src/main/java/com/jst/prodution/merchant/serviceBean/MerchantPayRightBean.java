/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/

package com.jst.prodution.merchant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.merchant.serviceBean  
 * @ClassName: MerchantPayRightBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年2月23日 上午10:34:23 
 * @version V1.0 
 

 */
public class MerchantPayRightBean extends BaseBean {
    

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String appId;
    private String mchId;// 商户ID
    private String userId; //B会员 用户id
    private String payChannelId;//支付渠道Id  Wechat、Alipay、JFY
    private String payType;// 支付方式 WeChat:APP、JSAPI、NATIVE   Alipay：APP、WAP、JSAPI     JYF：H5
    private String preSeq; //前缀序号
    private String rightFlag;//Y-有权限,N-无权限
    private boolean isQueryPayRight; //true 查询前缀,false 查询前缀和权限
    private String secretKey;//商户密钥

    /**
     * @return the appId
     */
    public String getAppId() {
        return appId;
    }

    /**
     * @param appId the appId to set
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * @return the mchId
     */
    public String getMchId() {
        return mchId;
    }

    /**
     * @param mchId the mchId to set
     */
    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    /**
     * @return the payChannelId
     */
    public String getPayChannelId() {
        return payChannelId;
    }

    /**
     * @param payChannelId the payChannelId to set
     */
    public void setPayChannelId(String payChannelId) {
        this.payChannelId = payChannelId;
    }

    /**
     * @return the payType
     */
    public String getPayType() {
        return payType;
    }

    /**
     * @param payType the payType to set
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * @return the rightFlag
     */
    public String getRightFlag() {
        return rightFlag;
    }

    /**
     * @param rightFlag the rightFlag to set
     */
    public void setRightFlag(String rightFlag) {
        this.rightFlag = rightFlag;
    }

    /**
     * @return the preSeq
     */
    public String getPreSeq() {
        return preSeq;
    }

    /**
     * @param preSeq the preSeq to set
     */
    public void setPreSeq(String preSeq) {
        this.preSeq = preSeq;
    }

    /**
     * @return the isQueryPayRight
     */
    public boolean isQueryPayRight() {
        return isQueryPayRight;
    }

    /**
     * @param isQueryPayRight the isQueryPayRight to set
     */
    public void setQueryPayRight(boolean isQueryPayRight) {
        this.isQueryPayRight = isQueryPayRight;
    }

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

	@Override
	public String toString() {
		return "MerchantPayRightBean [appId=" + appId + ", mchId=" + mchId + ", userId=" + userId + ", payChannelId="
				+ payChannelId + ", payType=" + payType + ", preSeq=" + preSeq + ", rightFlag=" + rightFlag
				+ ", isQueryPayRight=" + isQueryPayRight + ", secretKey=" + secretKey + "]";
	}

	
   
}
