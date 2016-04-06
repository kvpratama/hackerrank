package algorithms.sorting;


import java.util.ArrayList;
import java.util.Scanner;

public class Quicksort2Sorting {

    static ArrayList<Integer> quickSort(ArrayList<Integer> ar) {
        int size = ar.size();

        if (size < 2) {
            return ar;
        } else if (size == 2) {
            if (ar.get(0) > ar.get(1)) {
                ar = swap(ar);
            }
            printArray(ar);
            return ar;
        } else {
            ArrayList<Integer> left = new ArrayList<>();
            ArrayList<Integer> right = new ArrayList<>();
            int pivot = ar.get(0);

            for (int i = 1; i < ar.size(); i++) {
                if (ar.get(i) < pivot) {
                    left.add(ar.get(i));
                } else if (ar.get(i) > pivot) {
                    right.add(ar.get(i));
                }
            }

            left = quickSort(left);
            right = quickSort(right);

            left.add(pivot);
            left.addAll(right);

            printArray(left);
            return left;
        }
    }

    static ArrayList<Integer> swap(ArrayList<Integer> ar) {
        int temp = ar.get(0);
        ar.set(0, ar.get(1));
        ar.set(1, temp);
        return ar;
    }

    static void printArray(ArrayList<Integer> ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar.add(i, in.nextInt());
        }
        quickSort(ar);
    }
}