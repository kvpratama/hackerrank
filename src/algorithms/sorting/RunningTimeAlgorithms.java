package algorithms.sorting;

import java.util.Scanner;

public class RunningTimeAlgorithms {

    public static int insertionSort(int[] A) {
        int count = 0;
        for (int i = 1; i < A.length; i++) {
            int value = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > value) {
                A[j + 1] = A[j];
                j = j - 1;
                count++;
            }
            A[j + 1] = value;
        }
        return count;
    }

    public static int insertionSortPart2(int[] ar) {
        int length = ar.length;
        int count = 0;
        for (int i = 1; i < length; i++) {
            if (ar[i] < ar[i - 1]) {
                count += sortTarget(ar, i);
            }
        }
            return count;
    }

    public static int sortTarget(int[] ar, int index) {
        int unsorted = ar[index];
        int count = 0;
        while (index > 0 && ar[index - 1] > unsorted) {
            ar[index] = ar[index - 1];
            index--;
            count++;
        }
        ar[index] = unsorted;
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
//        System.out.println(insertionSort(ar));
        System.out.println(insertionSortPart2(ar));
    }

}
