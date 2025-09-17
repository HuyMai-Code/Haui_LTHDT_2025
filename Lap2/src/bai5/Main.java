package bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem: ");
        double diem = sc.nextDouble();
        if (diem >= 8) {
            System.out.println("Gioi");
        } else if (diem >= 7 && diem < 8) {
            System.out.println("Kha");
        } else if (diem >= 5 && diem < 7) {
            System.out.println("Trung binh");
        } else {
            System.out.println("Kem");
        }
    }
}
