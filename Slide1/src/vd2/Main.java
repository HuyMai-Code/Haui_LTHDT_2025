package vd2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Diem mon a (he so 2): ");
        double a = sc.nextDouble();
        System.out.print("Diem mon b: ");
        double b = sc.nextDouble();
        System.out.print("Diem mon c: ");
        double c = sc.nextDouble();
        double TB = (a * 2 + b + c) / 4;
        System.out.println("Diem tb: " + TB);
    }
}
