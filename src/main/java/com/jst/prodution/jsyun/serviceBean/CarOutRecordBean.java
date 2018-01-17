package com.jst.prodution.jsyun.serviceBean;

import java.util.Date;

import com.jst.prodution.base.bean.BaseBean;

public class CarOutRecordBean extends BaseBean{
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
     * 出场设备名称
     */
    private String outEquipName;

    /**
     * 出场设备编号
     */
    private String outEquipCode;

    /**
     * 入场设备名称
     */
    private String inEquipName;

    /**
     * 入场设备编号
     */
    private String inEquipCode;

    /**
     * 出场操作员
     */
    private String outOperator;

    /**
     * 出场类型：NORMAL-正常放行；EXCEPTION-异常放行
     */
    private String outMode;

    /**
     * 应收金额
     */
    private Double ysMoney;

    /**
     * 实收金额
     */
    private Double ssMoney;

    /**
     * 优惠金额
     */
    private Double yhMoney;

    /**
     * 免费金额
     */
    private Double freeMoney;

    /**
     * 回滚减免金额
     */
    private Double hgMoney;

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
     * 出场图片名称
     */
    private String outCarPhoto;

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
     * 出场设备名称
     * @return out_equip_name 出场设备名称
     */
    public String getOutEquipName() {
        return outEquipName;
    }

    /**
     * 出场设备名称
     * @param outEquipName 出场设备名称
     */
    public void setOutEquipName(String outEquipName) {
        this.outEquipName = outEquipName;
    }

    /**
     * 出场设备编号
     * @return out_equip_code 出场设备编号
     */
    public String getOutEquipCode() {
        return outEquipCode;
    }

    /**
     * 出场设备编号
     * @param outEquipCode 出场设备编号
     */
    public void setOutEquipCode(String outEquipCode) {
        this.outEquipCode = outEquipCode;
    }

    /**
     * 入场设备名称
     * @return in_equip_name 入场设备名称
     */
    public String getInEquipName() {
        return inEquipName;
    }

    /**
     * 入场设备名称
     * @param inEquipName 入场设备名称
     */
    public void setInEquipName(String inEquipName) {
        this.inEquipName = inEquipName;
    }

    /**
     * 入场设备编号
     * @return in_equip_code 入场设备编号
     */
    public String getInEquipCode() {
        return inEquipCode;
    }

    /**
     * 入场设备编号
     * @param inEquipCode 入场设备编号
     */
    public void setInEquipCode(String inEquipCode) {
        this.inEquipCode = inEquipCode;
    }

    /**
     * 出场操作员
     * @return out_operator 出场操作员
     */
    public String getOutOperator() {
        return outOperator;
    }

    /**
     * 出场操作员
     * @param outOperator 出场操作员
     */
    public void setOutOperator(String outOperator) {
        this.outOperator = outOperator;
    }

    /**
     * 出场类型：NORMAL-正常放行；EXCEPTION-异常放行
     * @return out_mode 出场类型：NORMAL-正常放行；EXCEPTION-异常放行
     */
    public String getOutMode() {
        return outMode;
    }

    /**
     * 出场类型：NORMAL-正常放行；EXCEPTION-异常放行
     * @param outMode 出场类型：NORMAL-正常放行；EXCEPTION-异常放行
     */
    public void setOutMode(String outMode) {
        this.outMode = outMode;
    }

    /**
     * 应收金额
     * @return ys_money 应收金额
     */
    public Double getYsMoney() {
        return ysMoney;
    }

    /**
     * 应收金额
     * @param ysMoney 应收金额
     */
    public void setYsMoney(Double ysMoney) {
        this.ysMoney = ysMoney;
    }

    /**
     * 实收金额
     * @return ss_money 实收金额
     */
    public Double getSsMoney() {
        return ssMoney;
    }

    /**
     * 实收金额
     * @param ssMoney 实收金额
     */
    public void setSsMoney(Double ssMoney) {
        this.ssMoney = ssMoney;
    }

    /**
     * 优惠金额
     * @return yh_money 优惠金额
     */
    public Double getYhMoney() {
        return yhMoney;
    }

    /**
     * 优惠金额
     * @param yhMoney 优惠金额
     */
    public void setYhMoney(Double yhMoney) {
        this.yhMoney = yhMoney;
    }

    /**
     * 免费金额
     * @return free_money 免费金额
     */
    public Double getFreeMoney() {
        return freeMoney;
    }

    /**
     * 免费金额
     * @param freeMoney 免费金额
     */
    public void setFreeMoney(Double freeMoney) {
        this.freeMoney = freeMoney;
    }

    /**
     * 回滚减免金额
     * @return hg_money 回滚减免金额
     */
    public Double getHgMoney() {
        return hgMoney;
    }

    /**
     * 回滚减免金额
     * @param hgMoney 回滚减免金额
     */
    public void setHgMoney(Double hgMoney) {
        this.hgMoney = hgMoney;
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
     * 出场图片名称
     * @return out_car_photo 出场图片名称
     */
    public String getOutCarPhoto() {
        return outCarPhoto;
    }

    /**
     * 出场图片名称
     * @param outCarPhoto 出场图片名称
     */
    public void setOutCarPhoto(String outCarPhoto) {
        this.outCarPhoto = outCarPhoto;
    }
}