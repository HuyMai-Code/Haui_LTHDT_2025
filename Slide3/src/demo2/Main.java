package demo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.print("Nhap diem thu " + (i + 1) + ": ");
            double diem = sc.nextDouble();
        }

    }
}
