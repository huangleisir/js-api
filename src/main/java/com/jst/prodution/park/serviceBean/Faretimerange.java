/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.io.Serializable;

/** 
 * 收费时间段
 * @Package: com.jst.prodution.park.serviceBean  
 * @ClassName: Faretimerange 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年3月7日 上午10:13:00 
 * @version V1.0 
 

 */ 
public class Faretimerange implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String standard;//时间标准  01-按工作日节假日的免费收费禁停标准；02-每日免费收费禁停标准

    private String timetype;//时间段类型 standard为01时：    01-工作日免费时间段；02-工作日收费时间段；03-工作日禁停时间段；11-节假日免费时间段；12-节假日收费时间段；13-节假日禁停时间段；standard为02时：01-免费时间段；02-收费时间段；03-禁停时间段；

    private String starttime;//HHmmss

    private String endtime;//HHmmss

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getTimetype() {
        return timetype;
    }

    public void setTimetype(String timetype) {
        this.timetype = timetype;
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

    
}
