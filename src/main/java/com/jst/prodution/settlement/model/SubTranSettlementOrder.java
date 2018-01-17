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

package com.jst.prodution.settlement.model;

/** 
 * 
 * @Package: com.jst.prodution.tran.model  
 * @ClassName: SubTranSettlementOrder 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年4月14日 上午11:53:27 
 * @version V1.0 
 

 */
public class SubTranSettlementOrder implements java.io.Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String merchantId;

    private String merchantMemberId;
    
    private Long tranAcount;

    private Integer settlementNumber;
    
    private String merchantName;
    
    private Integer settlementDate;
    
    private String settStatus;
    

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
     * @return the merchantMemberId
     */
    public String getMerchantMemberId() {
        return merchantMemberId;
    }

    /**
     * @param merchantMemberId the merchantMemberId to set
     */
    public void setMerchantMemberId(String merchantMemberId) {
        this.merchantMemberId = merchantMemberId;
    }

    /**
     * @return the tranAcount
     */
    public Long getTranAcount() {
        return tranAcount;
    }

    /**
     * @param tranAcount the tranAcount to set
     */
    public void setTranAcount(Long tranAcount) {
        this.tranAcount = tranAcount;
    }

    /**
     * @return the settlementNumber
     */
    public Integer getSettlementNumber() {
        return settlementNumber;
    }

    /**
     * @param settlementNumber the settlementNumber to set
     */
    public void setSettlementNumber(Integer settlementNumber) {
        this.settlementNumber = settlementNumber;
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

    /**
     * @return the settlementDate
     */
    public Integer getSettlementDate() {
        return settlementDate;
    }

    /**
     * @param settlementDate the settlementDate to set
     */
    public void setSettlementDate(Integer settlementDate) {
        this.settlementDate = settlementDate;
    }

    /**
     * @return the settStatus
     */
    public String getSettStatus() {
        return settStatus;
    }

    /**
     * @param settStatus the settStatus to set
     */
    public void setSettStatus(String settStatus) {
        this.settStatus = settStatus;
    }
}
