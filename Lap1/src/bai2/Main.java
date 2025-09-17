package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu dai: ");
        double dai = sc.nextDouble();
        System.out.print("Chieu rong: ");
        double rong = sc.nextDouble();
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNho = Math.min(dai, rong);

        System.out.println("Chu vi hinh chu nhat: " + chuVi);
        System.out.println("Dien tich hinh chu nhat: " + dienTich);
        System.out.println("Canh nho: " + canhNho);
    }
}
