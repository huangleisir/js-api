package com.jst.prodution.jsyun.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class CarNoSynHistoryBean extends BaseBean{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 编号
     */
    private String id;

    /**
     * 车牌号
     */
    private String carNo;

    /**
     * 创建日期
     */
    private Date createDatetime;
    
    /**
     * 代扣状态
     */
    private Integer withholdingState;

   

	public Integer getWithholdingState() {
		return withholdingState;
	}

	public void setWithholdingState(Integer withholdingState) {
		this.withholdingState = withholdingState;
	}

	/**
     * 编号
     * @return id 编号
     */
    public String getId() {
        return id;
    }

    /**
     * 编号
     * @param id 编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 车牌号
     * @return car_no 车牌号
     */
    public String getCarNo() {
        return carNo;
    }

    /**
     * 车牌号
     * @param carNo 车牌号
     */
    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    /**
     * 创建日期
     * @return create_datetime 创建日期
     */
    public Date getCreateDatetime() {
        return createDatetime;
    }

    /**
     * 创建日期
     * @param createDatetime 创建日期
     */
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }
}