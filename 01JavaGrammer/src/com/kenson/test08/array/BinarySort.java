package com.kenson.test08.array;

import java.util.Arrays;

/**
 * <p>Title: BinarySort.java</p>
 * <p>Description: 比较普通循环查找数组某个元素和二分法查找某个元素的效率</p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月13日 09:50:00
 */
public class BinarySort {
    public static void main(String[] args) {
        int[] arr = {234, 245, 77, 3, 543, 67, 78, 95, 378, 678, 205, 753, 457, 2903, 340};
        int searchWord = 678;
        System.out.printf("普通循环查找%d 的次数是%d", searchWord, generateLoop(arr, searchWord));
        System.out.println();
        System.out.printf("二分法查找%d 的次数是%d", searchWord, binarySearch(arr, searchWord));

    }

    /**
     * 获取二分查找的次数
     * @param arr
     * @param searchWord
     * @return
     */
    public static int binarySearch(int[] arr, int searchWord) {
        // 二分法查找之前必须对数组进行排序, 二分法查找只适合有序数组
        Arrays.sort(arr);

        // 二分法查找
        int index = 0;
        int start = 0;
        int end = arr.length - 1;
        int searchTimes = 0;
        final int t = 2;
        for (int i = 0; i < end/t; i++) {
            searchTimes++;
            // 设置index的位置为数据一般的位置
            index = (start + end) / t;
            if (arr[index] < searchWord) {
                System.out.printf("搜索的数字%d , 比要搜索的数%d 小", arr[index], searchWord);
                System.out.println();
                // 指针交换
                start = index;
            } else if (arr[index] > searchWord) {
                System.out.printf("搜索的数字%d , 比要搜索的数%d 大", arr[index], searchWord);
                System.out.println();
                end = index;
            } else {
                break;
            }
        }
        return searchTimes;
    }

    public static int generateLoop(int[] arr, int searchWord) {
        int searchTimes = 0;
        for (int i = 0; i < arr.length; i++) {
            searchTimes++;
            if (searchWord == arr[i]) {
                break;
            }
        }
        return searchTimes;
    }
}
