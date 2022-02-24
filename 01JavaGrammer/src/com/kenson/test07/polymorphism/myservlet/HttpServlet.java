package com.kenson.test07.polymorphism.myservlet;

/**
 * <p>Title: HttpServlet.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月12日 22:46:00
 */
public class HttpServlet {
    public void service() {
        System.out.println("HttpServlet.service");
        doGet();
    }

    public void doGet() {
        System.out.println("HttpServlet.doGet");
    }
}
