package com.kenson.test07.polymorphism;

/**
 * <p>Title: Dog.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月12日 22:40:00
 */
public class Dog extends Animal3 {
    @Override
    public void voice() {
        System.out.println("狗的叫声是汪汪汪！");
    }

    public void eatBone() {
        System.out.println("狗而是要吃骨头的！");
    }
}
