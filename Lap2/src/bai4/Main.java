package bai4;

import java.util.Scanner;

public class Main {

    public static void PTB1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ta co: ax + b = 0");

        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Vo so nghiem");
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            double x = -(b / a);
            System.out.println("x = " + x);
        }
    }
    public static void PTB2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Vo so nghiem");
                } else {
                    System.out.println("Vo nghiem");
                }
            } else {
                double x = -(b/a);
                System.out.println("x = " + x);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Vo nghiem");
            } else if (delta == 0) {
                double x = -b/(2*a);
                System.out.println("Co nghiem kep x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Co 2 nghiem: x1 = %f  x2 = %f", x1, x2);
            }
        }
    }
    public static void tinhTienDien() {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("+------------------------------------+");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("+------------------------------------+");
            System.out.print("Lua chon cua ban: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    PTB1();
                    break;
                case 2:
                    PTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (choose != 4);
    }
}
