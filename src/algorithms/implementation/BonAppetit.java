package algorithms.implementation;

import java.util.Scanner;

public class BonAppetit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int totalBill = 0;

        for (int i = 0; i < n; i++) {
            if (i != k) {
                totalBill += s.nextInt();
            } else {
                s.nextInt();
            }
        }

        int bActual = totalBill / 2;

        int bCharged = s.nextInt();

        if (bActual != bCharged) {
            System.out.println(bCharged - bActual);
        } else {
            System.out.println("Bon Appetit");
        }
    }
}
