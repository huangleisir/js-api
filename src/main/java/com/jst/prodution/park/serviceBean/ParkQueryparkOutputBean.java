/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.util.List;

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
public class ParkQueryparkOutputBean extends BaseBean{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private List<Park> parklist;         //车场信息列表
    private String resultcode;         //0000：成功,0001：失败
    
    public List<Park> getParklist() {
        return parklist;
    }
    public void setParklist(List<Park> parklist) {
        this.parklist = parklist;
    }
    public String getResultcode() {
        return resultcode;
    }
    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }
   }
