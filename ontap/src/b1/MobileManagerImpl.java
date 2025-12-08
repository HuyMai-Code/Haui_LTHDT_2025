package b1;

import java.util.ArrayList;
import java.util.Scanner;

public class MobileManagerImpl implements MobileManager{
    private ArrayList<Mobile> mobiles = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public MobileManagerImpl() {}
    public MobileManagerImpl(ArrayList<Mobile> mobiles) {
        this.mobiles = mobiles;
    }

    public ArrayList<Mobile> getMobiles() {
        return mobiles;
    }

    public void setMobiles(ArrayList<Mobile> mobiles) {
        this.mobiles = mobiles;
    }

    public void addMobile() {
        System.out.print("Nhap id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap name: ");
        String name = sc.nextLine();
        System.out.print("Nhap size: ");
        int size = sc.nextInt();
        System.out.print("Nhap price: ");
        double price = sc.nextDouble();
        System.out.print("Nhap quanlity: ");
        int quanlity = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ram: ");
        String ram = sc.nextLine();
        System.out.print("Nhap gpu: ");
        String gpu = sc.nextLine();
        System.out.print("Nhap port: ");
        int port = sc.nextInt();
        mobiles.add(new Mobile(id, name, size, price, quanlity, ram, gpu, port));
    }
    public void editMobile() {
        System.out.print("Nhap id can sua gia: ");
        int id = sc.nextInt();
        Mobile mb = new Mobile();
        for (Mobile m : mobiles) {
            if (m.getId() == id) {
                mb = m;
                break;
            }
        }
        System.out.print("Nhap price new: ");
        double price = sc.nextDouble();
        mb.setPrice(price);
        System.out.println("Da sua!!!");
    }
    public void sortedMobile() {

    }
    public void getAllTotal() {

    }
    public void hienThi() {
        System.out.println("Danh sach san pham");
        for (Mobile m : mobiles) {
            System.out.println(m.toString());
        }
    }
}
