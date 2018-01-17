package com.jst.prodution.util;

/*
* Copyright (c) 2015-2018 SHENZHEN JST SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
public enum PayChannelEnum {
/**  系统公共返回码定义  */
	
	WeChat("WeChat", "微信"),
	JYF("JYF", "捷易付"),
	Alipay("Alipay", "支付宝")   
    ;
    
    /* 返回码  */
    private String code;
    
    /* 返回码描述 */
    private String desc;
    
    private PayChannelEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}



