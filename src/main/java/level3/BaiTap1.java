package level3;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = {2, 7, 11, 15};

        System.out.println("Một mảng có sẵn: " + Arrays.toString(number));
        System.out.print("Nhập vào target: ");
        int target = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (number[i] + number[j] == target) {
                    System.out.println("Vị trí của index: " + (i+1) + " và " + (j+1));
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        if (!found) {
            System.out.println("Không có cặp nào có tổng bằng " + target);
        }
    }
}
