/*
 * Copyright 2007 HUAPU (http://www.huapu.com) 
 */
package com.jst.prodution.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;

public class DateUtil
{
	public static final String PATTERN_DATE = "yyyy-MM-dd";
	public static final String PATTERN_DATE_TWO = "yyyyMMdd";
	public static final String PATTERN_DATE_TIME = "yyyy-MM-dd HH:mm:ss";
	public static final String PATTERN_DATE_TIME_NO_BLANK = "yyyyMMddHHmmss";
	public static final String PATTERN_DATE_TIME_TWO = "MMddHHmmss";
	public static final String PATTERN_DATE_TIME_MILL = "yyyy-MM-dd HH:mm:ss.SSS";
	public static final String PATTERN_DATE_TIME_MILL_TWO = "yyyyMMddHHmmssSSS";

	public static final String PATTERN_TIME = "HH:mm:ss";
	public static final String PATTERN_TIME_TWO = "HHmmss";

	private static final Integer TIME_UNIT_MILLSECOND = 1000;
	private static final Integer TIME_UNIT_MINUTE = TIME_UNIT_MILLSECOND * 60;
	private static final Integer TIME_UNIT_HOUR = TIME_UNIT_MINUTE * 60;
	private static final Integer TIME_UNIT_DAY = TIME_UNIT_HOUR * 24;

	public static String getSysDate()
	{
		return getDateStr(PATTERN_DATE);
	}
	
	public static Integer getCuSysDate(){
		return Integer.parseInt(getDateStr(PATTERN_DATE_TWO));
	}

	public static Integer getCuSysDate(Date date){
		return Integer.parseInt(getDateStr(date, PATTERN_DATE_TWO));
	}
	
	public static String getSysDateTimeStr(){
		return getDateStr(PATTERN_DATE_TIME_TWO);
	}
	
	public static String getSysDateTimeMillisForBussNo(){
		return getDateStr(PATTERN_DATE_TIME_MILL_TWO);
	}
	
	public static String getSysDateTime() {
		return getDateStr(PATTERN_DATE_TIME);
	}
	
	/**
	 * 获取当前日期 yyyyMMddHHmmss的字符串
	 */
	public static String getSysDateTimeNoblank() {
	        return getDateStr(PATTERN_DATE_TIME_NO_BLANK);
	}
	   
	public static String getSysDateTime(Date date) {
		return getDateStr(date, PATTERN_DATE_TIME);
	}
	
	public static String getSysDateTime(long dateMill) {
		return getDateStr(new Date(dateMill), PATTERN_DATE_TIME);
	}

	public static String getSysDateTimeMillis()
	{
		return getDateStr(PATTERN_DATE_TIME_MILL);
	}

	public static String getDateStr(String pattern) {
		return format(new Date(), pattern);
	}

	public static String getDateStr(Date date, String pattern) {
		return format(date, pattern);
	}

	public static String getDateTimeStr(Date date) {
		return format(date, PATTERN_DATE_TIME);
	}

	public static String getDateTimeMillStr(Date date) {
		return format(date, PATTERN_DATE_TIME_MILL);
	}


	public static String format(Date date, String pattern)
	{
		if (date == null) {
			return null;
		}
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		return formatter.format(date);
	}
	/**
	 * 按照格式返回日期
	 * 
	 * @param args
	 */
	public static Date parseFormatDate(String aDateStr)
	{
		return parseFormatDate(aDateStr, PATTERN_DATE);
	}
	
	/**
	 * 返回时间 
	 * @param aDateStr
	 * @return
	 */
	public static Date parseFormatDateTime(String aDateStr)
	{
		return parseFormatDate(aDateStr, PATTERN_DATE_TIME);
	}
	
	/**
     * 返回时间 
     * @param aDateStr
     * @return
     */
    public static Date parseFormatDateTimeNoBlanks(String aDateStr)
    {
        return parseFormatDate(aDateStr, PATTERN_DATE_TIME_NO_BLANK);
    }

	/**
	 * 按照格式返回日期
	 * 
	 * @param args
	 */
	public static Date parseFormatDate(String aDateStr, String aDateFmtStr)
	{
		SimpleDateFormat smt = new SimpleDateFormat(aDateFmtStr);
		Date ret;
		if (aDateStr == null || aDateStr.equals(""))
			return null;
		try
		{
			ret = smt.parse(aDateStr.trim());
		}
		catch (ParseException e)
		{
			e.printStackTrace();
			return null;
		}
		return ret;
	}

