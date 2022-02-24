package com.kenson.test08.array;

/**
 * <p>Title: TestString.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月13日 15:42:00
 */
public class TestString {
    public static void main(String[] args) {
        // 定义String
        String str1 = "first";
        String str2 = new String("first");
        char[] c = {'a', 'b', 'c', 'd'};
        String str3 = new String(c);
        String str4 = new String(c, 0,3);
        System.out.println(str4);

        // ==与equals的区别
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);

        // indexOf
        System.out.println(str1.indexOf("s"));
        // 截取字符串 substring 截取时包头不包尾
        System.out.println(str1.substring(0,2));
        // 替换replace 和 replaceAll()
        System.out.println(str1.replace("i","b"));

        //split
        String str5 = "1212,21313,43432432";
        String[] strArray = str5.split(",");
        System.out.println("strArray的长度为:" + strArray.length);
        for (String s : strArray) {
            System.out.println(s);
        }

        // compareTo
        System.out.println(str1.compareTo(str2));

        //codePointBefore
        char a = 'a';
        System.out.println((int) a);
        System.out.println("abc".codePointBefore(3));

        int num = -32;
        // 二进制数
        System.out.println("num本身的二进制数:" + Integer.toBinaryString(num));
        //左移一位
        System.out.println("左移一位：" + Integer.toBinaryString(num << 1));
        // 右移一位
        System.out.println("右移一位：" + Integer.toBinaryString(num >> 1));
        //无符号右移16位:
        System.out.println("无符号右移16位:" + Integer.toBinaryString(num >>> 16));

        // hasCode
        System.out.println("abcdefghigklmk".hashCode());
        System.out.println("abcd".indexOf(99, 1));
    }
}
