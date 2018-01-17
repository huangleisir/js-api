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
import com.jst.prodution.merchant.model.MerchantSettInfo;
import com.jst.prodution.merchant.model.MerchantSettlement;

/** 
 * 
 * @Package: com.jst.prodution.merchant.serviceBean  
 * @ClassName: QuerySysTransferBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年7月12日 下午2:26:04 
 * @version V1.0 
 

 */
public class QuerySysTransferBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String state;                       //状态：1 正在使用 2未使用
    private String settlementType;              //结算方向  1--结算到银行卡2--结算到余额
    private String type;                        //类型：1结算
    private List<MerchantSettInfo> lstMerchantSettInfo ;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<MerchantSettInfo> getLstMerchantSettInfo() {
        return lstMerchantSettInfo;
    }

    public void setLstMerchantSettInfo(List<MerchantSettInfo> lstMerchantSettInfo) {
        this.lstMerchantSettInfo = lstMerchantSettInfo;
    }

}
