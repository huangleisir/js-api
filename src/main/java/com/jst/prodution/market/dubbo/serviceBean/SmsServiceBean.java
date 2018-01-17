package com.jst.prodution.market.dubbo.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/**
 *@description:短信通知类通用服务
 *@author  widon
 *@date: 2018年1月11日 上午10:53:39
 *@since: JDK 1.8
 *@version:V1.0.0
 */
public class SmsServiceBean extends BaseBean {
    String terminalType;   //一般为M
    String phone;          //通知电话号码
    String content;        //通知固定内容
    String templateCode;   //模板编码
    Object templateData;   //模板内容   类型一般为JSONObject
    
    
    public String getTerminalType() {
        return terminalType;
    }
    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getTemplateCode() {
        return templateCode;
    }
    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }
    public Object getTemplateData() {
        return templateData;
    }
    public void setTemplateData(Object templateData) {
        this.templateData = templateData;
    }
    
    

}
