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

package com.jst.prodution.settlement.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.tran.serviceBean  
 * @ClassName: TranCoreFeeBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年1月19日 下午3:11:52 
 * @version V1.0 
 

 */
public class TranCoreFeeBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String oppMerchantId;  //计费/分润方商户号

    private String oppMerchantMemberId;//计费/分润方商户ID
    
    private Integer feeAmount;//计费/分润汇总金额

    /**
     * @return the oppMerchantId
     */
    public String getOppMerchantId() {
        return oppMerchantId;
    }

    /**
     * @param oppMerchantId the oppMerchantId to set
     */
    public void setOppMerchantId(String oppMerchantId) {
        this.oppMerchantId = oppMerchantId;
    }

    /**
     * @return the oppMerchantMemberId
     */
    public String getOppMerchantMemberId() {
        return oppMerchantMemberId;
    }

    /**
     * @param oppMerchantMemberId the oppMerchantMemberId to set
     */
    public void setOppMerchantMemberId(String oppMerchantMemberId) {
        this.oppMerchantMemberId = oppMerchantMemberId;
    }

    /**
     * @return the feeAmount
     */
    public Integer getFeeAmount() {
        return feeAmount;
    }

    /**
     * @param feeAmount the feeAmount to set
     */
    public void setFeeAmount(Integer feeAmount) {
        this.feeAmount = feeAmount;
    }
}
