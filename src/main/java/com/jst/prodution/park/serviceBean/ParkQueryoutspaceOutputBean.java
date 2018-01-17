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
 * @Package: com.jst.prodution.park.serviceBean  
 * @ClassName: ParkQueryorderOutputBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年2月24日 下午7:30:27 
 * @version V1.0 
 

 */ 
public class ParkQueryoutspaceOutputBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String carseatid; // 车位号

    private String carseatstatus;// 状态  01-不在服务时间段内；02-无车；03-有车且待缴费；04-已使用；

    private String preamt;         //预计停车时长对应的金额    单位：分

    private String parkid;  //停车场ID
    
    private String resultcode;         //0000：成功,0001：失败

    private String freeStartTime; // 免费起始时间
    
	private String freeEndTime; // 免费截止时间
	
	private String intime;  //入场时间
	
	
	
    public String getIntime() {
		return intime;
	}

	public void setIntime(String intime) {
		this.intime = intime;
	}

	public String getFreeStartTime() {
		return freeStartTime;
	}

	public void setFreeStartTime(String freeStartTime) {
		this.freeStartTime = freeStartTime;
	}

	public String getFreeEndTime() {
		return freeEndTime;
	}

	public void setFreeEndTime(String freeEndTime) {
		this.freeEndTime = freeEndTime;
	}

	public String getCarseatid() {
        return carseatid;
    }

    public void setCarseatid(String carseatid) {
        this.carseatid = carseatid;
    }

    public String getCarseatstatus() {
        return carseatstatus;
    }

    public void setCarseatstatus(String carseatstatus) {
        this.carseatstatus = carseatstatus;
    }

    public String getPreamt() {
        return preamt;
    }

    public void setPreamt(String preamt) {
        this.preamt = preamt;
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }
}
