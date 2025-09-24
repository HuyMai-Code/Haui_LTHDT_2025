package bai3;

import bai1.SanPham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SanPham sp1 = new SanPham("Tu lanh", 1000, 50);
        SanPham sp2 = new SanPham("Ti vi", 1500);

        sp1.xuat();
        sp2.xuat();
    }
}
