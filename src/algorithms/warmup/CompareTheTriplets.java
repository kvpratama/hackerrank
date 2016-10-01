package algorithms.warmup;

import java.util.Scanner;

public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] alice = new int[3];
        int[] bob = new int[3];
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < 3; i++) {
            alice[i] = in.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            bob[i] = in.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (alice[i] > bob[i]) {
                aliceScore++;
            } else if (alice[i] < bob[i]) {
                bobScore++;
            }
        }

        System.out.print(aliceScore + " " + bobScore);
    }
}
