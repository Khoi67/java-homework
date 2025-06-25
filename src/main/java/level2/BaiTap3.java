package level2;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một chuỗi: ");
        String chuoi = scanner.nextLine();

        System.out.println("Chuỗi sau khi xóa lặp: " + xoaKyTuLapLai(chuoi));
    }
    public static String xoaKyTuLapLai(String input) {
        String output = "";
        for(int i = 0; i < input.length(); i++) {
            char kyTu = input.charAt(i);
            boolean daTonTai = false;

            for (int j = 0; j < output.length(); j++) {
                if (output.charAt(j) == kyTu) {
                    daTonTai = true;
                    break;
                }
            }

            if(!daTonTai) {
                output += kyTu;
            }
        }
        return output;
    }
}
