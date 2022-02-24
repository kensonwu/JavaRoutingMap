package com.kenson.test08.array;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * <p>Title: TestStringBuilder.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月13日 16:46:00
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        // 默认初始长度为16
        StringBuilder stringBuilder1 = new StringBuilder();
        // 自定义初始长度为32
        StringBuilder stringBuilder2 = new StringBuilder(32);
        // 初始长度为20
        StringBuilder stringBuilder3 = new StringBuilder("abcd");
        // 通过return this实现方法链
        stringBuilder2.append("cd").append("ef").append("gh").append("ij");
        stringBuilder2.append(true);
        System.out.println(stringBuilder2);

        // delete方法
        StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        sb.delete(3, 5).delete(3, 5);
        System.out.println(sb);

        //reverse 方法
        sb.reverse();
        System.out.println(sb);

        // StringBuffer
        StringBuffer stringBuffer = new StringBuffer();

        // StringBuilder: 线程不安全 效率相对高一些， StringBuffer线程安全， 效率要低一些。
    }
}
