/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 订单列表Bean
 * 
 * @Package: com.jst.prodution.park.serviceBean
 * @ClassName: ParkBean
 * @Description: TODO
 *
 * @author: Administrator
 * @date: 2017年2月24日 上午9:47:22
 * @version V1.0
 * 
 * 
 */
public class ParkQueryorderlistOutputBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String recordnum; // 总条数

    private String pagetotal;// 总页数
    
    private String respTime;//应答时间  yyyyMMddHHmmss

    private List<ParkOrder> ordlist;// 订单列表

    private String resultcode;         //0000：成功,0001：失败

    public String getRecordnum() {
        return recordnum;
    }

    public void setRecordnum(String recordnum) {
        this.recordnum = recordnum;
    }

    public String getPagetotal() {
        return pagetotal;
    }

    public void setPagetotal(String pagetotal) {
        this.pagetotal = pagetotal;
    }

    public List<ParkOrder> getOrdlist() {
        return ordlist;
    }

    public void setOrdlist(List<ParkOrder> ordlist) {
        this.ordlist = ordlist;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getRespTime() {
        return respTime;
    }

    public void setRespTime(String respTime) {
        this.respTime = respTime;
    }
    
    
}
