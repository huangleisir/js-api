/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.payorder.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 支付结果查询
 * @Package: com.jst.prodution.payorder.serviceBean  
 * @ClassName: ParkPayment 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年3月24日 下午12:47:30 
 * @version V1.0 
 

 */ 
public class ParkPayment  extends BaseBean{
	
	/**
     * 
     */
    private static final long serialVersionUID = 1L;


    private String parkpayssn ;//平台方支付流水号
    private String payChannel ;//支付渠道，WeChat-微信支付，JYF-捷易付，Alipay-支付宝支付
    private String payStatus ;//支付状态， 1-成功，2-失败,3-待支付
    private String orderId ;//平台订单号
    private String payTime ;//支付时间yyyymmddhhmmss
    private String payOrderNo ;//支付流水
    public String getParkpayssn() {
        return parkpayssn;
    }
    public void setParkpayssn(String parkpayssn) {
        this.parkpayssn = parkpayssn;
    }
    public String getPayChannel() {
        return payChannel;
    }
    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }
    public String getPayStatus() {
        return payStatus;
    }
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getPayTime() {
        return payTime;
    }
    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }
    public String getPayOrderNo() {
        return payOrderNo;
    }
    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }
    


}
