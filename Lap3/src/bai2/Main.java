package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 9; i++) {
            System.out.println("Bang cua chuong " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d", i, j, i * j);
                System.out.println();
            }
            System.out.println("___________________________");
        }
    }
}
