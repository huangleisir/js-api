/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.io.Serializable;

/** 
 * 
 * 收费规则
 * @Package: com.jst.prodution.park.serviceBean  
 * @ClassName: Farerule 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年3月7日 上午10:12:54 
 * @version V1.0 
 

 */ 
public class Farerule implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String standard;//时间标准 01-按工作日节假日的免费收费禁停标准；02-每日免费收费禁停标准

    private String faretype;//费用类型  01-未超时；02-超时

    private String starttime;//开始时间 秒

    private String endtime;//结束时间   秒

    private String fareunit;//计费单位  00-全部；01-按小时；02-按2小时；03-按半小时分钟；04-按15分钟

    private String amtperunit;//单位费用    单位：分

    
    public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getFaretype() {
        return faretype;
    }

    public void setFaretype(String faretype) {
        this.faretype = faretype;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getFareunit() {
        return fareunit;
    }

    public void setFareunit(String fareunit) {
        this.fareunit = fareunit;
    }

    public String getAmtperunit() {
        return amtperunit;
    }

    public void setAmtperunit(String amtperunit) {
        this.amtperunit = amtperunit;
    }

    
}
