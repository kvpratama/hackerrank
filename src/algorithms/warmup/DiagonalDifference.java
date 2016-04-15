package algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] input = new int[N * N];
        for (int i = 0; i < input.length; i++) {
            input[i] = scan.nextInt();
        }

        int indexFirstDiagonal = 0, indexSecondDiagonal = N - 1;
        int firstDiagonal = 0, secondDiagonal = 0;
        for (int i = 0; i < N; i++) {
            firstDiagonal += input[indexFirstDiagonal];
            secondDiagonal += input[indexSecondDiagonal];
            indexFirstDiagonal += N + 1;
            indexSecondDiagonal += N - 1;
        }

        int difference = firstDiagonal - secondDiagonal;

        System.out.println("" + Math.abs(difference));
    }
}
