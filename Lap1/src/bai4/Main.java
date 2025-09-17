package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        double canDelta = Math.sqrt(delta);
        System.out.println("Can delta: " + canDelta);
    }
}
