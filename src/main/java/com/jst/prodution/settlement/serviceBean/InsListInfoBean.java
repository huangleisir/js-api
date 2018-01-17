package com.jst.prodution.settlement.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

import java.util.List;

/**
 * Created by Administrator on 2017/8/15.
 */
public class InsListInfoBean extends BaseBean {
    private static final long serialVersionUID = 1L;
    private String insCd;

    private String insName;

    private List<InsInfoBean> lstBean;

    public String getInsCd() {
        return insCd;
    }

    public void setInsCd(String insCd) {
        this.insCd = insCd;
    }

    public String getInsName() {
        return insName;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public List<InsInfoBean> getLstBean() {
        return lstBean;
    }

    public void setLstBean(List<InsInfoBean> lstBean) {
        this.lstBean = lstBean;
    }


}
