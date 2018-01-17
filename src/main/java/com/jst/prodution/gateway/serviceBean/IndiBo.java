/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.gateway.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

public class IndiBo extends BaseBean {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private String name ;//姓名 ，必填
    private String timestamp;//时间戳 ,必填
    private String idNumber ;//身份证号，必填
    private String identityModelHex ;//认证类型 40：二要素认证 10：四要素认证 ，必填
    private String parnterid;//合作号 ,必填
    private String validFrom ;//有效起止时间,四要素认证必填
    private String validEnd ;//有效截止时间 ,四要素认证必填
    

    private String code ;
    private String msg ;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    public String getIdentityModelHex() {
        return identityModelHex;
    }
    public void setIdentityModelHex(String identityModelHex) {
        this.identityModelHex = identityModelHex;
    }
    public String getParnterid() {
        return parnterid;
    }
    public void setParnterid(String parnterid) {
        this.parnterid = parnterid;
    }
    public String getValidFrom() {
        return validFrom;
    }
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }
    public String getValidEnd() {
        return validEnd;
    }
    public void setValidEnd(String validEnd) {
        this.validEnd = validEnd;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
	
    
    
}
