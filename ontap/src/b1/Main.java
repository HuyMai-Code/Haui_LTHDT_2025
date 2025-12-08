package b1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobileManagerImpl mobiles = new MobileManagerImpl();
        int choose;
        do {
            System.out.println("===== QUAN LY HOC SINH =====");
            System.out.println("1.Them hoc sinh");
            System.out.println("2.In danh sach hoc sinh");
            System.out.println("3.Cap nhat gia moi");
            System.out.println("0.Thoat");
            System.out.print("Chon thao tac: ");
            choose = sc.nextInt();
            if (choose == 1) {
                mobiles.addMobile();
            } else if (choose == 2) {
                mobiles.hienThi();
            } else if (choose == 3) {
                mobiles.editMobile();
            } else if (choose == 0) {
                System.out.println("Da thoat chuong trinh");
                System.exit(0);
            } else {
                System.out.println("Khong hop le");
            }
        } while(true);
    }
}