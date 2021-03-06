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

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 
 * @Package: com.jst.prodution.common.serviceBean  
 * @ClassName: MerchantHyBean 
 * @Description: TODO
 *
 * @date: 2017年8月10日 上午8:25:01 
 * @version V1.0 
 

 */
public class MerchantHyBean extends BaseBean{
	
	private static final long serialVersionUID = 1L;

    private String  merchantName; // 商户名称
	
	private String  mobile;   // 电话
	
	private String  address; //地址
	
	private String imgUrl ; // 图片地址 
	
	private String  distance; //距离
	
	private String lng; //经度
	
	private  String lat ;// 纬度 

	private String scopen ;// 范围

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getScopen() {
		return scopen;
	}

	public void setScopen(String scopen) {
		this.scopen = scopen;
	}
	
	private List<MerchantHyBean>  data;

	public List<MerchantHyBean> getData() {
		return data;
	}

	public void setData(List<MerchantHyBean> data) {
		this.data = data;
	}

	

	
}
