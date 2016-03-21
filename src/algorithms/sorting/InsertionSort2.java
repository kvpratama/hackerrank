package algorithms.sorting;

import java.util.Scanner;

public class InsertionSort2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertionSortPart2(ar);
    }

    public static void insertionSortPart2(int[] ar) {
        int length = ar.length;
        for (int i = 1; i < length; i++) {
            if (ar[i] < ar[i - 1]) {
                ar = sortTarget(ar, i);
            }
            printArray(ar);
        }
    }

    public static int[] sortTarget(int[] ar, int index) {
        int unsorted = ar[index];
        while (index > 0 && ar[index - 1] > unsorted) {
            ar[index] = ar[index - 1];
            index--;
        }
        ar[index] = unsorted;
        return ar;
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}