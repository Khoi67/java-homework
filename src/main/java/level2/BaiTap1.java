package level2;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào thu nhập hàng năm: ");
        long salary = scanner.nextInt();

        int thue;
        if(salary > 0 && salary < 5000000) {
            thue = 5;
        } else if (salary >= 5000000 && salary < 10000000) {
            thue = 10;
        } else if (salary >= 10000000 && salary < 18000000) {
            thue = 15;
        } else if (salary >= 18000000 && salary < 32000000) {
            thue = 20;
        } else if (salary >= 32000000 && salary < 52000000) {
            thue = 25;
        } else if (salary >= 52000000 && salary < 80000000) {
            thue = 30;
        } else if (salary >= 80000000){
            thue = 35;
        } else {
            System.out.println("Thu nhập không hợp lệ! Vui lòng nhập lại");
            return;
        }

        long tienThue = salary * thue / 100;

        System.out.println("Mức thuế phải trả: " + thue + "%");
        System.out.printf("Tiền thuế phải trả: %,d VND", tienThue);
    }
}
