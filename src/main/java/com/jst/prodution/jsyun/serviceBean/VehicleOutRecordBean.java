package com.jst.prodution.jsyun.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class VehicleOutRecordBean extends BaseBean{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 记录编号
     */
    private String id;

    /**
     * 车牌号
     */
    private String vehicleNo;

    /**
     * 车辆编号
     */
    private String vehicleId;

    /**
     * 出场时间
     */
    private Date outTime;

    /**
     * 停车场名称
     */
    private String parkName;
    /**
     * 停车场编号
     */
    private String parkCode;

    /**
     * 创建时间
     */
    private Date createDatetime;

    
    public String getParkCode() {
		return parkCode;
	}

	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}

	/**
     * 记录编号
     * @return id 记录编号
     */
    public String getId() {
        return id;
    }

    /**
     * 记录编号
     * @param id 记录编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 车牌号
     * @return vehicle_no 车牌号
     */
    public String getVehicleNo() {
        return vehicleNo;
    }

    /**
     * 车牌号
     * @param vehicleNo 车牌号
     */
    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    /**
     * 车辆编号
     * @return vehicle_id 车辆编号
     */
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * 车辆编号
     * @param vehicleId 车辆编号
     */
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * 出场时间
     * @return out_time 出场时间
     */
    public Date getOutTime() {
        return outTime;
    }

    /**
     * 出场时间
     * @param outTime 出场时间
     */
    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    /**
     * 停车场名称
     * @return park_name 停车场名称
     */
    public String getParkName() {
        return parkName;
    }

    /**
     * 停车场名称
     * @param parkName 停车场名称
     */
    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    /**
     * 创建时间
     * @return create_datetime 创建时间
     */
    public Date getCreateDatetime() {
        return createDatetime;
    }

    /**
     * 创建时间
     * @param createDatetime 创建时间
     */
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }
}