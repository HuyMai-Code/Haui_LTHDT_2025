package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Diem TB: ");
        double diemTB = sc.nextDouble();

        System.out.printf("%s, %.2f diem", hoTen, diemTB);
    }
}
