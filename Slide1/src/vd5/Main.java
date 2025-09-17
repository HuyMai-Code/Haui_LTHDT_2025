package vd5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ran = (int)(Math.random() * (12 - 5 + 1)) + 5;
        System.out.println("So ngau nhien tu 5 -> 12: " + ran);
        System.out.println("Can cua so do: " + Math.sqrt(ran));

        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.println("a luy b = " + Math.pow(a, b));
        System.out.println("Gia tri nho nha cua 2 so: " + Math.min(a, b));
    }
}
