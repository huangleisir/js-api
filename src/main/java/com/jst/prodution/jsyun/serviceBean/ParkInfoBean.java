package com.jst.prodution.jsyun.serviceBean;

import java.util.Date;
import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

public class ParkInfoBean extends BaseBean{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 记录编号
     */
    private String id;

    /**
     * 停车场编号
     */
    private String parkCode;

    /**
     * 停车场名称
     */
    private String parkName;

    /**
     * 停车场联系电话
     */
    private String phone;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 车场详细地址
     */
    private String address;

    /**
     * 是否支持预定(0:不支持；1:支持)
     */
    private String isBook;
    /**
     * 是否可以停车：0-不可以; 1-可以；
     */
    private String isParking;

    /**
     * 预定费用(单位分)
     */
    private Long bookingFee;

    /**
     * 保留时长（预定业务)  单位：秒
     */
    private Integer keepTime;

    /**
     * 是否支持代扣(0：不支持1：支持)
     */
    private String isSupportWithhold;

    /**
     * 停车场图片地址
     */
    private String parkpicUrl;
    
    /**
     *  距离（m）默认3000m距离内停车场
     */
    private String ranges;
    
    
    private String parktype	; //Y	String	停车场类型	01-路边停车场；02-室内停车场；03-充电场；04-两用（可停车、可充电）
    
    /**
     * 创建时间
     */
    private Date createDatetime;
    

	private String sort; // 00：距离（默认） 01：车位数、 02：价格
	
	private List<ParkSpaceUseRecordBean> useRecordlist;//停车场使用情况
	
	private List<ParkInfoBean> parkList;//停车场列表
	
	private List<ParkChargingRuleBean> ruleList;//计费规则列表
    
	private String chargeStandard; //收费标准
	
	
	public String getChargeStandard() {
		return chargeStandard;
	}

	public void setChargeStandard(String chargeStandard) {
		this.chargeStandard = chargeStandard;
	}

	public String getIsParking() {
		return isParking;
	}

	public void setIsParking(String isParking) {
		this.isParking = isParking;
	}

	public List<ParkChargingRuleBean> getRuleList() {
		return ruleList;
	}

	public void setRuleList(List<ParkChargingRuleBean> ruleList) {
		this.ruleList = ruleList;
	}

	public List<ParkInfoBean> getParkList() {
		return parkList;
	}

	public void setParkList(List<ParkInfoBean> parkList) {
		this.parkList = parkList;
	}

	public List<ParkSpaceUseRecordBean> getUseRecordlist() {
		return useRecordlist;
	}

	public void setUseRecordlist(List<ParkSpaceUseRecordBean> useRecordlist) {
		this.useRecordlist = useRecordlist;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	/**
     * 距离（m）默认3000m距离内停车场
     * @return range 距离停车场的距离
     */
    public String getRanges() {
		return ranges;
	}

    /**
     * 距离（m）默认3000m距离内停车场
     */
	public void setRanges(String ranges) {
		this.ranges = ranges;
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
     * 停车场联系电话
     * @return phone 停车场联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 停车场联系电话
     * @param phone 停车场联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 经度
     * @return longitude 经度
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 经度
     * @param longitude 经度
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 纬度
     * @return latitude 纬度
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 纬度
     * @param latitude 纬度
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 车场详细地址
     * @return address 车场详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 车场详细地址
     * @param address 车场详细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 是否支持预定(0:不支持；1:支持)
     * @return is_book 是否支持预定(0:不支持；1:支持)
     */
    public String getIsBook() {
        return isBook;
    }

    /**
     * 是否支持预定(0:不支持；1:支持)
     * @param isBook 是否支持预定(0:不支持；1:支持)
     */
    public void setIsBook(String isBook) {
        this.isBook = isBook;
    }

    /**
     * 预定费用(单位分)
     * @return booking_fee 预定费用(单位分)
     */
    public Long getBookingFee() {
        return bookingFee;
    }

    /**
     * 预定费用(单位分)
     * @param bookingFee 预定费用(单位分)
     */
    public void setBookingFee(Long bookingFee) {
        this.bookingFee = bookingFee;
    }

    /**
     * 保留时长（预定业务)  单位：秒
     * @return keep_time 保留时长（预定业务)  单位：秒
     */
    public Integer getKeepTime() {
        return keepTime;
    }

    /**
     * 保留时长（预定业务)  单位：秒
     * @param keepTime 保留时长（预定业务)  单位：秒
     */
    public void setKeepTime(Integer keepTime) {
        this.keepTime = keepTime;
    }

    /**
     * 是否支持代扣(0：不支持1：支持)
     * @return is_support_withhold 是否支持代扣(0：不支持1：支持)
     */
    public String getIsSupportWithhold() {
        return isSupportWithhold;
    }

    /**
     * 是否支持代扣(0：不支持1：支持)
     * @param isSupportWithhold 是否支持代扣(0：不支持1：支持)
     */
    public void setIsSupportWithhold(String isSupportWithhold) {
        this.isSupportWithhold = isSupportWithhold;
    }

    /**
     * 停车场图片地址
     * @return parkpic_url 停车场图片地址
     */
    public String getParkpicUrl() {
        return parkpicUrl;
    }

    /**
     * 停车场图片地址
     * @param parkpicUrl 停车场图片地址
     */
    public void setParkpicUrl(String parkpicUrl) {
        this.parkpicUrl = parkpicUrl;
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

	public String getParktype() {
		return parktype;
	}

	public void setParktype(String parktype) {
		this.parktype = parktype;
	}
    
    
}