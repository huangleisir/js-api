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

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantSettlement;
import com.jst.prodution.merchant.model.MerchantSettlementConf;

/** 
 * 
 * @Package: com.jst.prodution.merchant.serviceBean  
 * @ClassName: CreateMerchantSettleBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年2月24日 下午1:48:15 
 * @version V1.0 
 

 */
public class CreateMerchantSettleBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String userId;                  //商户ID（B会员ID）
    private String merchantId;              //商户号
    private MerchantSettlement merchantSettlement;      //商户结算相关
    
    private List<MerchantSettlementConf> merchantSettlementConfList;     //商户结算相关

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
     * @return the merchantSettlement
     */
    public MerchantSettlement getMerchantSettlement() {
        return merchantSettlement;
    }

    /**
     * @param merchantSettlement the merchantSettlement to set
     */
    public void setMerchantSettlement(MerchantSettlement merchantSettlement) {
        this.merchantSettlement = merchantSettlement;
    }

    /**
     * @return the merchantSettlementConfList
     */
    public List<MerchantSettlementConf> getMerchantSettlementConfList() {
        return merchantSettlementConfList;
    }

    /**
     * @param merchantSettlementConfList the merchantSettlementConfList to set
     */
    public void setMerchantSettlementConfList(List<MerchantSettlementConf> merchantSettlementConfList) {
        this.merchantSettlementConfList = merchantSettlementConfList;
    }

}
