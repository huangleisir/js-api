package com.jst.prodution.jsyun.serviceBean;

import java.io.Serializable;
import java.util.Date;

public class ParkSpaceUseRecordBean implements Serializable{
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
     * 车场总车位数
     */
    private Integer totalSpace;

    /**
     * 剩余车位数
     */
    private Integer remainSpace;

    /**
     * 创建时间
     */
    private Date createDatetime;

    /**
     * 总可预订车位数
     */
    private Integer totalBookSpace;

    /**
     * 剩余可预订车位数
     */
    private Integer remainBookSpace;

    /**
     * 最后更新时间
     */
    private Date lastUpdateTime;

    /**
     * 更新版本号
     */
    private Long versionNo;

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
     * 车场总车位数
     * @return total_space 车场总车位数
     */
    public Integer getTotalSpace() {
        return totalSpace;
    }

    /**
     * 车场总车位数
     * @param totalSpace 车场总车位数
     */
    public void setTotalSpace(Integer totalSpace) {
        this.totalSpace = totalSpace;
    }

    /**
     * 剩余车位数
     * @return remain_space 剩余车位数
     */
    public Integer getRemainSpace() {
        return remainSpace;
    }

    /**
     * 剩余车位数
     * @param remainSpace 剩余车位数
     */
    public void setRemainSpace(Integer remainSpace) {
        this.remainSpace = remainSpace;
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
     * 总可预订车位数
     * @return total_book_space 总可预订车位数
     */
    public Integer getTotalBookSpace() {
        return totalBookSpace;
    }

    /**
     * 总可预订车位数
     * @param totalBookSpace 总可预订车位数
     */
    public void setTotalBookSpace(Integer totalBookSpace) {
        this.totalBookSpace = totalBookSpace;
    }

    /**
     * 剩余可预订车位数
     * @return remain_book_space 剩余可预订车位数
     */
    public Integer getRemainBookSpace() {
        return remainBookSpace;
    }

    /**
     * 剩余可预订车位数
     * @param remainBookSpace 剩余可预订车位数
     */
    public void setRemainBookSpace(Integer remainBookSpace) {
        this.remainBookSpace = remainBookSpace;
    }

    /**
     * 最后更新时间
     * @return last_update_time 最后更新时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 最后更新时间
     * @param lastUpdateTime 最后更新时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 更新版本号
     * @return version_no 更新版本号
     */
    public Long getVersionNo() {
        return versionNo;
    }

    /**
     * 更新版本号
     * @param versionNo 更新版本号
     */
    public void setVersionNo(Long versionNo) {
        this.versionNo = versionNo;
    }
}