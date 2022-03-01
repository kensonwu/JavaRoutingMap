package deke.kaoshi;

import java.util.Scanner;

/**
 * <p>Title: FindLongestPalindrome.java</p>
 * <p>Description:
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 * <p>
 * 输入：s = "cbbd"
 * 输出："bb"
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母组成
 * 使用动态规划的方式解决
 * </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2022年02月25日 19:52:00
 */
public class FindLongestPalindrome2 {
    public static String longestPalindrome2(String s) {
        int n = s.length();
        int[] ans = new int[2];
        boolean[][] dq = new boolean[n][n];
        int max = 1;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < j; i++) {
                dq[i][j] = (s.charAt(i) == s.charAt(j)) && (j - i < 3 || dq[i + 1][j - 1]);
                if (dq[i][j] && max < j - i + 1) {
                    max = j - i + 1;
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return s.substring(ans[0], ans[1] + 1);
    }

    public static void main(String[] args) {
        System.out.println("请输入一个任意字符串，我将帮你找到最长的回文字符串:");
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String l = longestPalindrome2(inputStr);
//        String targetStr = "aaa";
//        String l = longestPalindrome2(targetStr);
        System.out.println("最长的回文字符串为：" + l);
    }
}
