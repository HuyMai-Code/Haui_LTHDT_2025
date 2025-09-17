package vd1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        double a = sc.nextDouble();
        if (a > 0) {
            System.out.println("Can bac 2: " + Math.sqrt(a));
        }
    }


}
