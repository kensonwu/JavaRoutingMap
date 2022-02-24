package com.kenson.test06.inherit;

/**
 * <p>Title: Bird2.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月12日 22:26:00
 */
public class Bird2 {
    /**
     * 这就是组合
     */
    Animal2 animal2 = new Animal2();

    public void run() {
        animal2.run();
        System.out.println("我是一只小小鸟，怎么分也飞不高！");
    }

    public void eggBorn() {
        System.out.println("我是蛋生的！");
    }
}
