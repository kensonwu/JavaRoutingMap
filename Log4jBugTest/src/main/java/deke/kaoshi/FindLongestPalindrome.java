package deke.kaoshi;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.util.Scanner;

/**
 * <p>Title: FindLongestPalindrome.java</p>
 * <p>Description:
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *  
 *
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 *  
 *
 * 提示：
 *
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母组成
 * </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2022年02月25日 19:52:00
 */
public class FindLongestPalindrome {
    public static String longestPalindrome(String s) {
        // 用于储存最大长度，用来判断是否需要改变左右指针
        int max = 1;
        // 左指针
        int left = 0;
        //右指针
        int right = 0;

        // 临界值
        final int pos = 2;

        // 分情况处理
        // 如果字符串长度为1时
        if (s.length() == 1) {
            return s;
        }
        // 如果字符串长度为2时，则需要比较两个字符相同，如果相同返回两个，如果不相同则返回第一个
        if (s.length() == pos) {
            if (s.charAt(0) == s.charAt(1)) {
                return s;
            } else {
                return s.charAt(0) + "";
            }
        }

        // 一般给定的字符串都是大于2时
        if (s.length() > pos) {
            for (int i = 0; i < s.length() - 1; i++) {
                int val = 1;
                // m每次遍历临时左指针
                int m = i;
                // 每次遍历临时右指针
                int n = i;
                char curChar = s.charAt(i);
                // 注意防止越界， 下面是解决```aa```这类特殊情况
                while (++m < s.length() && s.charAt(m) == curChar) {
                    val++;
                }
                while (--n >= 0 && s.charAt(n) == curChar) {
                    val++;
                }
                // 退出时，需要把m和n的值还原
                m = m == i ? m : --m;
                n = n == i ? n : ++n;

                // 定义mark 和mark1，后续判断是否相等来判断是否n需要加1
                int mark = 0;
                int mark1 = 0;
                while (++mark > 0 && ++mark < s.length() && ++mark1 > 0 && --n >= 0 && s.charAt(n) == s.charAt(m)) {
                    val += 2;
                }

                // left和right指针是否变化
                if (max < val) {
                    max = val;
                    right = m - 1;
                    if (mark1 == mark) {
                        left = n + 1;
                    } else {
                        left = n;
                    }
                }
            }

            // 返回[left, right]字符串
            return s.substring(left, right + 1);
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println("请输入一个任意字符串，我将帮你找到最长的回文字符串:");
//        Scanner scanner = new Scanner(System.in);
//        String inputStr = scanner.nextLine();
//        String l = longestPalindrome(inputStr);
        String targetStr = "babad";
        String l = longestPalindrome(targetStr);
        System.out.println("最长的回文字符串为：" + l);
    }
}
