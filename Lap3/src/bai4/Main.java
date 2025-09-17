package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("So sinh vien: ");
        int n = sc.nextInt();
        String[] sv = new String[n];
        double[] diem = new double[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            sv[i] = sc.nextLine();
            diem[i] = sc.nextDouble();
        }
        System.out.println("In ra cac phan tu:");
        for (int i = 0; i < n; i++) {
            if (diem[i] < 5) {
                System.out.printf("Ho ten: %s. Diem: %.2f. Hoc luc: Yeu", sv[i], diem[i]);
            } else if (diem[i] >= 5 && diem[i] < 6.5) {
                System.out.printf("Ho ten: %s. Diem: %.2f. Hoc luc: Trung binh", sv[i], diem[i]);
            } else if (diem[i] >= 6.5 && diem[i] < 7.5) {
                System.out.printf("Ho ten: %s. Diem: %.2f. Hoc luc: Kha", sv[i], diem[i]);
            } else if (diem[i] >= 7.5 && diem[i] < 9) {
                System.out.printf("Ho ten: %s. Diem: %.2f. Hoc luc: Gioi", sv[i], diem[i]);
            } else {
                System.out.printf("Ho ten: %s. Diem: %.2f. Hoc luc: Xuat sac", sv[i], diem[i]);
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (diem[j] > diem[j + 1]) {
                    double tmp = diem[j];
                    String tmp1 = sv[j];
                    diem[j] = diem[j + 1];
                    diem[j + 1] = tmp;
                    sv[j] = sv[j + 1];
                    sv[j + 1] = tmp1;
                }
            }
        }
        System.out.println("Sau khi duoc sap xep tang dan:");
        for (int i = 0; i < n; i++) {
            if (diem[i] < 5) {
                System.out.printf("Ho ten: %s. Diem: %.2f. Hoc luc: Yeu", sv[i], diem[i]);
            } else if (diem[i] >= 5 && diem[i] < 6.5) {
                System.out.printf("Ho ten: %s. Diem: %.2f. Hoc luc: Trung binh", sv[i], diem[i]);
            } else if (diem[i] >= 6.5 && diem[i] < 7.5) {
                System.out.printf("Ho ten: %s. Diem: %.2f. Hoc luc: Kha", sv[i], diem[i]);
            } else if (diem[i] >= 7.5 && diem[i] < 9) {
                System.out.printf("Ho ten: %s. Diem: %.2f. Hoc luc: Gioi", sv[i], diem[i]);
            } else {
                System.out.printf("Ho ten: %s. Diem: %.2f. Hoc luc: Xuat sac", sv[i], diem[i]);
            }
            System.out.println();
        }
    }
}
