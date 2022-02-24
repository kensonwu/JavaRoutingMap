package com.kenson.test09.testdate;

import java.util.Date;

/**
 * <p>Title: TestDate.java</p>
 * <p>Description: 测试Date类</p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月13日 17:46:00
 */
public class TestDate {
    public static void main(String[] args) {
        // 获取当前时间
        Date now = new Date();
        System.out.println(now);
        // 获取当前时间距1970年1月1日 0时0分0秒的毫秒数
        long time = System.currentTimeMillis();
        System.out.println(time);

        Date dt = new Date(1000);
        // 废弃不再使用
        System.out.println(dt.toGMTString());
        System.out.println(dt.getTime());

    }
}
