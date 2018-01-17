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
 * @ClassName: QueryMerchantBaseInfoBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年3月6日 下午1:50:16 
 * @version V1.0 
 

 */
public class QueryMerchantBaseInfoBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String userId;

    private String merchantId;

    private String companyEmail;

    private String companyTel;

    private String companyName;

    private String companyShortName;

    private String companyType;

    private String busLicenceNo;

    private String busLicenceAddr;

    private String busLicenceStartDate;

    private String busLicenceEndDate;

    private String agencyCode;

    private String businessRange;

    private String contactName;

    private String contactTel;

    private String contactEmail;

    private String corporateName;

    private String corporateCardNo;

    private String corporateStartDate;

    private String corporateEndDate;

    private String busPersonName;

    private String busPersonCode;

    private String busPersonStartDate;

    private String busPersonEndDate;

    private String state;

    private String authenState;

    private String creditLevel;

    private String creator;

    private String createTime;

    private String updator;

    private String updateTime;

    private String regChannel;
    private String upMerchantId;

    private String upUserId;

    private String merchantLevel;
    
    private String jstMerchantId;
    
    private String busLicenceType;
    
    private String licenceProvince;
    
    private String licenceCity;
    
    private String busType;
    
    private String taxpayerNo;
    
    private String cardIssuer;
    
    private String operateOrg;
    
    private String busPersonTel;
    
    private String updateMenuTime;
    
    private String contractNo;
    
    private String salesOrderNo;
    
    private String operateType;
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail == null ? null : companyEmail.trim();
    }

    public String getCompanyTel() {
        return companyTel;
    }

    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel == null ? null : companyTel.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyShortName() {
        return companyShortName;
    }

    public void setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName == null ? null : companyShortName.trim();
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    public String getBusLicenceNo() {
        return busLicenceNo;
    }

    public void setBusLicenceNo(String busLicenceNo) {
        this.busLicenceNo = busLicenceNo == null ? null : busLicenceNo.trim();
    }

    public String getBusLicenceAddr() {
        return busLicenceAddr;
    }

    public void setBusLicenceAddr(String busLicenceAddr) {
        this.busLicenceAddr = busLicenceAddr == null ? null : busLicenceAddr.trim();
    }

    public String getBusLicenceStartDate() {
        return busLicenceStartDate;
    }

    public void setBusLicenceStartDate(String busLicenceStartDate) {
        this.busLicenceStartDate = busLicenceStartDate == null ? null : busLicenceStartDate.trim();
    }

    public String getBusLicenceEndDate() {
        return busLicenceEndDate;
    }

    public void setBusLicenceEndDate(String busLicenceEndDate) {
        this.busLicenceEndDate = busLicenceEndDate == null ? null : busLicenceEndDate.trim();
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode == null ? null : agencyCode.trim();
    }

    public String getBusinessRange() {
        return businessRange;
    }

    public void setBusinessRange(String businessRange) {
        this.businessRange = businessRange == null ? null : businessRange.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel == null ? null : contactTel.trim();
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName == null ? null : corporateName.trim();
    }

    public String getCorporateCardNo() {
        return corporateCardNo;
    }

    public void setCorporateCardNo(String corporateCardNo) {
        this.corporateCardNo = corporateCardNo == null ? null : corporateCardNo.trim();
    }

    public String getCorporateStartDate() {
        return corporateStartDate;
    }

    public void setCorporateStartDate(String corporateStartDate) {
        this.corporateStartDate = corporateStartDate == null ? null : corporateStartDate.trim();
    }

    public String getCorporateEndDate() {
        return corporateEndDate;
    }

    public void setCorporateEndDate(String corporateEndDate) {
        this.corporateEndDate = corporateEndDate == null ? null : corporateEndDate.trim();
    }

    public String getBusPersonName() {
        return busPersonName;
    }

    public void setBusPersonName(String busPersonName) {
        this.busPersonName = busPersonName == null ? null : busPersonName.trim();
    }

    public String getBusPersonCode() {
        return busPersonCode;
    }

    public void setBusPersonCode(String busPersonCode) {
        this.busPersonCode = busPersonCode == null ? null : busPersonCode.trim();
    }

    public String getBusPersonStartDate() {
        return busPersonStartDate;
    }

    public void setBusPersonStartDate(String busPersonStartDate) {
        this.busPersonStartDate = busPersonStartDate == null ? null : busPersonStartDate.trim();
    }

    public String getBusPersonEndDate() {
        return busPersonEndDate;
    }

    public void setBusPersonEndDate(String busPersonEndDate) {
        this.busPersonEndDate = busPersonEndDate == null ? null : busPersonEndDate.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getAuthenState() {
        return authenState;
    }

    public void setAuthenState(String authenState) {
        this.authenState = authenState == null ? null : authenState.trim();
    }

    public String getCreditLevel() {
        return creditLevel;
    }

    public void setCreditLevel(String creditLevel) {
        this.creditLevel = creditLevel == null ? null : creditLevel.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getRegChannel() {
        return regChannel;
    }

    public void setRegChannel(String regChannel) {
        this.regChannel = regChannel == null ? null : regChannel.trim();
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

	public String getJstMerchantId() {
		return jstMerchantId;
	}

	public void setJstMerchantId(String jstMerchantId) {
		this.jstMerchantId = jstMerchantId;
	}

	public String getBusLicenceType() {
		return busLicenceType;
	}

	public void setBusLicenceType(String busLicenceType) {
		this.busLicenceType = busLicenceType;
	}

	public String getLicenceProvince() {
		return licenceProvince;
	}

	public void setLicenceProvince(String licenceProvince) {
		this.licenceProvince = licenceProvince;
	}

	public String getLicenceCity() {
		return licenceCity;
	}

	public void setLicenceCity(String licenceCity) {
		this.licenceCity = licenceCity;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getTaxpayerNo() {
		return taxpayerNo;
	}

	public void setTaxpayerNo(String taxpayerNo) {
		this.taxpayerNo = taxpayerNo;
	}

	public String getCardIssuer() {
		return cardIssuer;
	}

	public void setCardIssuer(String cardIssuer) {
		this.cardIssuer = cardIssuer;
	}

	public String getOperateOrg() {
		return operateOrg;
	}

	public void setOperateOrg(String operateOrg) {
		this.operateOrg = operateOrg;
	}

	public String getBusPersonTel() {
		return busPersonTel;
	}

	public void setBusPersonTel(String busPersonTel) {
		this.busPersonTel = busPersonTel;
	}

	public String getUpdateMenuTime() {
		return updateMenuTime;
	}

	public void setUpdateMenuTime(String updateMenuTime) {
		this.updateMenuTime = updateMenuTime;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getSalesOrderNo() {
		return salesOrderNo;
	}

	public void setSalesOrderNo(String salesOrderNo) {
		this.salesOrderNo = salesOrderNo;
	}

	public String getOperateType() {
		return operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
}
