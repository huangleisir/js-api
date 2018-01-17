package com.jst.prodution.base.bean;

/**
 *@description:
 *   1.非dubbo框架结果返回内容(注：目前dubbo框架的返回信息格式由 com.jst.prodution.base.service.AbstractBaseService决定)
 *   2.在保持原返回结果不变的情况下,加入响应状态resType
 *   3.响应状态resType中加入应用提示异常
 *@author  widon
 *@date: 2017年6月15日 上午9:09:33
 *@since: JDK 1.8
 *@version:V1.0.0
 */
public class ResultInfoBean{
    private String resType; // 响应状态 00正常 01 应用异常 02系统异常  03客户端提示性异常
    private String code;    // dubbo框架中返回码是resCode ,为了适应统一收银台前置增加的响应码
    private String msg;     // dubbo框架中提示信息是msgContent,为了统一收银台中返回的提示信息字段

}
