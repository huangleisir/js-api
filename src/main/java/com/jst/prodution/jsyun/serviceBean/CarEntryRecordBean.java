package com.jst.prodution.jsyun.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class CarEntryRecordBean extends BaseBean{
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
    private String carNumber;

    /**
     * 入场时间
     */
    private Date inTime;

    /**
     * 停车场名称
     */
    private String parkName;

    /**
     * 停车场编号
     */
    private String parkCode;

    /**
     * 入场设备名称
     */
    private String equipName;

    /**
     * 入场设备编号
     */
    private String equipCode;

    /**
     * 入场操作员
     */
    private String inOperator;

    /**
     * 场内车辆数
     */
    private Integer inTotal;

    /**
     * 创建时间
     */
    private Date createDatetime;

    /**
     * 推送方的记录编号
     */
    private String itemId;

    /**
     * 未发行的卡号，如纸票号等
     */
    private String idno;

    /**
     * 
     */
    private String attach;

    /**
     * 入场图片名称
     */
    private String inCarPhoto;

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
     * @return car_number 车牌号
     */
    public String getCarNumber() {
        return carNumber;
    }

    /**
     * 车牌号
     * @param carNumber 车牌号
     */
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    /**
     * 入场时间
     * @return in_time 入场时间
     */
    public Date getInTime() {
        return inTime;
    }

    /**
     * 入场时间
     * @param inTime 入场时间
     */
    public void setInTime(Date inTime) {
        this.inTime = inTime;
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
     * 停车场编号
     * @return park_code 停车场编号
     */
    public String getParkCode() {
        return parkCode;
    }

    /**
     * 停车场编号
     * @param parkCode 停车场编号
     */
    public void setParkCode(String parkCode) {
        this.parkCode = parkCode;
    }

    /**
     * 入场设备名称
     * @return equip_name 入场设备名称
     */
    public String getEquipName() {
        return equipName;
    }

    /**
     * 入场设备名称
     * @param equipName 入场设备名称
     */
    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    /**
     * 入场设备编号
     * @return equip_code 入场设备编号
     */
    public String getEquipCode() {
        return equipCode;
    }

    /**
     * 入场设备编号
     * @param equipCode 入场设备编号
     */
    public void setEquipCode(String equipCode) {
        this.equipCode = equipCode;
    }

    /**
     * 入场操作员
     * @return in_operator 入场操作员
     */
    public String getInOperator() {
        return inOperator;
    }

    /**
     * 入场操作员
     * @param inOperator 入场操作员
     */
    public void setInOperator(String inOperator) {
        this.inOperator = inOperator;
    }

    /**
     * 场内车辆数
     * @return in_total 场内车辆数
     */
    public Integer getInTotal() {
        return inTotal;
    }

    /**
     * 场内车辆数
     * @param inTotal 场内车辆数
     */
    public void setInTotal(Integer inTotal) {
        this.inTotal = inTotal;
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

    /**
     * 推送方的记录编号
     * @return item_id 推送方的记录编号
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 推送方的记录编号
     * @param itemId 推送方的记录编号
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 未发行的卡号，如纸票号等
     * @return idno 未发行的卡号，如纸票号等
     */
    public String getIdno() {
        return idno;
    }

    /**
     * 未发行的卡号，如纸票号等
     * @param idno 未发行的卡号，如纸票号等
     */
    public void setIdno(String idno) {
        this.idno = idno;
    }

    /**
     * 
     * @return attach 
     */
    public String getAttach() {
        return attach;
    }

    /**
     * 
     * @param attach 
     */
    public void setAttach(String attach) {
        this.attach = attach;
    }

    /**
     * 入场图片名称
     * @return in_car_photo 入场图片名称
     */
    public String getInCarPhoto() {
        return inCarPhoto;
    }

    /**
     * 入场图片名称
     * @param inCarPhoto 入场图片名称
     */
    public void setInCarPhoto(String inCarPhoto) {
        this.inCarPhoto = inCarPhoto;
    }
}