/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 订单详情Bean
 * @Package: com.jst.prodution.park.serviceBean  
 * @ClassName: ParkBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年2月24日 上午9:47:22 
 * @version V1.0 
 

 */ 
public class ParkQueryorderInputBean extends BaseBean{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String orderId;         //订单号
    private String attach;      //备用字段,Json格式字符串:{}
    private String carNo;//车牌号  输入车牌号后仅按照车牌号查询当前停车
    private String mac;      //报文通讯mac

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }
    
    
}
