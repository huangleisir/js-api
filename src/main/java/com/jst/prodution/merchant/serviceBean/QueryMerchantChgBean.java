package com.jst.prodution.merchant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.merchant.model.MerchantChangeLog;

import java.util.List;

/**
 * Created by Administrator on 2017/11/8.
 */
public class QueryMerchantChgBean extends BaseBean {

    private static final long serialVersionUID = 1L;

   private List<MerchantChangeLog>  lstMerchantChangeLog ;

    public List<MerchantChangeLog> getLstMerchantChangeLog() {
        return lstMerchantChangeLog;
    }

    public void setLstMerchantChangeLog(List<MerchantChangeLog> lstMerchantChangeLog) {
        this.lstMerchantChangeLog = lstMerchantChangeLog;
    }
}
