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
 * @ClassName: ScdLvlInfoBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年5月15日 下午8:54:19 
 * @version V1.0 
 

 */
public class ScdLvlInfoBean extends BaseBean {

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
    private String state;                   //审核状态：1待审核 2审核通过 3驳回 4 不通过 5审核中
    private String authenState;             //鉴权状态：1 已鉴权  2未鉴权
    private String creditLevel;             //商户等级：A B C D E
    private String createTime;              //申请时间
    private String updateTime;              //修改时间
    private String regChannel;              //注册渠道
    private String upMerchantId;            //商户商户号

    private String upUserId;                //上级商户ID

    private String merchantLevel;           //商户级别

    private String bankCard;
    private String status;
    
    private String bankName;
    private String upCompanyName;     //上级商户名称
    
    private String memberStatus;	//商户会员状态
    
    private String MchntSignAcc;	//拓展商
    
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
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the authenState
     */
    public String getAuthenState() {
        return authenState;
    }

    /**
     * @param authenState the authenState to set
     */
    public void setAuthenState(String authenState) {
        this.authenState = authenState;
    }

    /**
     * @return the creditLevel
     */
    public String getCreditLevel() {
        return creditLevel;
    }

    /**
     * @param creditLevel the creditLevel to set
     */
    public void setCreditLevel(String creditLevel) {
        this.creditLevel = creditLevel;
    }

    /**
     * @return the createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime the createTime to set
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * @return the updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime the updateTime to set
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
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
     * @return the upMerchantId
     */
    public String getUpMerchantId() {
        return upMerchantId;
    }

    /**
     * @param upMerchantId the upMerchantId to set
     */
    public void setUpMerchantId(String upMerchantId) {
        this.upMerchantId = upMerchantId;
    }

    /**
     * @return the upUserId
     */
    public String getUpUserId() {
        return upUserId;
    }

    /**
     * @param upUserId the upUserId to set
     */
    public void setUpUserId(String upUserId) {
        this.upUserId = upUserId;
    }

    /**
     * @return the merchantLevel
     */
    public String getMerchantLevel() {
        return merchantLevel;
    }

    /**
     * @param merchantLevel the merchantLevel to set
     */
    public void setMerchantLevel(String merchantLevel) {
        this.merchantLevel = merchantLevel;
    }

    /**
     * @return the bankCard
     */
    public String getBankCard() {
        return bankCard;
    }

    /**
     * @param bankCard the bankCard to set
     */
    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }



    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

	public String getUpCompanyName() {
		return upCompanyName;
	}

	public void setUpCompanyName(String upCompanyName) {
		this.upCompanyName = upCompanyName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}

	public String getMchntSignAcc() {
		return MchntSignAcc;
	}

	public void setMchntSignAcc(String mchntSignAcc) {
		MchntSignAcc = mchntSignAcc;
	}

}
