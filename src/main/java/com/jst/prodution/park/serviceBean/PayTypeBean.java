package com.jst.prodution.park.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 支付类型列表Bean
 * @Package: com.jst.prodution.park.serviceBean  
 * @ClassName: PayTypeBean 
 * @Description: TODO
 *
 * @author: zengchuanbao 
 * @date: 2017年2月27日 上午9:47:22 
 * @version V1.0 
 */
public class PayTypeBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	private String payName;//支付方式名称
	
	private String payCode;//支付Code

	private List<PayTypeBean> payTypeList;
	

	public String getPayName() {
		return payName;
	}

	public void setPayName(String payName) {
		this.payName = payName;
	}

	public String getPayCode() {
		return payCode;
	}

	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}

	public List<PayTypeBean> getPayTypeList() {
		return payTypeList;
	}

	public void setPayTypeList(List<PayTypeBean> payTypeList) {
		this.payTypeList = payTypeList;
	}
	
}
