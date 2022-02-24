package com.kenson.test02.teststatic;

import java.security.PublicKey;

/**
 * <p>Title: Student.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月11日 23:40:00
 */
public class Student {
    String name = "张三";
    int id;
    static int age;

    public static void printAge() {
        System.out.println(age);
    }

    public void study() {
        System.out.println(name + " is  studying!");
    }

    public void sayHello(String anotherGuy) {
        System.out.println(name + "is say Hello to " + anotherGuy + "!");
    }
}
