/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.park.serviceBean;

import java.util.List;

import com.jst.prodution.base.bean.BaseBean;

/**
 * 停车场列表详情Bean
 * 
 * @Package: com.jst.prodution.park.serviceBean
 * @ClassName: ParkBean
 * @Description: TODO
 *
 * @author: Administrator
 * @date: 2017年2月24日 上午9:47:22
 * @version V1.0
 * 
 * 
 */
public class ParkQuerydetailOutputBean extends BaseBean {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String parkid; // 车场ID

    private String parkname; // 车场名字

    private String parktype; // 停车场类型,01-路内停车场；02-室内停车场；03-充电场；04-两用（可停车、可充电）

    private String area;

    private String parkadr;

    private String phone;

    private String parkgps;

    private String carseatsumno;

    private String carseatleftno;

    private String ifsupportelec;// 是否支持预定,0：不支持预定 1：支持预定

    private String schedulefee;

    private String keeptime;

    private String ifsupporthold;// 是否支持代扣,0：不支持 1：支持

    private String parkpic;

    private String multiplegrade;

    private String comments;

    private String farerule;

    private String fareruledesc;

    private String chargeshow;// 给地图显示停车长图标中的数字,目前定首小时停车费用（人民币：元）

    private String resultcode;

    private String spareStatus;// 富余状态,1-全空，2-富余，3-适中，4-紧张，5-无

    private List<Faretimerange> faretimerangelist;//收费时间段列表
    
    private List<Farerule> farerulelist;//收费规则列表
    
    /**
     *  距离（m）默认3000m距离内停车场
     */
    private String ranges;
    /**
     * 更新富余状态
     * @return
     */
    public String updSpareStatus() {

        int carseatsumnoInt = 0;// 总车位数
        int carseatleftnoInt = 0;// 可用车位数
        if (null != carseatsumno && !"".equals(carseatsumno))
            carseatsumnoInt = Integer.parseInt(carseatsumno);
        if (null != carseatleftno && !"".equals(carseatleftno))
            carseatleftnoInt = Integer.parseInt(carseatleftno);
        float f = carseatleftnoInt / (float) carseatsumnoInt;
        if (f == 1f)
        {
            spareStatus = "1";
        }
        else if (f > 0.5f)
        {
            spareStatus = "2";
        }
        else if (f >= 0.2f && f <= 0.5f)
        {
            spareStatus = "3";
        }
        else if (f != 0f && f < 0.2f)
        {
            spareStatus = "4";
        }
        else if (f == 0f)
        {
            spareStatus = "5";
        }
        return spareStatus;
    }

    
    public String getRanges() {
		return ranges;
	}


	public void setRanges(String ranges) {
		this.ranges = ranges;
	}


	public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid;
    }

    public String getParkname() {
        return parkname;
    }

    public void setParkname(String parkname) {
        this.parkname = parkname;
    }

    public String getParktype() {
        return parktype;
    }

    public void setParktype(String parktype) {
        this.parktype = parktype;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getParkadr() {
        return parkadr;
    }

    public void setParkadr(String parkadr) {
        this.parkadr = parkadr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getParkgps() {
        return parkgps;
    }

    public void setParkgps(String parkgps) {
        this.parkgps = parkgps;
    }

    public String getCarseatsumno() {
        return carseatsumno;
    }

    public void setCarseatsumno(String carseatsumno) {
        this.carseatsumno = carseatsumno;
    }

    public String getCarseatleftno() {
        return carseatleftno;
    }

    public void setCarseatleftno(String carseatleftno) {
        this.carseatleftno = carseatleftno;
    }

    public String getIfsupportelec() {
        return ifsupportelec;
    }

    public void setIfsupportelec(String ifsupportelec) {
        this.ifsupportelec = ifsupportelec;
    }

    public String getSchedulefee() {
        return schedulefee;
    }

    public void setSchedulefee(String schedulefee) {
        this.schedulefee = schedulefee;
    }

    public String getKeeptime() {
        return keeptime;
    }

    public void setKeeptime(String keeptime) {
        this.keeptime = keeptime;
    }

    public String getIfsupporthold() {
        return ifsupporthold;
    }

    public void setIfsupporthold(String ifsupporthold) {
        this.ifsupporthold = ifsupporthold;
    }

    public String getParkpic() {
        return parkpic;
    }

    public void setParkpic(String parkpic) {
        this.parkpic = parkpic;
    }

    public String getMultiplegrade() {
        return multiplegrade;
    }

    public void setMultiplegrade(String multiplegrade) {
        this.multiplegrade = multiplegrade;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getFarerule() {
        return farerule;
    }

    public void setFarerule(String farerule) {
        this.farerule = farerule;
    }

    public String getFareruledesc() {
        return fareruledesc;
    }

    public void setFareruledesc(String fareruledesc) {
        this.fareruledesc = fareruledesc;
    }

    public String getChargeshow() {
        return chargeshow;
    }

    public void setChargeshow(String chargeshow) {
        this.chargeshow = chargeshow;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getSpareStatus() {
        return spareStatus;
    }

    public void setSpareStatus(String spareStatus) {
        this.spareStatus = spareStatus;
    }

    public List<Faretimerange> getFaretimerangelist() {
        return faretimerangelist;
    }

    public void setFaretimerangelist(List<Faretimerange> faretimerangelist) {
        this.faretimerangelist = faretimerangelist;
    }

    public List<Farerule> getFarerulelist() {
        return farerulelist;
    }

    public void setFarerulelist(List<Farerule> farerulelist) {
        this.farerulelist = farerulelist;
    }


}
