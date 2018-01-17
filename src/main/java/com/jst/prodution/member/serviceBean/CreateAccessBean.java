/*
* Copyright (c) 2015-2018 SHENZHEN JST SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/


package com.jst.prodution.member.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.member.serviceBean  
 * @ClassName: CreateAccessBean 
 * @Description: 智慧停车获取access Bean
 *
 * @author: hewen 
 * @date: 2017年6月6日 下午5:40:14 
 * @version V1.0 
 */
public class CreateAccessBean extends BaseBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * token
	 */
   private String token;
   /**
    * 返回access
    */
   private String access;
   
   /**
    * H5地址
    */
   private String signUrl;
   
   /**
    * 渠道号
    */
   private String channelNo;

  public String getToken() {
	return token;
  }

  public void setToken(String token) {
	this.token = token;
  }

  public String getAccess() {
	return access;
   }

   public void setAccess(String access) {
	this.access = access;
  }

  public String getSignUrl() {
	return signUrl;
  }

  public void setSignUrl(String signUrl) {
	this.signUrl = signUrl;
  }

  public String getChannelNo() {
	return channelNo;
  }

  public void setChannelNo(String channelNo) {
	this.channelNo = channelNo;
  }
  
}
