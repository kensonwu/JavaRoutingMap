package com.kenson.test05.abstractclass;

/**
 * <p>Title: TestAbstractClass.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月12日 09:48:00
 */
public class TestAbstractClass {
    public static void main(String[] args) {
        Animal animal = new Cat();
        // 实际上发生了多态
        animal.run();
    }
}
