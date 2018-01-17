/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 收费规则查询Bean
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
public class ParkQueryparkruleOutputBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String fareruledesc;

    private List<Faretimerange> faretimerangelist;// 收费时间段列表

    private List<Farerule> farerulelist;// 收费规则列表

    private String resultcode; // 0000：成功,0001：失败

    public String getFareruledesc() {
        return fareruledesc;
    }

    public void setFareruledesc(String fareruledesc) {
        this.fareruledesc = fareruledesc;
    }

    public List<Faretimerange> getFaretimerangelist() {
        return faretimerangelist;
    }

    public void setFaretimerangelist(List<Faretimerange> faretimerangelist) {
        this.faretimerangelist = faretimerangelist;
    }

    public List<Farerule> getFarerulelist() {
        return farerulelist;
    }

    public void setFarerulelist(List<Farerule> farerulelist) {
        this.farerulelist = farerulelist;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

}
