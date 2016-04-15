package algorithms.implementation;

import java.util.Scanner;

public class ManasaAndStone {
    public static void main(String[] args) {
        ManasaAndStone solution = new ManasaAndStone();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            solution.manasaStone(in.nextInt(), in.nextInt(), in.nextInt());
        }
    }

    public void manasaStone(int numberStones, int a, int b) {
        int result;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (numberStones == 1) {
            System.out.print(0);
        } else if (numberStones == 2) {
            System.out.print(a);
            if (a != b) {
                System.out.print(" " + b);
            }
        } else if (a == b) {
            System.out.print(a * (numberStones - 1));
        } else {
            for (int i = 0; i < numberStones; i++) {
                result = a * (numberStones - i - 1) + b * i;
                System.out.print(result + " ");
            }
        }
        System.out.println();
    }
}
