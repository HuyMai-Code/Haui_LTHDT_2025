package demo1;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private double diem;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten sv: ");
        this.hoTen = sc.nextLine();
        System.out.print("Diem: ");
        this.diem = sc.nextDouble();
    }
    public void xuat() {
        System.out.printf("%-10s %.2f", this.hoTen, this.diem);
        System.out.println();
    }
    public void xepLoai() {
        if (this.diem >= 8.5) {
            System.out.println("Gioi");
        } else if (this.diem < 8.5 && this.diem >= 7.5) {
            System.out.println("Kha");
        } else if (this.diem < 7.5 && this.diem >= 5) {
            System.out.println("Trung binh");
        } else {
            System.out.println("Yeu");
        }
    }
}
