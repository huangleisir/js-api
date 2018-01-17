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

package com.jst.prodution.accountant.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.accountant.serviceBean  
 * @ClassName: AcntJobBean 
 * @Description: TODO
 *
 * @author: Administrator 
 * @date: 2017年4月20日 下午5:20:48 
 * @version V1.0 
 

 */
public class AcntJobBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private Integer jobDate;

    /**
     * @return the jobDate
     */
    public Integer getJobDate() {
        return jobDate;
    }

    /**
     * @param jobDate the jobDate to set
     */
    public void setJobDate(Integer jobDate) {
        this.jobDate = jobDate;
    }

}
