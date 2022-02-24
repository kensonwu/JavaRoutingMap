package com.kensonb.test01.object;

import com.kenson.doc.test01.object.Mobile;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingUse;

/**
 * <p>Title: TestObject.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月11日 23:32:00
 */
public class TestObject {
    public static void main(String[] args) {
        Object obj = new Object();
        // 输出结果为： java.lang.Object@1540e19d
        System.out.println(obj.toString());

        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj.equals(obj2));
        System.out.println(obj1 == obj2);

        Mobile mobile = new Mobile();
        // 重写了toString方法
        String s = mobile.toString();
        System.out.println(s);

    }
}
