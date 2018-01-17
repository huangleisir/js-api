/*
* Copyright (c) 2015-2018 SHENZHEN JST SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
/*
* Copyright (c) 2016-2020 SHENZHEN JST SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/

package com.jst.prodution.common.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.common.serviceBean  
 * @ClassName: SwitchBean 
 * @Description: TODO
 *
 * @date: 2017年12月30日 下午4:38:49 
 * @version V1.0 
 */
public class SwitchBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	/**  开关名称    */
	private String switchName;
	/** 系统名称     */
	private String systemName;
	/**  开关值（00：打开，01关闭）     */
	private String switchValue;
	/**  开关key  （必传）
	 * accountant_switch  :会计开关key
	 * payment_switch     : 交易核心开关key
	 * market_switch      ：营销系统开关key
	 * prepaid_switch  ：预付卡开关key
	 */
	private String switchKey;
	public String getSwitchName() {
		return switchName;
	}
	public void setSwitchName(String switchName) {
		this.switchName = switchName;
	}
	public String getSystemName() {
		return systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}
	public String getSwitchValue() {
		return switchValue;
	}
	public void setSwitchValue(String switchValue) {
		this.switchValue = switchValue;
	}
	public String getSwitchKey() {
		return switchKey;
	}
	public void setSwitchKey(String switchKey) {
		this.switchKey = switchKey;
	}
	
}
