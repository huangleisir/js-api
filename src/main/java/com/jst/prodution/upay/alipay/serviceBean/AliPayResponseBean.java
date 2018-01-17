package com.jst.prodution.upay.alipay.serviceBean;

import java.util.Map;

import com.jst.prodution.base.bean.BaseBean;
import com.jst.prodution.upay.model.UpayResponseChargeModel;

/**
 *@description:
 *@author  widon
 *@date: 2017年3月31日 下午6:31:43
 *@since: JDK 1.8
 *@version:V1.0.0
 */
public class AliPayResponseBean extends BaseBean{

    private static final long serialVersionUID = 7389420232365179935L;
    
    /*
     * 支付宝通知回的参数
     */
    private Map<String,String> aliResponseParamMap;
    
    private UpayResponseChargeModel upayResponseChargeMode;
    
    private boolean flag ;           //业务处理成功失败标识
    private String errorMsg;   
    private String payChannelId;     //支付渠道
    private String payType;          //支付方式
    
    
    public Map<String, String> getAliResponseParamMap() {
        return aliResponseParamMap;
    }
    public void setAliResponseParamMap(Map<String, String> aliResponseParamMap) {
        this.aliResponseParamMap = aliResponseParamMap;
    }
    public UpayResponseChargeModel getUpayResponseChargeMode() {
        return upayResponseChargeMode;
    }
    public void setUpayResponseChargeMode(UpayResponseChargeModel upayResponseChargeMode) {
        this.upayResponseChargeMode = upayResponseChargeMode;
    }
    public boolean isFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public String getErrorMsg() {
        return errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
    public String getPayChannelId() {
        return payChannelId;
    }
    public void setPayChannelId(String payChannelId) {
        this.payChannelId = payChannelId;
    }
    public String getPayType() {
        return payType;
    }
    public void setPayType(String payType) {
        this.payType = payType;
    }
   
    
    
    
    

}
