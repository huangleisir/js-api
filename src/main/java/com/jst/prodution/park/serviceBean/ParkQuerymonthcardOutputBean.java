/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 查询月租信息
 * @Package: com.jst.prodution.park.serviceBean  
 * @ClassName: ParkQuerymonthcardOutputBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年3月22日 下午6:01:09 
 * @version V1.0 
 

 */ 
public class ParkQuerymonthcardOutputBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;


    private List<Monthcard> monthcardlist;  //月卡列表   用户已购买的月卡信息
    
    private String resultcode;         //0000：成功,0001：失败


    public List<Monthcard> getMonthcardlist() {
        return monthcardlist;
    }

    public void setMonthcardlist(List<Monthcard> monthcardlist) {
        this.monthcardlist = monthcardlist;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

}
