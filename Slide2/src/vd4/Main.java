package vd4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Thang: ");
        int thang = sc.nextInt();
        System.out.print("Nam: ");
        int nam = sc.nextInt();

        switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.printf("Thang %s cua nam %d co 31 ngay", thang, nam);
                break;
            case 4, 6, 9, 11:
                System.out.printf("Thang %s cua nam %d co 30 ngay", thang, nam);
                break;
            case 2:
                if (nam % 4 == 0) {
                    System.out.printf("Thang %s cua nam %d co 29 ngay", thang, nam);
                } else {
                    System.out.printf("Thang %s cua nam %d co 28 ngay", thang, nam);
                }
                break;
            default:
                System.out.println("Error");
        }
    }


}
