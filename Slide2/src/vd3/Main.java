package vd3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tien luong: ");
        double luong = sc.nextDouble();
        double thue = 0;
        if (luong < 9000000) {
            System.out.println("Khong can dong thue");
            return;
        } else if (luong >= 9000000 && luong < 15000000) {
            thue = luong * 0.1;
        } else if (luong >= 15000000 && luong < 30000000) {
            thue = luong * 0.15;
        } else {
            thue = luong * 0.2;
        }
        System.out.println("Thue: " + thue);
    }


}
