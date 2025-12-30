package demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> hoi = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Cau hoi " + (i + 1) + ": ");
            String x = sc.nextLine();
            hoi.add(x);
        }
        Collections.shuffle(hoi);
        for (String x : hoi) {
            System.out.println(x);
        }
    }
}
