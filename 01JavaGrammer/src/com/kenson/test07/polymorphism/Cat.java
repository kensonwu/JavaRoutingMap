package com.kenson.test07.polymorphism;

/**
 * <p>Title: Cat.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月12日 22:38:00
 */
public class Cat extends Animal3 {
    @Override
    public void voice() {
        System.out.println("猫的叫声是喵喵喵！");
    }

    public void catchMouse() {
        System.out.println("猫可以抓住老鼠！");
    }
}
