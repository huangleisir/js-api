package com.jst.prodution.merchant.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 查询单个商户信息bean
 * @author 吴安辉
 *
 */
public class QueryScdLvlMerchantBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;
	private String userId;
	private String secondLevelMerchantNo;
	private String merchantName;
	private String upMerchantId;
	private String upCompanyName;
	private String state;
	private String mchntSignAcc;
	private List<ScdLvlInfoBean> lstScdLvlInfoBean;
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
     * @return the secondLevelMerchantNo
     */
    public String getSecondLevelMerchantNo() {
        return secondLevelMerchantNo;
    }
    /**
     * @param secondLevelMerchantNo the secondLevelMerchantNo to set
     */
    public void setSecondLevelMerchantNo(String secondLevelMerchantNo) {
        this.secondLevelMerchantNo = secondLevelMerchantNo;
    }
    /**
     * @return the merchantName
     */
    public String getMerchantName() {
        return merchantName;
    }
    /**
     * @param merchantName the merchantName to set
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }
    public String getUpMerchantId() {
		return upMerchantId;
	}
	public void setUpMerchantId(String upMerchantId) {
		this.upMerchantId = upMerchantId;
	}
	public String getUpCompanyName() {
		return upCompanyName;
	}
	public void setUpCompanyName(String upCompanyName) {
		this.upCompanyName = upCompanyName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	/**
     * @return the lstScdLvlInfoBean
     */
    public List<ScdLvlInfoBean> getLstScdLvlInfoBean() {
        return lstScdLvlInfoBean;
    }
    /**
     * @param lstScdLvlInfoBean the lstScdLvlInfoBean to set
     */
    public void setLstScdLvlInfoBean(List<ScdLvlInfoBean> lstScdLvlInfoBean) {
        this.lstScdLvlInfoBean = lstScdLvlInfoBean;
    }
	public String getMchntSignAcc() {
		return mchntSignAcc;
	}
	public void setMchntSignAcc(String mchntSignAcc) {
		this.mchntSignAcc = mchntSignAcc;
	}

}
