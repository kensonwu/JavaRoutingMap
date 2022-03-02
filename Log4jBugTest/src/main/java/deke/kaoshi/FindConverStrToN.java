package deke.kaoshi;

/**
 * <p>Title: FindLengthOfLongestSubstring.java</p>
 * <p>Description: 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。</p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2022年02月26日 22:58:00
 */
public class FindConverStrToN {
    public static String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows == 1) {
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        int index = 0;
        int t = 1;
        for (char c : s.toCharArray()) {
            sb[index].append(c);
            index = index + t;
            if (index == numRows - 1 || index == 0) {
                t = -t;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            res.append(sb[i]);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(convert(s, 3));
        Integer a = 100;
        System.out.println(a.doubleValue());
    }
}
