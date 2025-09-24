package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;
    public SanPham() {}
    public SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
    }
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    private double getThueNhapKhau() {
        return 0.1 * getDonGia();
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten sp: ");
        this.tenSp = sc.nextLine();
        System.out.print("Gia: ");
        this.donGia = sc.nextDouble();
        System.out.print("Giam gia: ");
        this.giamGia = sc.nextDouble();
    }
    public void xuat() {
        System.out.printf("Ten sp: %s. Gia: %.2f. Giam gia: %.2f. Thue nhap khau: %.2f", getTenSp(), getDonGia(), getGiamGia(), getThueNhapKhau());
        System.out.println();
    }
}
