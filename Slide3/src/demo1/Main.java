package demo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bang cuu chuong 7: ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d", 7, i, 7 * i);
            System.out.println();
        }
        int sum = 0;
        int count = 0;
        for (int i = 27; i <= 250; i++) {
            if (i % 3 == 0) {
                sum += i;
                count ++;
            }
        }
        System.out.println("Trung binh cong cac so chia het cho 3 tu 27 -> 250: " + (sum / count));

    }
}
