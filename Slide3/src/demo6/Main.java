package demo6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so sv: ");
        int n = sc.nextInt();
        String[] sv = new String[n];
        double[] diem = new double[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Ho ten sv thu " + (i + 1) + ": ");
            sv[i] = sc.nextLine();
            System.out.print("Diem cua sv thu " + (i + 1) + ": ");
            diem[i] = sc.nextDouble();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (diem[j] < diem[j + 1]) {
                    String tmp1 = sv[j];
                    double tmp2 = diem[j];
                    sv[j] = sv[j + 1];
                    sv[j + 1] = tmp1;
                    diem[j] = diem[j + 1];
                    diem[j + 1] = tmp2;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%-15s | %3.2f", sv[i], diem[i]);
            System.out.println();
        }
    }
}