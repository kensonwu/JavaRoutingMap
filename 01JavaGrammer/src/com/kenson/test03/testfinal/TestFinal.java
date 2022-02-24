package com.kenson.test03.testfinal;

import com.kenson.doc.Test;

/**
 * <p>Title: TestFinal.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月11日 23:48:00
 */
public class TestFinal {
    final int MAX_VALUE = Integer.MAX_VALUE;
    double pi = Math.PI;

    public static void main(String[] args) {
        TestFinal testFinal = new TestFinal();
        System.out.println(testFinal.MAX_VALUE);
        System.out.println(testFinal.pi);
    }
}
