package vd3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        String name = sc.nextLine();
        System.out.print("Tuoi: ");
        int age = sc.nextInt();
        System.out.print(name + " nam nay " + age + " tuoi");
        System.out.println();
        System.out.println(name + " nam nay " + age + " tuoi");
        System.out.printf("%s nam nay %d tuoi", name, age);
    }
}
