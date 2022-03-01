package deke.kaoshi;

/**
 * <p>Title: FindLengthOfLongestSubstring.java</p>
 * <p>Description: 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。</p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2022年02月26日 22:58:00
 */
public class FindLengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        /**
         * 以这个字符串为例：abcabcbb，当i等于3时，也就是指向了第二个a, 此时我就需要查之前有没有出现过a,
         * 如果出现了是在哪一个位置出现的。然后通过last[index] 查到等于1,
         * 也就是说，如果start 依然等于0的话，那么当前窗口就有两个a了，也就是字符串重复了，
         * 所以我们需要移动当前窗口的start指针，移动到什么地方呢？移动到什么地方，窗口内就没有重复元素了呢？
         * 对了，就是a上一次出现的位置的下一个位置，就是1 + 1 = 2。当start == 2, 当前窗口就没有了重复元素，
         * 那么以当前字符为结尾的最长无重复子串就是bca,然后再和之前的res取最大值。然后i指向后面的位置，按照同样思路计算。
         */
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        // 数组每个元素赋值为 -1
//        for(int i = 0; i < 128; i++){
//            last[i] = -1;
//        }
        int strLen = s.length();
        int res = 0;
        //开始位置
        int start = 0;
        for(int i = 0; i < strLen; i++){
            int index = s.charAt(i);
            start = Math.max(start, last[index]);
            res = Math.max(res, i - start + 1);
            last[index] = i + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
