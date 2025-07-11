package level2;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một chuỗi để kiểm tra đối xứng: ");
        String chuoi = scanner.nextLine();

        if(isPalindrome(chuoi)) {
            System.out.println("Đây là chuỗi đối xứng!");
        } else {
            System.out.println("Đây không phải là chuỗi đối xứng!");
        }
    }
    public static boolean isPalindrome(String chuoi) {
        for (int i = 0; i < chuoi.length() / 2; i++) {
            if (chuoi.charAt(i) != chuoi.charAt(chuoi.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
