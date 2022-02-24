package test01.comparable;

import java.util.Comparator;

/**
 * <p>Title: SortStuByIdDescComparator.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2022年02月24日 10:10:00
 */
public class SortStuByIdDescComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o2.getId() - o1.getId();
    }

}
