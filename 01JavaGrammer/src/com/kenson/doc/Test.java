package com.kenson.doc;

import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author wuchun
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("测试char类型：");
        char charA = 'A';
        System.out.println(charA);
        Map<String, String> map = new HashMap<>(16);
        map.put("aa", "aa");
        map.put("bb", "bb");
        map.put("cc", "cc");
        map.put("dd", "dd");
        map.put("ee", "ee");
        map.put("ff", "ff");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getKey());
        }
        int [] a= {1,2,3,6,2};
        Arrays.sort(a);
    }
}
