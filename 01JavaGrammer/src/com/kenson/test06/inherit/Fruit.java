package com.kenson.test06.inherit;

/**
 * <p>Title: Fruit.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月12日 10:12:00
 */
public class Fruit {
    String name;
    public void taste(){
        System.out.println("Almost fruit is sweet!");
    }

    public void getFruitName(String name) {
        System.out.println("This fruit is " + name);
    }
}
