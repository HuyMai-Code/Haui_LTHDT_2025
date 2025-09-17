package bai3;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int minValue = arr[0];
        int sum = 0;
        int dem = 0;
        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            minValue = Math.min(minValue, arr[i]);
            if (arr[i] % 3 == 0) {
                sum += arr[i];
                dem++;
            }
        }
        System.out.println();
        double tb = (double)sum/dem;
        // or minValue = arr[0]
        System.out.println("Gia tri nho nhat cua mang: " + minValue);
        System.out.println("Trung binh cac phan tu trong mang chia het cho 3: " + tb);
    }
}