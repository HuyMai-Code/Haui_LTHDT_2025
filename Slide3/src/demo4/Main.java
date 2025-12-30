package demo4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int [n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println("Trung binh cong cua cac phan tu trong mang: " + (sum / n));
        System.out.println("Lap phuong cac phan tu:");
        for (int i = 0; i < n; i++) {
            System.out.print(Math.pow(a[i], 3) + "  ");
        }
    }
}
