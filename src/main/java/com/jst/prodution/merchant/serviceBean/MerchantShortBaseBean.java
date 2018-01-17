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
 * @ClassName: MerchantBaseBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年2月22日 上午11:10:23 
 * @version V1.0 
 

 */
public class MerchantShortBaseBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String userId;                  //商户ID（B会员ID）
    private String merchantId;              //商户号
    private String companyEmail;            //企业注册邮箱
    private String companyTel;              //企业注册电话号码
    private String companyName;             //企业全称
    private String companyShortName;        //企业简称
    private String companyType;             //企业类型
    private String contactName;             //联系人姓名
    private String contactTel;              //联系人电话
    private String contactEmail;            //联系人邮箱 
    private String isFstLogin;              //是否验证首次登陆 0 -不验证，1-验证
    private String querySettFlag;              //Y-查询结算信息，N-不查询
    
    private String mchntSignAcc;			//拓展商:JST（捷顺通）,SYT（顺易通）,JYF（捷易付）

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }
    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    /**
     * @return the merchantId
     */
    public String getMerchantId() {
        return merchantId;
    }
    /**
     * @param merchantId the merchantId to set
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
    /**
     * @return the companyEmail
     */
    public String getCompanyEmail() {
        return companyEmail;
    }
    /**
     * @param companyEmail the companyEmail to set
     */
    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }
    /**
     * @return the companyTel
     */
    public String getCompanyTel() {
        return companyTel;
    }
    /**
     * @param companyTel the companyTel to set
     */
    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel;
    }
    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }
    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    /**
     * @return the companyType
     */
    public String getCompanyType() {
        return companyType;
    }
    /**
     * @param companyType the companyType to set
     */
    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }
    /**
     * @return the companyShortName
     */
    public String getCompanyShortName() {
        return companyShortName;
    }
    /**
     * @param companyShortName the companyShortName to set
     */
    public void setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName;
    }
    /**
     * @return the contactName
     */
    public String getContactName() {
        return contactName;
    }
    /**
     * @param contactName the contactName to set
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    /**
     * @return the contactTel
     */
    public String getContactTel() {
        return contactTel;
    }
    /**
     * @param contactTel the contactTel to set
     */
    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }
    /**
     * @return the contactEmail
     */
    public String getContactEmail() {
        return contactEmail;
    }
    /**
     * @param contactEmail the contactEmail to set
     */
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    /**
     * @return the isFstLogin
     */
    public String getIsFstLogin() {
        return isFstLogin;
    }
    /**
     * @param isFstLogin the isFstLogin to set
     */
    public void setIsFstLogin(String isFstLogin) {
        this.isFstLogin = isFstLogin;
    }
    public String getQuerySettFlag() {
        return querySettFlag;
    }
    public void setQuerySettFlag(String querySettFlag) {
        this.querySettFlag = querySettFlag;
    }
	public String getMchntSignAcc() {
		return mchntSignAcc;
	}
	public void setMchntSignAcc(String mchntSignAcc) {
		this.mchntSignAcc = mchntSignAcc;
	}
}
