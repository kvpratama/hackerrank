package tutorial30daysofcode;

import java.util.Scanner;

public class Day20Sorting {

    public static int bubleSort(int n, int[] a) {
        int totNumberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    numberOfSwaps++;
                }
            }

            if (numberOfSwaps == 0) {
                break;
            }else{
                totNumberOfSwaps += numberOfSwaps;
            }
        }
        return totNumberOfSwaps;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        int totSwap = bubleSort(n, a);

        System.out.println("Array is sorted in " + totSwap + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }

}
