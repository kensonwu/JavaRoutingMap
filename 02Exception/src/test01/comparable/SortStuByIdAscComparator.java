package test01.comparable;

import java.util.Comparator;

/**
 * <p>Title: SortStuByIdAscComparator.java</p>
 * <p>Description: 根据学生ID升序排序的比较器</p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2022年02月24日 10:03:00
 */
public class SortStuByIdAscComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.getId() - o2.getId();
    }

    @Override
    public Comparator<Student2> reversed() {
        return Comparator.super.reversed();
    }
}
