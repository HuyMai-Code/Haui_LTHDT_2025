package demoMoRong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static double gtln(ArrayList<Double> a) {
        double res = a.get(0);

        for (int i = 1; i < a.size(); i++) {
            res = Math.max(res, a.get(i));
        }
        return res;
    }
    public static double gtnn(ArrayList<Double> a) {
        double res = a.get(0);

        for (int i = 1; i < a.size(); i++) {
            res = Math.min(res, a.get(i));
        }
        return res;
    }
    public static void sapXep(ArrayList<Double> a) {
        Collections.sort(a);
        System.out.println("Mang sau khi dc sap xep:");
        for (double x : a) {
            System.out.print(x + " ");
        }
    }
    public static void timKiem(ArrayList<Double> a) {
        Collections.sort(a);
        System.out.println("Mang sau khi dc sap xep:");
        for (double x : a) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> a = new ArrayList<>();
        System.out.print("So phan tu cua mang: ");
        int n = sc.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            double x = sc.nextDouble();
            a.add(x);
            sum += x;
        }
        int choose;
        do {
            System.out.println("1. Tim GTLN");
            System.out.println("2. Tim GTNN");
            System.out.println("3. Sap xep");
            System.out.println("4. Tinh tong");
            System.out.println("5. Tinh TB");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Gia tri lon nhat: " + gtln(a));
                    break;
                case 2:
                    System.out.println("Gia tri nho nhat: " + gtnn(a));
                    break;
                case 3:
                    sapXep(a);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Tong cua cac phan tu: " + sum);
                    break;
                case 5:
                    System.out.println("Trung binh cong cua cac phan tu: " + (double)(sum / n));
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh thanh cong");
                    break;
                default:
                    System.out.println("Yeu cau nhap lai");
            }
        } while (choose != 0);
    }
}
