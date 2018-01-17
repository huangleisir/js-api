package com.jst.prodution.merchant.model;

/**
 * 商户基本信息表
 * @author Administrator
 *
 */
public class MerchantBase implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;
	private String userId;					//商户ID（B会员ID）
	private String merchantId;				//商户号
	private String companyEmail;			//企业注册邮箱
	private String companyTel;				//企业注册电话号码
	private String companyName;				//企业全称
	private String companyShortName;		//企业简称
	private String companyType;				//企业类型
	private String busLicenceNo;			//营业执照号
	private String busLicenceAddr;			//营业执照所在地
	private String busLicenceStartDate;		//营业执照有效期（开始）
	private String busLicenceEndDate;		//营业执照有效期（结束）
	private String agencyCode;				//组织机构代码
	private String businessRange;			//营业范围
	private String contactName;				//联系人姓名
	private String contactTel;				//联系人电话
	private String contactEmail;			//联系人邮箱
	private String corporateName;			//法人姓名
	private String corporateCardNo;			//法人身份证号码
	private String corporateStartDate;		//证件有效期（开始）
	private String corporateEndDate;		//证件有效期（结束）
	private String busPersonName;			//商务人员姓名
	private String busPersonCode;			//商户人员证件号
	private String busPersonStartDate;		//商务人员证件有效期（开始）
	private String busPersonEndDate;		//商务人员证件有效期（结束）
	private String state;					//审核状态：1待审核 2审核通过 3驳回 4 不通过 5审核中
	private String authenState;				//鉴权状态：1 已鉴权  2未鉴权
	private String creditLevel;				//商户等级：A B C D E
	private String creator;					//申请人
	private String createTime;				//申请时间
	private String updator;					//修改人
	private String updateTime;				//修改时间
	private String regChannel;              //注册渠道
    private String upMerchantId;            //商户商户号

    private String upUserId;                //上级商户ID

    private String merchantLevel;           //商户级别
    private String tccNo;           //停车场编号
    
    private String jstMerchantId; 			//捷顺通商户号
    private String busLicenceType;			//证件类型
//    private String busLicAddr;				//住所
    private String taxpayerNo;				//纳税人识别号
    private String cardIssuer;				//发卡机构
    private String busType;					//业务类型
    private String operateOrg;				//运营机构
    private String busPersonTel;			//商务人员联系电话
    private String licenceProvince;			//单位所在地省份
    private String licenceCity;				//单位所在地城市
    
    private String updateMenuTime;			//更新权限时间
    
    private String contractNo;				//合同号
    private String salesOrderNo;			//销售订单号
    private String operateType;				//操作方式
    
    private String memberStatus;			//会员状态
    private String secretKey;				//商户密钥
    
    private String busLicenceIsLong;		//营业执照是否长期有效
    private String corporateIsLong;			//法人证件是否长期有效
    
    private String mchntSignAcc;			//拓展商:JST（捷顺科技）,SYT（顺易通）,JYF（捷易付）
    
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getCompanyTel() {
		return companyTel;
	}
	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyShortName() {
		return companyShortName;
	}
	public void setCompanyShortName(String companyShortName) {
		this.companyShortName = companyShortName;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getBusLicenceNo() {
		return busLicenceNo;
	}
	public void setBusLicenceNo(String busLicenceNo) {
		this.busLicenceNo = busLicenceNo;
	}
	public String getBusLicenceAddr() {
		return busLicenceAddr;
	}
	public void setBusLicenceAddr(String busLicenceAddr) {
		this.busLicenceAddr = busLicenceAddr;
	}
	public String getBusLicenceStartDate() {
		return busLicenceStartDate;
	}
	public void setBusLicenceStartDate(String busLicenceStartDate) {
		this.busLicenceStartDate = busLicenceStartDate;
	}
	public String getBusLicenceEndDate() {
		return busLicenceEndDate;
	}
	public void setBusLicenceEndDate(String busLicenceEndDate) {
		this.busLicenceEndDate = busLicenceEndDate;
	}
	public String getAgencyCode() {
		return agencyCode;
	}
	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}
	public String getBusinessRange() {
		return businessRange;
	}
	public void setBusinessRange(String businessRange) {
		this.businessRange = businessRange;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactTel() {
		return contactTel;
	}
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getCorporateName() {
		return corporateName;
	}
	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}
	public String getCorporateCardNo() {
		return corporateCardNo;
	}
	public void setCorporateCardNo(String corporateCardNo) {
		this.corporateCardNo = corporateCardNo;
	}
	public String getCorporateStartDate() {
		return corporateStartDate;
	}
	public void setCorporateStartDate(String corporateStartDate) {
		this.corporateStartDate = corporateStartDate;
	}
	public String getCorporateEndDate() {
		return corporateEndDate;
	}
	public void setCorporateEndDate(String corporateEndDate) {
		this.corporateEndDate = corporateEndDate;
	}
	public String getBusPersonName() {
		return busPersonName;
	}
	public void setBusPersonName(String busPersonName) {
		this.busPersonName = busPersonName;
	}
	public String getBusPersonCode() {
		return busPersonCode;
	}
	public void setBusPersonCode(String busPersonCode) {
		this.busPersonCode = busPersonCode;
	}
	public String getBusPersonStartDate() {
		return busPersonStartDate;
	}
	public void setBusPersonStartDate(String busPersonStartDate) {
		this.busPersonStartDate = busPersonStartDate;
	}
	public String getBusPersonEndDate() {
		return busPersonEndDate;
	}
	public void setBusPersonEndDate(String busPersonEndDate) {
		this.busPersonEndDate = busPersonEndDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAuthenState() {
		return authenState;
	}
	public void setAuthenState(String authenState) {
		this.authenState = authenState;
	}
	public String getCreditLevel() {
		return creditLevel;
	}
	public void setCreditLevel(String creditLevel) {
		this.creditLevel = creditLevel;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdator() {
		return updator;
	}
	public void setUpdator(String updator) {
		this.updator = updator;
	}
	public String getUpdateTime() {
		return updateTime;
	}
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
     * @return the tccNo
     */
    public String getTccNo() {
        return tccNo;
    }
    /**
     * @param tccNo the tccNo to set
     */
    public void setTccNo(String tccNo) {
        this.tccNo = tccNo;
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
//	public String getBusLicAddr() {
//		return busLicAddr;
//	}
//	public void setBusLicAddr(String busLicAddr) {
//		this.busLicAddr = busLicAddr;
//	}
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
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
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
	public String getMemberStatus() {
		return memberStatus;
	}
	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}
	public String getSecretKey() {
		return secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	public String getBusLicenceIsLong() {
		return busLicenceIsLong;
	}
	public void setBusLicenceIsLong(String busLicenceIsLong) {
		this.busLicenceIsLong = busLicenceIsLong;
	}
	public String getCorporateIsLong() {
		return corporateIsLong;
	}
	public void setCorporateIsLong(String corporateIsLong) {
		this.corporateIsLong = corporateIsLong;
	}
	public String getMchntSignAcc() {
		return mchntSignAcc;
	}
	public void setMchntSignAcc(String mchntSignAcc) {
		this.mchntSignAcc = mchntSignAcc;
	}
	
}
