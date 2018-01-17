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

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.settlement.model.TranCoreBackAmtInfoModel;

/** 
 * 
 * @Package: com.jst.prodution.settlement.serviceBean  
 * @ClassName: TranCoreBackAmtInfoBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年6月22日 上午10:07:45 
 * @version V1.0 
 

 */
public class TranCoreBackAmtInfoBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer tranDate;//退款原交易日期

    private String tranSeq;//退款原交易流水号(必输)
    
    private String outMchNo;//退款商户号

    private String outMchmemId;//退款商户userId
    
    private List<TranCoreBackAmtInfoModel> listBackModel;
    
    public Integer getTranDate() {
        return tranDate;
    }

    public void setTranDate(Integer tranDate) {
        this.tranDate = tranDate;
    }

    public String getTranSeq() {
        return tranSeq;
    }

    public void setTranSeq(String tranSeq) {
        this.tranSeq = tranSeq;
    }

    public String getOutMchNo() {
        return outMchNo;
    }

    public void setOutMchNo(String outMchNo) {
        this.outMchNo = outMchNo;
    }

    public String getOutMchmemId() {
        return outMchmemId;
    }

    public void setOutMchmemId(String outMchmemId) {
        this.outMchmemId = outMchmemId;
    }

    public List<TranCoreBackAmtInfoModel> getListBackModel() {
        return listBackModel;
    }

    public void setListBackModel(List<TranCoreBackAmtInfoModel> listBackModel) {
        this.listBackModel = listBackModel;
    }
}
