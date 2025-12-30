package demo3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chon bang cuu chuong (2 -> 9): ");
        int bang = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d", bang, i, bang * i);
            System.out.println();
        }
    }
}