	/**
	 * 取得指定月份的第一天
	 * 
	 * @param strdate
	 *            String
	 * @return String
	 */
	public static String getMonthBegin(String strdate)
	{
		Date date = parseFormatDate(strdate);
		return formatDateByFormat(date, "yy-MM") + "-01";
	}

	/**
	 * 取得指定月份的最后一天
	 * 
	 * @param strdate
	 *            String
	 * @return String
	 */
	public static String getMonthEnd(String strdate)
	{
		Date date = parseFormatDate(getMonthBegin(strdate));
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DAY_OF_YEAR, -1);
		return formatDate(calendar.getTime());
	}

	/**
	 * 常用的格式化日期
	 * 
	 * @param date
	 *            Date
	 * @return String
	 */
	public static String formatDate(Date date)
	{
		return formatDateByFormat(date, PATTERN_DATE);
	}

	/**
	 * 以指定的格式来格式化日期
	 * 
	 * @param date
	 *            Date
	 * @param format
	 *            String
	 * @return String
	 */
	public static String formatDateByFormat(Date date, String format)
	{
		String result = "";
		if (date != null && !"".equals(date))
		{
			try
			{
				SimpleDateFormat sdf = new SimpleDateFormat(format);
				result = sdf.format(date);
			}
			catch (Exception ex)
			{
				// LOGGER.info("date:" + date);
				ex.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 得到当月倒数第i天的最后时间,精确到秒
	 * 
	 * @param date
	 */
	public static Date getLastDateOfMonth(Date date, int i)
	{
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(PATTERN_DATE);
		try
		{
			c.setTime(sdf.parse(sdf.format(date)));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		c.add(Calendar.MONTH, 1);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.DAY_OF_MONTH, -i);
		c.set(Calendar.HOUR, 0);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}

	/**
	 * 得到上月倒数第i天的最后时间,精确到秒
	 * 
	 * @param date
	 */
	public static Date getLastDateOfLastMonth(Date date, int i)
	{
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(PATTERN_DATE);
		try
		{
			c.setTime(sdf.parse(sdf.format(date)));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.DAY_OF_MONTH, -i);
		c.set(Calendar.HOUR, 0);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}

	/**
	 * 得到月中的指定某天的日期
	 * 
	 * @param date
	 * @param i
	 * @return
	 */
	public static Date getDateOfMonth(Date date, int i)
	{
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(PATTERN_DATE);
		try
		{
			c.setTime(sdf.parse(sdf.format(date)));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		c.set(Calendar.DAY_OF_MONTH, i);
		return c.getTime();
	}

	/**
	 * 得到年中的指定的某月 lu
	 * 
	 * @param date
	 * @param i
	 * @return
	 */
	public static Date getDateOfYear(Date date, int i)
	{
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(PATTERN_DATE);
		try
		{
			c.setTime(sdf.parse(sdf.format(date)));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		c.set(Calendar.MONTH, i - 1);
		return c.getTime();
	}

	/**
	 * 得到所给时间当前季度的开始和结束时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date[] getSeason(Date date)
	{
		if (date != null)
		{
			Date[] season = new Date[2];
			try
			{
				int month = Integer.parseInt(new SimpleDateFormat("MM").format(date));
				String year = new SimpleDateFormat("yyyy").format(date);
				switch (month)
				{
					case 1:
					case 2:
					case 3:
						season[0] = new SimpleDateFormat(PATTERN_DATE).parse(year + "-1-1");
						season[1] = new SimpleDateFormat(PATTERN_DATE).parse(year + "-3-31");
						break;
					case 4:
					case 5:
					case 6:
						season[0] = new SimpleDateFormat(PATTERN_DATE).parse(year + "-4-1");
						season[1] = new SimpleDateFormat(PATTERN_DATE).parse(year + "-6-30");
						break;
					case 7:
					case 8:
					case 9:
						season[0] = new SimpleDateFormat(PATTERN_DATE).parse(year + "-7-1");
						season[1] = new SimpleDateFormat(PATTERN_DATE).parse(year + "-9-30");
						break;
					case 10:
					case 11:
					case 12:
						season[0] = new SimpleDateFormat(PATTERN_DATE).parse(year + "-10-1");
						season[1] = new SimpleDateFormat(PATTERN_DATE).parse(year + "-12-31");
				}
			}
			catch (Exception e)
			{
			}
			return season;
		}
		return null;
	}

	/**
	 * 得到所给日期的当月第一天和最后一天,精确到天
	 * 
	 * @param date
	 * @return
	 */
	public static Date[] getMonth(Date date)
	{
		Date[] dates = new Date[2];
		SimpleDateFormat sdf = new SimpleDateFormat(PATTERN_DATE);
		Calendar c = Calendar.getInstance();
		try
		{
			c.setTime(sdf.parse(sdf.format(date)));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		c.set(Calendar.DAY_OF_MONTH, 1);
		dates[0] = c.getTime();
		c.add(Calendar.MONTH, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		dates[1] = c.getTime();
		return dates;
	}

	/**
	 * 得到相差relative天的日期,style决定了 取到的精度
	 * 
	 * @param now
	 * @param relative
	 * @param style
	 * @return
	 */
	public static Date getRelativeDate(Date now, int relative, String style)
	{
		SimpleDateFormat sdf = new SimpleDateFormat(style);
		Calendar c = Calendar.getInstance();
		try
		{
			c.setTime(sdf.parse(sdf.format(now)));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		if (relative != 0)
		{
			c.add(Calendar.DAY_OF_MONTH, relative);
		}
		return c.getTime();
	}

	/**
	 * @param now
	 * @param relative
	 * @param style
	 * @return
	 */
	public static Date getRelativeMonth(Date now, int relative)
	{
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		if (relative != 0)
		{
			c.add(Calendar.MONTH, relative);
		}
		return c.getTime();
	}

	/**
	 * @param now
	 * @param relative
	 * @param style
	 * @return
	 */
	public static String getRelativeMonth(Date now, int relative, String style)
	{
		SimpleDateFormat sdf = new SimpleDateFormat(style);
		Calendar c = Calendar.getInstance();
		try
		{
			c.setTime(sdf.parse(sdf.format(now)));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		if (relative != 0)
		{
			c.add(Calendar.MONTH, relative);
		}
		return sdf.format(c.getTime());
	}

	/**
	 * @param now
	 * @param relative
	 * @param style
	 * @return
	 */
	public static String getRelativeMonth(String now, int relative, String style)
	{
		SimpleDateFormat sdf = new SimpleDateFormat(style);
		Calendar c = Calendar.getInstance();
		try
		{
			c.setTime(sdf.parse(now));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		if (relative != 0)
		{
			c.add(Calendar.MONTH, relative);
		}
		return sdf.format(c.getTime());
	}

	public static Integer getIntervalDays(Date startday, Date endday)
	{
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(startday);
//		long time1 = cal.getTimeInMillis();
//		cal.setTime(endday);
//		long time2 = cal.getTimeInMillis();
//		long between_days = (time2 - time1) / (1000 * 3600 * 24);
//		return Integer.parseInt(String.valueOf(between_days));  
		Calendar fromCalendar = Calendar.getInstance();  
        fromCalendar.setTime(startday);  
        fromCalendar.set(Calendar.HOUR_OF_DAY, 0);  
        fromCalendar.set(Calendar.MINUTE, 0);  
        fromCalendar.set(Calendar.SECOND, 0);  
        fromCalendar.set(Calendar.MILLISECOND, 0);  
  
        Calendar toCalendar = Calendar.getInstance();  
        toCalendar.setTime(endday);  
        toCalendar.set(Calendar.HOUR_OF_DAY, 0);  
        toCalendar.set(Calendar.MINUTE, 0);  
        toCalendar.set(Calendar.SECOND, 0);  
        toCalendar.set(Calendar.MILLISECOND, 0);  
  
        return (int) ((toCalendar.getTime().getTime() - fromCalendar.getTime().getTime()) / (1000 * 60 * 60 * 24));  
//		long sl = startday.getTime();
//		long el = endday.getTime();
//		long ei = el - sl;
//		// 根据毫秒数计算间隔天数
//		return (int) (ei / (1000 * 60 * 60 * 24));
	}

	public static Integer getIntervalMonth(Date startDate, Date endday)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);
		int s = calendar.get(Calendar.MONTH);
		calendar.setTime(endday);
		return s - calendar.get(Calendar.MONTH);
	}

	public static List<String> getMonthsBetweenTwoDays(String startDateStr, String endDateStr)
	{
		Date startDate = parseFormatDate(startDateStr, "yyyy-MM");
		Date endDate = parseFormatDate(endDateStr, "yyyy-MM");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);
		List<String> dateList = new ArrayList<String>();
		while (startDate.before(endDate))
		{
			dateList.add(formatDateByFormat(startDate, "yyyyMM"));
			calendar.add(Calendar.MONTH, 1);
			startDate = calendar.getTime();
		}
		dateList.add(formatDateByFormat(endDate, "yyyyMM"));
		return dateList;
	}

	public static List<String> getMonthsBetweenTwoDaysDesc(String startDateStr, String endDateStr)
	{
		Date startDate = parseFormatDate(startDateStr, "yyyy-MM");
		Date endDate = parseFormatDate(endDateStr, "yyyy-MM");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(endDate);
		List<String> dateList = new ArrayList<String>();
		while (endDate.after(startDate))
		{
			dateList.add(formatDateByFormat(endDate, "yyyyMM"));
			calendar.add(Calendar.MONTH, -1);
			endDate = calendar.getTime();
		}
		dateList.add(formatDateByFormat(startDate, "yyyyMM"));
		return dateList;
	}

	/**
	 * yyyy-MM-dd
	 * 
	 * @param date
	 * @return
	 */
	public static int getMonthEndInt(String date)
	{
		int endDayInt = -1;
		String endDay = getMonthEnd(date);
		if (null != endDay && !"".equals(endDay))
		{
			endDayInt = Integer.parseInt(endDay.substring(endDay.lastIndexOf("-") + 1));
		}
		return endDayInt;
	}
	
	/**
	 * 获取指定日期的上个月
	 * @param date
	 * @return
	 */
	public static Date getLastMothOfTheDay(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.MONTH, -1);//取前一个月的同一天 
		return cal.getTime();
	}

	public static void main(String[] args) throws ParseException
	{
		// System.out.println(getMonthsBetweenTwoDaysDesc("2010-06","2010-09"));
		
//		System.out.println(parseFormatDate("20161231235958", "yyyyMMddHHmmss"));
//		System.out.println(getRelativeMonth(new Date(), -4, "yyyy-MM"));
//		System.out.println(getRelativeMonth(new Date(), -1, "yyyy-MM"));
//		System.out.println(getLastDateOfLastMonth(new Date(), 0));
//		System.out.println(getMonthEndInt("2010-02-01"));
//		System.out.println(formatDateByFormat((parseFormatDateTime("2010-02-01 10:59:00")),"yyyyMMddHHmmss"));
	}

	public static Date getDatePossible(String datestr)
	{
		String[] fmt = { "MM/dd/yyyy", PATTERN_DATE, "yyyy-MM-dd HH:mm:ss" };
		Date ret = null;
		try
		{
			ret = DateUtils.parseDate(datestr, fmt);
		}
		catch (ParseException e)
		{
			ret = null;
			// e.printStackTrace();
		}
		return ret;
	}

	/**
	 * 上一天
	 */
	public static Date getLastDay(Date date)
	{
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(PATTERN_DATE);
		try
		{
			c.setTime(sdf.parse(sdf.format(date)));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		c.add(Calendar.DAY_OF_MONTH, -1);
		return c.getTime();
	}

	/**
	 * 上两天
	 */
	public static Date getLastSecondDay(Date date)
	{
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(PATTERN_DATE);
		try
		{
			c.setTime(sdf.parse(sdf.format(date)));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		c.add(Calendar.DAY_OF_MONTH, -3);
		return c.getTime();
	}
	
	/**
	 * 下一天
	 */
	public static Date getNextDay(Date date)
	{
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(PATTERN_DATE);
		try
		{
			c.setTime(sdf.parse(sdf.format(date)));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		c.add(Calendar.DAY_OF_MONTH, 1);
		return c.getTime();
	}

	/**
	 * 日期转换成命令字符串
	 */
	public static String dateToString(String date)
	{
		String[] dateArr = date.split("-");
		int m = Integer.parseInt(dateArr[1]);
		StringBuffer result = new StringBuffer();
		switch (m)
		{
			case 1:
				result.append(dateArr[2]).append("JAN");
				break;
			case 2:
				result.append(dateArr[2]).append("FEB");
				break;
			case 3:
				result.append(dateArr[2]).append("MAR");
				break;
			case 4:
				result.append(dateArr[2]).append("APR");
				break;
			case 5:
				result.append(dateArr[2]).append("MAY");
				break;
			case 6:
				result.append(dateArr[2]).append("JUN");
				break;
			case 7:
				result.append(dateArr[2]).append("JUL");
				break;
			case 8:
				result.append(dateArr[2]).append("AUG");
				break;
			case 9:
				result.append(dateArr[2]).append("SEP");
				break;
			case 10:
				result.append(dateArr[2]).append("OCT");
				break;
			case 11:
				result.append(dateArr[2]).append("NOV");
				break;
			case 12:
				result.append(dateArr[2]).append("DEC");
				break;
			default:
				break;
		}
		return result.toString();
	}

	/**
	 * 获取当前年份 月份 日期
	 */
	public static int getCurrentMonth()
	{
		Calendar c = Calendar.getInstance();
		int month = c.get(Calendar.MONTH) + 1;
		return month;
	}

	public static String getCostTime(long startTime, long endTime) {
		return getCostTime(endTime - startTime);
	}
	
	public static String getCostTime(Date startTime, Date endTime) {
		return getCostTime(startTime.getTime(), endTime.getTime());
	}
	
	/* 
	 * 毫秒转化时分秒毫秒 
	 */  
	public static String getCostTime(Long ms) {

		Long day = ms / TIME_UNIT_DAY;
		Long hour = (ms - day * TIME_UNIT_DAY) / TIME_UNIT_HOUR;
		Long minute = (ms - day * TIME_UNIT_DAY - hour * TIME_UNIT_HOUR) / TIME_UNIT_MINUTE;
		Long second = (ms - day * TIME_UNIT_DAY - hour * TIME_UNIT_HOUR - minute * TIME_UNIT_MINUTE) / TIME_UNIT_MILLSECOND;
		Long milliSecond = ms - day * TIME_UNIT_DAY - hour * TIME_UNIT_HOUR - minute * TIME_UNIT_MINUTE - second * TIME_UNIT_MILLSECOND;

		StringBuilder sb = new StringBuilder();
		if (day > 0) {
			sb.append(day + "天");
		}
		if (hour > 0) {
			sb.append(hour + "小时");
		}
		if (minute > 0) {
			sb.append(minute + "分");
		}
		if (second > 0) {
			sb.append(second + "秒");
		}
		if (milliSecond > 0) {
			sb.append(milliSecond + "毫秒");
		}
		return sb.toString();
	}
	
	//获取每月1号
    public static Date getFirstDayOfMonth(Date date,int num){
        
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);                
        rightNow.add(Calendar.MONTH,num);
        rightNow.set(Calendar.DAY_OF_MONTH, 1);
        return rightNow.getTime();
        
    }
    //获取周一
    public static Date getFirstDayOfWeek(Date date,int num){
        
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);                
        rightNow.add(Calendar.DAY_OF_WEEK_IN_MONTH ,num);
        rightNow.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return rightNow.getTime();
        
    }
    //获取每月16号   
    public static Date getMidDayOfMonth(Date date,int num){
        
        Calendar rightNow = Calendar.getInstance();
        
        rightNow.set(Calendar.DAY_OF_MONTH, 16);
        rightNow.set(Calendar.HOUR_OF_DAY,0);
        rightNow.set(Calendar.MINUTE, 0); 
        rightNow.set(Calendar.SECOND, 0); 
        rightNow.set(Calendar.MILLISECOND, 0);
        if(date.compareTo(rightNow.getTime())<0){            
        }else{
            rightNow.setTime(getFirstDayOfMonth(date,num));
        }
                    
        return rightNow.getTime();
        
    }
    /**
     * 获取num之后的日期
     * @param date
     * @param num
     * @return
     */
    public static Date addDays(Date date,int num){
        
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);       
         
        rightNow.add(Calendar.DAY_OF_YEAR,num);//
        
        return rightNow.getTime();
        
    }
    
    /**
	 * 以指定的格式来格式化日期
	 * 
	 * @param date(毫秒)
	 *            String
	 * @param format
	 *            String
	 * @return String
	 */
	public static String formatDateByFormatMillisecond(String date, String format){
		//将毫秒转化为String格式的时间
		String dateStr = getSysDateTime(Long.parseLong(date));
		//将String类型转化为Date类型
		Date rightDate = (parseFormatDateTime(dateStr));
		//将Date类型的时间转化为特定格式的String类型
        return formatDateByFormat(rightDate,format);
        
    }
}
