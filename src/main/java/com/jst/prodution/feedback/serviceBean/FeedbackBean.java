/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.feedback.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 意见反馈Bean
 * @Package: com.jst.prodution.feedback.serviceBean  
 * @ClassName: FeedbackBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年3月3日 下午2:39:25 
 * @version V1.0 
 

 */ 
public class FeedbackBean extends BaseBean{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private int id;         //ID
    private String feedback;      //意见内容
    private String img1;
    private String img2;
    private String img3;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public String getImg1() {
        return img1;
    }
    public void setImg1(String img1) {
        this.img1 = img1;
    }
    public String getImg2() {
        return img2;
    }
    public void setImg2(String img2) {
        this.img2 = img2;
    }
    public String getImg3() {
        return img3;
    }
    public void setImg3(String img3) {
        this.img3 = img3;
    }
    
    

}
