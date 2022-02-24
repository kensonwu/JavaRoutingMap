package com.kenson.test07.polymorphism.myservlet;

/**
 * <p>Title: MyServlet.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月12日 22:47:00
 */
public class MyServlet extends HttpServlet {
    @Override
    public void doGet() {
        System.out.println("MyServlet.doGet");
    }
}
