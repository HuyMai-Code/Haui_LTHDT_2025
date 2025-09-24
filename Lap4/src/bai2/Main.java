package bai2;

import bai1.SanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> sp = new ArrayList<>();
        int choose = 0;
        int i = 0;
        do {
            System.out.println("1. Them sp");
            System.out.println("2. In danh sach sp");
            System.out.println("3. Out");
            System.out.print("Lua chon cua ban: ");
            choose = sc.nextInt();

            if (choose == 1) {
                SanPham s = new SanPham();
                s.nhap();
                sp.add(s);
            } else if (choose == 2) {
                for (SanPham x : sp) {
                    x.xuat();
                }
            } else if (choose == 3) {
                System.out.println("Thoat chuong trinh thanh cong!!");
            } else {
                System.out.println("Khong hop le");
            }
        } while (choose != 3);
    }
}
