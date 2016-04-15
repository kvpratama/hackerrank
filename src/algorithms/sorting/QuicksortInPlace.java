package algorithms.sorting;


import java.util.ArrayList;
import java.util.Scanner;

public class QuicksortInPlace {

    static ArrayList<Integer> quickSortInPlace(ArrayList<Integer> ar, int firstIndex, int secondIndex) {
        int size = secondIndex - firstIndex;

        if (size < 2) {
            return ar;
        } else if (size == 2) {
            if (ar.get(firstIndex) > ar.get(secondIndex - 1)) {
                ar = swap(ar, firstIndex, secondIndex - 1);
            }
            printArray(ar);
            return ar;
        } else {
            int small = firstIndex - 1;
            int pivot = ar.get(secondIndex - 1);
            for (int i = firstIndex; i < secondIndex; i++) {
                if (ar.get(i) <= pivot) {
                    small++;
                    ar = swap(ar, i, small);
                }
            }
            printArray(ar);
            ar = quickSortInPlace(ar, firstIndex, small);
            ar = quickSortInPlace(ar, small + 1, secondIndex);
            return ar;
        }
    }

    //swap first index with second index
    static ArrayList<Integer> swap(ArrayList<Integer> ar, int firstIndex, int secondIndex) {
        int temp = ar.get(firstIndex);
        ar.set(firstIndex, ar.get(secondIndex));
        ar.set(secondIndex, temp);
        return ar;
    }

    static void printArray(ArrayList<Integer> ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    static int partition(ArrayList<Integer> ar, int lo, int hi) {
        int pivot = ar.get(hi - 1);
        int i = lo;
        boolean print = false;
        for (int j = lo; j < hi; j++) {
            if (ar.get(j) < pivot) {
                swap(ar, i, j);
                i++;
//                print = true;
            }
        }
        swap(ar, i, hi - 1);
//        System.out.println(i);
//        if (print) {
            printArray(ar);
//        }
        return i;
    }

    static void quickSortLomuto(ArrayList<Integer> ar, int lo, int hi) {
        if (lo < hi) {
            int p = partition(ar, lo, hi);
            quickSortLomuto(ar, lo, p);
            quickSortLomuto(ar, p + 1, hi);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar.add(i, in.nextInt());
        }
//        quickSortInPlace(ar, 0, ar.size());
//        partition(ar, 0, ar.size());
        quickSortLomuto(ar, 0, ar.size());
    }

}