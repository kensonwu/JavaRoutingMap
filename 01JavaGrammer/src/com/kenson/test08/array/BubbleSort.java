package com.kenson.test08.array;

import java.util.Arrays;

/**
 * <p>Title: BubbleSort.java</p>
 * <p>Description: 冒泡排序</p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月13日 11:34:00
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] values = {3, 1, 6, 2, 9, 0, 7, 4, 5, 8};
        bubbleSort(values);
        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(args));
    }

    public static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }
}
