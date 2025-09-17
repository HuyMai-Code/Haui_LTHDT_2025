package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int a = sc.nextInt();
        boolean ok = true;
        if (a < 2) {
            System.out.println(a + " ko phai la so nguyen to");
            return;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                ok = false;
                break;
            }
        }
        if (ok) {
            System.out.println(a + " la so nguyen to");
        } else {
            System.out.println(a + " ko phai la so nguyen to");
        }
    }
}
