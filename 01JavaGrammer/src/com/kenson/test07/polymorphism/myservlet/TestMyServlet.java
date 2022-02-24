package com.kenson.test07.polymorphism.myservlet;

/**
 * <p>Title: TestMyServlet.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月12日 22:48:00
 */
public class TestMyServlet {
    public static void main(String[] args) {
        HttpServlet myServlet = new MyServlet();
        myServlet.service();
    }
}
