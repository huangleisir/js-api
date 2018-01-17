package com.jst.prodution.engine.model;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.tobank.serviceBean.BillBean;

import java.util.List;

/**
 * desc
 * Created by 兰正羡
 */
public class CbcBankParams  extends BaseBean{
    private String[] params;

    private boolean fake;

    private List<BillBean> payList;

    public List<BillBean> getPayList() {
        return payList;
    }

    public void setPayList(List<BillBean> payList) {
        this.payList = payList;
    }

    public boolean isFake() {
        return fake;
    }

    public void setFake(boolean fake) {
        this.fake = fake;
    }


    public String[] getParams() {
        return params;
    }

    public void setParams(String[] params) {
        this.params = params;
    }
}
