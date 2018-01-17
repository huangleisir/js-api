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

package com.jst.prodution.tran.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.tran.serviceBean  
 * @ClassName: TranCoreSettlementReportBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年4月14日 下午2:31:31 
 * @version V1.0 
 

 */
public class TranCoreSettlementReportBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private Integer settlementDate;//结算时间
    
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
    

}
