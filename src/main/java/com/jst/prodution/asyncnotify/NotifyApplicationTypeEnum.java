package com.jst.prodution.asyncnotify;

/**
 *@description:
 *@author  widon
 *@date: 2017年6月14日 下午3:19:50
 *@since: JDK 1.8
 *@version:V1.0.0
 */
public enum NotifyApplicationTypeEnum {
    OCD_NOTIFY("OCD_NOTIFY"),
    MEMBER_SIGN_NOTIFY("MEMBER_SIGN_NOTIFY"),
    CASH_DESK_NOTIFY("CASH_DESK_NOTIFY"),
    DEFAULT_NOTIFY("DEFAULT_NOTIFY")
    ;
    
    private String applicationName;
    
    private NotifyApplicationTypeEnum(String applicationName){
        this.applicationName =  applicationName;
    }

    
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
}
