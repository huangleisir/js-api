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
 * @ClassName: CreateMerchantBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年2月24日 上午9:40:27 
 * @version V1.0 
 

 */
public class CreateMerchantBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    //输出
    private String userId;                  //商户ID（B会员ID）
    private String merchantId;              //商户号
    //输入
    private String companyEmail;            //企业注册邮箱
    private String companyTel;              //企业注册电话号码
    private String regChannel;              //注册渠道 APP,OMS,OTH其他
    private String companyName;             //企业全称
    private String companyShortName;        //企业简称
    private String payPassWord;             //支付密码
    private String passWord;                //登录密码
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
     * @return the payPassWord
     */
    public String getPayPassWord() {
        return payPassWord;
    }
    /**
     * @param payPassWord the payPassWord to set
     */
    public void setPayPassWord(String payPassWord) {
        this.payPassWord = payPassWord;
    }
    /**
     * @return the passWord
     */
    public String getPassWord() {
        return passWord;
    }
    /**
     * @param passWord the passWord to set
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    /**
     * @return the regChannel
     */
    public String getRegChannel() {
        return regChannel;
    }
    /**
     * @param regChannel the regChannel to set
     */
    public void setRegChannel(String regChannel) {
        this.regChannel = regChannel;
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

}
