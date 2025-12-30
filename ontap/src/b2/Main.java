package b2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankManagerImpl manager = new BankManagerImpl();

        manager.addAccount(new SavingsAccount("A01", "An", 1000, "STANDARD", 5));
        manager.addAccount(new SavingsAccount("A02", "Binh", 2000, "STANDARD", 6));
        manager.addAccount(new SavingsAccount("A03", "Cuong", 1500, "VIP", 4));
        manager.addAccount(new SavingsAccount("A04", "Dung", 3000, "VIP", 8));
        manager.addAccount(new SavingsAccount("A05", "Huy", 1200, "Khach le", 10));
        try {
            while (true) {
                System.out.println("_____MENU_____");
                System.out.println("1. Add account");
                System.out.println("2. Edit account");
                System.out.println("3. Sort account");
                System.out.println("4. Total interest");
                System.out.println("0. Exit");
                System.out.print("Lua chon cua ban: ");


                int choose = sc.nextInt();
                sc.nextLine();

                switch (choose) {
                    case 1:
                        System.out.print("ID: ");
                        String id = sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Balance: ");
                        double balance = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Customer type: ");
                        String customerType = sc.nextLine();
                        System.out.print("Term: ");
                        int term = sc.nextInt();
                        sc.nextLine();
                        manager.addAccount(new SavingsAccount(id, name, balance, customerType, term));
                        break;
                    case 2:
                        System.out.print("ID: ");
                        id = sc.nextLine();
                        System.out.print("New balance: ");
                        balance = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Customer type: ");
                        customerType = sc.nextLine();
                        System.out.print("Term: ");
                        term = sc.nextInt();
                        sc.nextLine();
                        manager.editAccount(new SavingsAccount(id, "", balance, customerType, term));
                        break;
                    case 3:
                        manager.sortAccount();
                        break;
                    case 4:
                        System.out.println("Tong so tien lai phai tra cua toan bo tai khoan tiet kiem: " + manager.getTotalInterestPaid());
                        break;
                    case 0:
                        System.out.println("Thoat chuong trinh");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Nhap sai");
                        break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Ban bi loi trong chuong trinh");
        }
    }
}
