package com.jst.prodution.lane.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 *@description:
 *@author  widon
 *@date: 2017年12月25日 下午3:41:25
 *@since: JDK 1.8
 *@version:V1.0.0
 */
public class LaneYFKQueryBean extends BaseBean {
    private String orderNo;  //预付卡支付订单，充值订单号
    private String orderStatus; //订单状态  0000 为成功
    private String remark; // 备注
    public String getOrderNo() {
        return orderNo;
    }
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    
    

}
