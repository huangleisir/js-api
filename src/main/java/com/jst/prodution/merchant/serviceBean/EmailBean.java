/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/

package com.jst.prodution.merchant.serviceBean;

import java.io.File;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.merchant.serviceBean  
 * @ClassName: EmailBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年3月1日 上午9:35:08 
 * @version V1.0 
 

 */
public class EmailBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String toAddress;       //邮件地址
    private String mailSubject;     //主题   
    private String mailBody;        //邮件内容
    private boolean mailBodyIsHtml; //邮件内容true html，false文本
    private File[] attachments;     //附件
    /**
     * @return the toAddress
     */
    public String getToAddress() {
        return toAddress;
    }
    /**
     * @param toAddress the toAddress to set
     */
    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }
    /**
     * @return the mailSubject
     */
    public String getMailSubject() {
        return mailSubject;
    }
    /**
     * @param mailSubject the mailSubject to set
     */
    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }
    /**
     * @return the mailBody
     */
    public String getMailBody() {
        return mailBody;
    }
    /**
     * @param mailBody the mailBody to set
     */
    public void setMailBody(String mailBody) {
        this.mailBody = mailBody;
    }
    /**
     * @return the attachments
     */
    public File[] getAttachments() {
        return attachments;
    }
    /**
     * @param attachments the attachments to set
     */
    public void setAttachments(File[] attachments) {
        this.attachments = attachments;
    }
    /**
     * @return the mailBodyIsHtml
     */
    public boolean isMailBodyIsHtml() {
        return mailBodyIsHtml;
    }
    /**
     * @param mailBodyIsHtml the mailBodyIsHtml to set
     */
    public void setMailBodyIsHtml(boolean mailBodyIsHtml) {
        this.mailBodyIsHtml = mailBodyIsHtml;
    }
    

}
