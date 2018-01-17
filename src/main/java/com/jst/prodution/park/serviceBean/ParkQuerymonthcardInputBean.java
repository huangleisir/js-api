/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 查询月租信息
 * @Package: com.jst.prodution.park.serviceBean  
 * @ClassName: ParkQuerymonthcardInputBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年3月22日 下午6:00:51 
 * @version V1.0 
 

 */ 
public class ParkQuerymonthcardInputBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String operid; // 用户ID

    private String opername;// 用户名

    private String carno; // 车牌号

    private String phone; // 手机号

    private String certno; // 证件号

    private String parkid; // 停车场Id

    public String getOperid() {
        return operid;
    }

    public void setOperid(String operid) {
        this.operid = operid;
    }

    public String getOpername() {
        return opername;
    }

    public void setOpername(String opername) {
        this.opername = opername;
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCertno() {
        return certno;
    }

    public void setCertno(String certno) {
        this.certno = certno;
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

}
