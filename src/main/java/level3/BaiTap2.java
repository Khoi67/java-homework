package level3;

public class BaiTap2 {
    public static void main(String[] args) {
        String input = "babadddiddd";
        System.out.println("Chuỗi đối xứng dài nhất: " + longestPalindrome(input));
    }
    public static boolean isPalindrome(String chuoi) {
        for (int i = 0; i < chuoi.length() / 2; i++) {
            if (chuoi.charAt(i) != chuoi.charAt(chuoi.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static String longestPalindrome(String s) {
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j); // Lấy chuỗi con
                if (isPalindrome(sub) && sub.length() > longest.length()) {
                    longest = sub; // Cập nhật nếu dài hơn
                }
            }
        }

        return longest;
    }
}
