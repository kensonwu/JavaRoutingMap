package com.kenson.test02.teststatic;

/**
 * <p>Title: TestStatic.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月11日 23:39:00
 */
public class TestStatic {
    public static void main(String[] args) {
        // 调用类的静态成员变量并赋值
        Student.age = 20;
        // 调用方法的静态方法
        Student.printAge();

        Student student = new Student();
        student.sayHello("xiao ming");

    }
}
