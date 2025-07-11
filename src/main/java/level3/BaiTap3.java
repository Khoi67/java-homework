package level3;

import java.util.HashMap;

public class BaiTap3 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANEFHIGOOEMOC";
        String t = "ABC";

        String result = minWindow(s, t);
        System.out.println("Chuỗi con nhỏ nhất: " + result);  // BANC
    }
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        HashMap<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();
        int have = 0;
        int needCount = need.size();

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            right++;

            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).intValue() == need.get(c).intValue()) {
                    have++;
                }
            }
            while (have == needCount) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minStart = left;
                }

                char d = s.charAt(left);
                left++;

                if (need.containsKey(d)) {
                    if (window.get(d).intValue() == need.get(d).intValue()) {
                        have--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }

        if (minLen == Integer.MAX_VALUE) return "";
        return s.substring(minStart, minStart + minLen);
    }
}
