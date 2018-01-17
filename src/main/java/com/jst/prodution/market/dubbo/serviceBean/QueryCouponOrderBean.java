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

package com.jst.prodution.market.dubbo.serviceBean;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.market.dubbo.serviceBean  
 * @ClassName: QueryCouponOrderBean 
 * @Description: 根据订单号查询是否使用优惠卷信息
 * @date: 2017年9月5日 上午11:10:28 
 * @version V1.0 
 */
public class QueryCouponOrderBean extends BaseBean{
	private static final long serialVersionUID = 1L;

	private String orderNo; //订单号  
	
	private String isUserCoupon; //是否使用优惠卷信息。 1：使用  0 ：未使用 
	
    private Long useAmt; // 优惠卷金额

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getIsUserCoupon() {
		return isUserCoupon;
	}

	public void setIsUserCoupon(String isUserCoupon) {
		this.isUserCoupon = isUserCoupon;
	}

	public Long getUseAmt() {
		return useAmt;
	}

	public void setUseAmt(Long useAmt) {
		this.useAmt = useAmt;
	}
	
	
}
