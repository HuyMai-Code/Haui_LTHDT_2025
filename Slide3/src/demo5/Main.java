package demo5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sv = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Sinh vien " + (i + 1) + ": ");
            sv[i] = sc.nextLine();
        }
        Arrays.sort(sv);
        System.out.println("Da duoc sap xep tang dan theo alphabet:");
        for (String x : sv) {
            System.out.print(x + ", ");
        }
    }
}