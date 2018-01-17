package com.jst.prodution.park.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/** 
 * 月卡套餐列表Bean
 * @Package: com.jst.prodution.park.serviceBean  
 * @ClassName: QueryCardComboListBean 
 * @Description: TODO
 *
 * @author: zengchuanbao 
 * @date: 2017年2月27日 上午9:47:22 
 * @version V1.0 
 */
public class MonthCardComboBean extends BaseBean{
	
	private static final long serialVersionUID = 1L;
	
	private String parkId;//停车场ID
	
	private String carNo;//车牌号
	
	private String comboId;//套餐id
	
	private String month;//月数
	
	private String amt;//套餐金额
	
	private String type ;//车类型
	
	private List<MonthCardComboBean> comboList;

	public String getParkId() {
		return parkId;
	}

	public void setParkId(String parkId) {
		this.parkId = parkId;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	
	public String getComboId() {
		return comboId;
	}

	public void setComboId(String comboId) {
		this.comboId = comboId;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public List<MonthCardComboBean> getComboList() {
		return comboList;
	}

	public void setComboList(List<MonthCardComboBean> comboList) {
		this.comboList = comboList;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
