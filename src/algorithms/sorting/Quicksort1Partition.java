package algorithms.sorting;


import java.util.ArrayList;
import java.util.Scanner;

public class Quicksort1Partition {

    static void partition(int[] ar) {

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        int pivot = ar[0];

        for (int i : ar) {
            if (i < pivot) {
                left.add(i);
            } else if (i == pivot) {
                equal.add(i);
            } else if (i > pivot) {
                right.add(i);
            }
        }

        for (int l : left) {
            System.out.print(l + " ");
        }
        for (int e : equal) {
            System.out.print(e + " ");
        }
        for (int r : right) {
            System.out.print(r + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        partition(ar);
    }
}
