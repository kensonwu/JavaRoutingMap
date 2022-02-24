package com.kenson.test08.array;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

/**
 * <p>Title: DefineArray.java</p>
 * <p>Description: 定义数组以及初始化数据</p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月12日 22:52:00
 */
public class DefineArray {
    public static void main(String[] args) {
        /**
         * 1.数组是相同数据类型的集合
         * 2.数组也是对象，数组相当于对象的成员变量（详见内存图）
         * 3.数组长度的确定的，不可变的，如果越界，则报错：ArrayIndexOutOfBoundsException
         */
        // 声明 常用方式 为  int [] a = new int[10]
        // JDK喜欢使用 int a [] = new int[10]

        int[] firstArray = new int[3];
        // 初始化1: 单个元素逐个初始化
        firstArray[0] = 0;
        firstArray[1] = 3;
        firstArray[2] = 9;

        //初始化2：静态初始化
        int[] secondArray = {11, 23, 45, 89};

        // 初始化3： 动态初始化
        int[] thirdArray = new int[3];
        for (int i = 0; i < 3; i++) {
            thirdArray[i] = i * 12;
        }


        // 定义对象为数组，也就是数组里面存放的全是对象
        Car[] cars = new Car[4];
        cars[0] = new Car("Benz");
        cars[1] = new Car("Geely");
        cars[2] = new Car("BMW");
        cars[3] = new Car("BYD");

        System.out.println(cars[0].name);
        // length 是属性不是方法
        System.out.println(firstArray.length);

        // 使用增强for遍历数组
        for (Car car : cars) {
            System.out.println(car.name);
        }


    }
}
