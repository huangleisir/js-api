/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 路边停车泊位查询Bean
 * 
 * 
 * @Package: com.jst.prodution.park.serviceBean  
 * @ClassName: ParkQueryoutspaceInputBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年2月27日 上午11:28:10 
 * @version V1.0 
 

 */ 
public class ParkQueryoutspaceInputBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String carseatid; // 车位号

    private String parktime;// 预计停车时长

    private String attach; // 备用字段,Json格式字符串:{}

    private String mac; // 报文通讯mac

    public String getCarseatid() {
        return carseatid;
    }

    public void setCarseatid(String carseatid) {
        this.carseatid = carseatid;
    }

    public String getParktime() {
        return parktime;
    }

    public void setParktime(String parktime) {
        this.parktime = parktime;
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
}
