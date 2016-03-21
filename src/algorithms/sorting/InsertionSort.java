package algorithms.sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        sc.nextLine();
//
//        String[] firstLine = sc.nextLine().split(" ");
//        int[] sortedList = new int[firstLine.length];
//
//        for (int i = 0; i < firstLine.length; i++) {
//            sortedList[i] = Integer.parseInt(firstLine[i]);
//        }
//
//        InsertionSort i = new InsertionSort();
//        i.insertionSort(sortedList);
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertIntoSorted2(ar);
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void insertIntoSorted(int[] ar) {
        int length = ar.length;
        int unsorted = ar[length - 1];

        for (int i = length - 2; i >= 0; i--) {
            if (ar[i] > unsorted) {
                ar[i + 1] = ar[i];
                printArray(ar);
                if (i == 0) {
                    ar[i] = unsorted;
                    printArray(ar);
                }
            } else if (ar[i] < unsorted) {
                ar[i + 1] = unsorted;
                printArray(ar);
                break;
            }

        }
    }

    public static void insertIntoSorted2(int[] ar) {
        int length = ar.length;
        int i = length - 2;
        int unsorted = ar[length - 1];

        while (i >= 0 && ar[i] > unsorted ) {
            ar[i + 1] = ar[i];
            printArray(ar);
            i--;
        }

        ar[i + 1] = unsorted;
        printArray(ar);
    }

    public void insertionSort1(int[] sortedList) {
        int length = sortedList.length;
        int unsorted = sortedList[length - 1];

        for (int i = length - 2; i >= 0; i--) {
            if (sortedList[i] > unsorted) {
                sortedList[i + 1] = sortedList[i];
            } else if (sortedList[i] < unsorted) {
                sortedList[i + 1] = unsorted;
                for (int a : sortedList) {
                    System.out.print(a + " ");
                }
                break;
            }
            for (int a : sortedList) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }


}