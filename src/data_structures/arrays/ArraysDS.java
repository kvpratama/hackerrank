package data_structures.arrays;


import java.util.Scanner;

public class ArraysDS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        arr = reverse(arr);

        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    static int[] reverse(int[] arr) {
        int length = arr.length;
        int reversed[] = new int[length];

        int j = 0;
        for (int i = length - 1; i >= 0; i--) {
            reversed[j] = arr[i];
            j++;
        }
        return reversed;
    }
}
