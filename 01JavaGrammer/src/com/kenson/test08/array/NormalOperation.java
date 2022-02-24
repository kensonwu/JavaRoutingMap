package com.kenson.test08.array;

import java.util.Arrays;

/**
 * <p>Title: NormalOperation.java</p>
 * <p>Description: 数组的常用操作</p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月12日 23:12:00
 */
public class NormalOperation {
    public static void main(String[] args) {
        int[] arr = {11, 23, 45, 5, 99, 100};
        String[] s = {"Microsfot", "Sun", "IBM", "Oracle", "Apple"};

        // 数组拷贝
        String[] destArr = new String[6];
        System.arraycopy(s,0,destArr,0,2);

        // 打印数组
        System.out.println(Arrays.toString(destArr));

        // 数组排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 二分法查找
        int[] c = {1,2,323,23,543,12,59};
        // 二分法查找必须要先排序
        Arrays.sort(c);
        System.out.println("钙元素的索引为：" + Arrays.binarySearch(c, 12));
    }
}
