package com.kenson.test05.abstractclass;

/**
 * <p>Title: Dog.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月12日 09:54:00
 */
public class Dog extends  Animal{
    @Override
    public void run() {
        System.out.println("Dog is running fast!");
    }
}
