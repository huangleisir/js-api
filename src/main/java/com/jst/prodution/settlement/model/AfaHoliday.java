package com.jst.prodution.settlement.model;

public class AfaHoliday implements java.io.Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String workdate;

    private String holidayflag;

    private String remark;

    public String getWorkdate() {
        return workdate;
    }

    public void setWorkdate(String workdate) {
        this.workdate = workdate == null ? null : workdate.trim();
    }

    public String getHolidayflag() {
        return holidayflag;
    }

    public void setHolidayflag(String holidayflag) {
        this.holidayflag = holidayflag == null ? null : holidayflag.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}