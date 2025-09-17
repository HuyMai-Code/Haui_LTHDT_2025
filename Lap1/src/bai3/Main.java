package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Canh cua khoi lap phuong: ");
        double canh = sc.nextDouble();
        double theTich = Math.pow(canh, 3);
        System.out.println("The tich cua khoi lap phuong: " + theTich);
    }
}
