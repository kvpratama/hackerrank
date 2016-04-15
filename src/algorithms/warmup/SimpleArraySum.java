package algorithms.warmup;


import java.util.Scanner;

public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = new int[scan.nextInt()];
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            input[i] = scan.nextInt();
        }

        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }

        System.out.println("" + sum);
    }
}
