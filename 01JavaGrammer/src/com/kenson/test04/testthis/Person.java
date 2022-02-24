package com.kenson.test04.testthis;

import sun.nio.cs.ext.TIS_620;

/**
 * <p>Title: Person.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月11日 23:56:00
 */
public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("第一个构造函数！");
    }

    public Person(String name, int age) {
        //通过this调用其他构造方法，必须位与第一句！
        // Constructor call must be the first statement in a constructor
        this(name);
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public void study() {
        name = "Kenson";
        System.out.println(this.toString());
        System.out.println(name + " is studying Java!");
    }
}
