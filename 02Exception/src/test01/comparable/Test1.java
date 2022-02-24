package test01.comparable;

import java.util.Arrays;

/**
 * <p>Title: Test1.java</p>
 * <p>Description: 使用Comparable实现对对象排序</p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2022年02月24日 09:13:00
 */
public class Test1 {
    public static void main(String[] args) {
        Student[] stus = new Student[5];
        stus[0] = new Student(1, "name1", 100);
        stus[1] = new Student(5, "name5", 70);
        stus[2] = new Student(3, "name3", 80);
        stus[3] = new Student(2, "name2", 20);
        stus[4] = new Student(4, "name4", 88);
        // 此时打印的结果是未排序的
        printArray(stus);

        // 需求1： 如何对学生按照ID排序？
        // 实现方式是： 对需要排序的类实现Comparable接口并实现compareTo() 方法
        // 此种排序的方式是有缺陷的， 不能随意根据实际业务变化来实现多种方式排序，而且排序的规则比较单一
        Arrays.sort(stus);
        System.out.println("===============");
        printArray(stus);
    }

    public static void printArray(Object[] obj) {
        if (obj == null || obj.length == 0) {
            System.out.println("The array is empty!");
        } else {
            for (Object o : obj) {
                System.out.println(o);
            }
        }
    }
}
