package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien: ");
        int soDien = sc.nextInt();
        double tien = 0;
        if (soDien >= 0 && soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }
        System.out.println("Tien dien: " + tien);
    }
}
