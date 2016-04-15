package algorithms.warmup;


import java.util.Scanner;

public class AVeryBigSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += scan.nextInt();
        }

        System.out.println("" + sum);
    }
}
