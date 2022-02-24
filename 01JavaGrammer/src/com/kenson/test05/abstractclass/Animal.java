package com.kenson.test05.abstractclass;

/**
 * <p>Title: Animal.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月12日 09:52:00
 */
public abstract class Animal {
    String name;

    public abstract void run();

    public void beath() {
        System.out.println("Breath!!!");
    }
}
