package com.kenson.test09.testdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * <p>Title: VisualCalendar.java</p>
 * <p>Description: 练习打印一个月的日历</p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月14日 09:15:00
 */
public class VisualCalendar {
    public static void main(String[] args) {
        System.out.println("请说如一个日期，日期的格式必须为： 2021-11-14");
        // 键盘输入
        Scanner input = new Scanner(System.in);
        String nextLine = input.nextLine();
        // 对输入的字符串转换为日期格式
        String format = DateUtilEnum.DATE_FMT_Y_M_D.getValue();
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Calendar calendar = Calendar.getInstance();

        try {
            // 首先将字符串转换为Date
            Date inputDate = dateFormat.parse(nextLine);
            // 日期转换为Calendar
            calendar.setTime(inputDate);

            // 获取今天是几号
            int today = calendar.get(Calendar.DATE);
            // 将calendar号数设置为1号
            calendar.set(Calendar.DATE, 1);
            // 获取Calendar的在一周中的第几天
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            // 获取calendar这个月的最大天数
            int maxDays = calendar.getActualMaximum(Calendar.DATE);

            // 打印星期
            System.out.println("日\t一\t二\t三\t四\t五\t六");
            // 控制一个数应该打印在星期几下面
            for (int i = 0; i < dayOfWeek - 1; i++) {
                System.out.print("\t");
            }
            // 循环打印这个月的日历
            for (int i = 1; i <= maxDays; i++) {
                // 当天前加上*号
                if (today == i) {
                    System.out.print("*");
                }
                System.out.print(i + "\t");
                // 星期天的时候需要换行
                int sunday = calendar.get(Calendar.DAY_OF_WEEK);
                // Calendar.SATURDAY == 7 , 按照西方世界一周的最后一天是姓刘，第一天是星期日
                if (sunday == Calendar.SATURDAY) {
                    System.out.println();
                }
                calendar.add(Calendar.DATE, 1);
            }

            System.out.println();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
