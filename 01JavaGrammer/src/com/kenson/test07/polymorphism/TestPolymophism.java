package com.kenson.test07.polymorphism;

/**
 * <p>Title: TestPolymophism.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月12日 22:43:00
 */
public class TestPolymophism {
    public static void main(String[] args) {
        // 其实是隐式的自动转型为了Animal3
        Animal3 cat = new Cat();
        cat.voice();
        Animal3 dog = new Dog();
        dog.voice();
        Animal3 cow = new Cow();
        cow.voice();
        Animal3 pig = new Pig();
        pig.voice();
    }
}
