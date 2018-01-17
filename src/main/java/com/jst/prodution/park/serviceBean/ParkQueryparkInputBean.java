/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 停车场列表Bean
 * @Package: com.jst.prodution.park.serviceBean  
 * @ClassName: ParkBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年2月24日 上午9:47:22 
 * @version V1.0 
 

 */ 
public class ParkQueryparkInputBean extends BaseBean{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String key;         //关键字,停车场/充电地点
    private String gps;         //经纬度,用户查询时经纬度（基准点）
    private String range;       //距离,指定3km距离内停车场
    private String type;        //类型
    private String area;        //区域
    private String attach;      //备用字段,Json格式字符串:{}
    private String sort;        //排序    00：距离（默认）01：车位数、    02：价格

    
    private String mac;      //报文通讯mac

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
    
    
}
