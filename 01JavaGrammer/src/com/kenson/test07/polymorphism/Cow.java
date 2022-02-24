package com.kenson.test07.polymorphism;

/**
 * <p>Title: Cow.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月12日 22:42:00
 */
public class Cow extends Animal3 {
    @Override
    public void voice() {
        System.out.println("牛的叫声是莽莽莽！");
    }
}
