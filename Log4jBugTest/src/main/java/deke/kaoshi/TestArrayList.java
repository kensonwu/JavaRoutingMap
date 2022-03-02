package deke.kaoshi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * <p>Title: TestArrayList.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2022年03月02日 15:48:00
 */
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("11");
        list.add("23");
        list.add("45");
        list.add("67");
        list.add("89");
        list.add("10");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("89")) {
                // 遍历集合时，使用迭代器添加元素
                iterator.add("html");
            }

            System.out.println(fun(next));

        }
        System.out.println(list);
    }

    public static <Q> Q fun(Q q){
        return q;
    }
}
