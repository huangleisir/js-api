package com.jst.prodution.settlement.serviceBean;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.settlement.model.SettReviewConf;

import java.util.Date;
import java.util.List;

public class SettReviewConfListBean  extends BaseBean{
    private static final long serialVersionUID = 1L;

    private String merchantId;

    private String merchantName;

    private String reviewFlag;

    private List<SettReviewConfBean>  lstSettReviewConf;



    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }



    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getReviewFlag() {
        return reviewFlag;
    }

    public void setReviewFlag(String reviewFlag) {
        this.reviewFlag = reviewFlag == null ? null : reviewFlag.trim();
    }


    public List<SettReviewConfBean> getLstSettReviewConf() {
        return lstSettReviewConf;
    }

    public void setLstSettReviewConf(List<SettReviewConfBean> lstSettReviewConf) {
        this.lstSettReviewConf = lstSettReviewConf;
    }
}