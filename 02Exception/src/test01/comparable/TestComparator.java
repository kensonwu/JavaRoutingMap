package test01.comparable;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <p>Title: TestComparator.java</p>
 * <p>Description: 测试使用Comparator比较实现对对象的排序</p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2022年02月24日 09:59:00
 */
public class TestComparator {
    public static void main(String[] args) {
        // 1.模拟实际业务中需要排序的数据
        Student2[] stus = new Student2[5];
        stus[0] = new Student2(1, "name1", 100);
        stus[1] = new Student2(5, "name5", 70);
        stus[2] = new Student2(3, "name3", 80);
        stus[3] = new Student2(2, "name2", 20);
        stus[4] = new Student2(4, "name4", 88);

        // 2. 定义学生的比较器并获取比较器
        SortStuByIdAscComparator sortStuByIdAscComparator = new SortStuByIdAscComparator();
        // 3.使用 Arrays.sort方法进行排序， 需要传入排序的对象和比较器
        Arrays.sort(stus, sortStuByIdAscComparator);

        // 4. 打印排序后的结果
        printArray(stus);

        // 通过定义多个Comparator的比较器来实现对于不同业务场景需要不同排序规则的需求。
        // 对于不同场景需要不同排序的场景， 我们可以通过配置文件或者通过反射的方式来实现切换不同的比较器
        SortStuByIdDescComparator sortStuByIdDescComparator = new SortStuByIdDescComparator();
        Arrays.sort(stus, sortStuByIdDescComparator);
        printArray(stus);

        // 使用内部类的方式精简代码， 因为比较的代码很简单，没必要单独写一个类来实现
        Comparator<Student2> scoreComparator = new Comparator<Student2>(){
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return (int) (o1.getScore() * 100 - o2.getScore() * 100);
            }
        };
        Arrays.sort(stus, scoreComparator);
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
