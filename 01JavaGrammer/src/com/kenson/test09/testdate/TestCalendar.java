package com.kenson.test09.testdate;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * <p>Title: TestCalendar.java</p>
 * <p>Description: 测试Calendar类， 所有时间相关的计算都使用Calendar类进行</p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月13日 17:51:00
 */
public class TestCalendar {
    public static void main(String[] args) {
        // 创建Calendar对象
        Calendar calendar = new GregorianCalendar();
        Calendar calendar1 = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar1);

        // Date 转Calendar
        Date now = new Date();
        long nowTime = now.getTime();

        // Date 转Calendar
        Calendar cal = Calendar.getInstance();
        // 设置time， 类型是一个long
        cal.setTimeInMillis(nowTime);
        // 直接设置Date
        cal.setTime(now);

        // Date 转字符串
        Date time = cal.getTime();
        SimpleDateFormat df = new SimpleDateFormat(DateUtilEnum.DATE_FMT_H_M_S_SSS_CN.getValue());
        String format = df.format(time);
        System.out.println(format);

        // Calendar 获取时间
        // Calendar 进行计算
        calCalendar();


    }

    /**
     * Calendar 获取时间
     */
    public void getCalendarTime() {
        Calendar cal = Calendar.getInstance();
        System.out.println("年:" + cal.get(Calendar.YEAR));
        // 注意month是从0开始的
        System.out.println("月:" + cal.get(Calendar.MONTH));
        System.out.println("日:" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时:" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分:" + cal.get(Calendar.MINUTE));
        System.out.println("秒:" + cal.get(Calendar.SECOND));
        System.out.println("一年的第几天:" + cal.get(Calendar.DAY_OF_YEAR));
        System.out.println("一周的第几天:" + cal.get(Calendar.DAY_OF_WEEK));
    }

    /**
     * Calendar初始化时间
     * @param year
     * @param month
     * @param day
     * @param hour
     * @param minute
     * @param second
     * @return
     */
    public Calendar setCalendarTime(int year, int month, int day, int hour, int minute, int second) {
        Calendar cal = Calendar.getInstance();
        // 一次性设值
        cal.set(year, month, day, hour, minute, second);
        // 也可以单个设值
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND,second);
        return cal;
    }

    /**
     * Calendar计算示例
     * @return
     */
    public static Calendar calCalendar(){
        Calendar cal = Calendar.getInstance();
        cal.set(2021, 11, 14, 9, 10, 22);
        System.out.println(cal.getTime());
        // 注意月是从0开始的 一年是以0到11的
        cal.add(Calendar.MONTH, 1);
        System.out.println(cal.getTime());
        return cal;
    }
}
