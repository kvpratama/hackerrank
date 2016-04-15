package algorithms.implementation;

import java.util.Scanner;

public class ServiceLane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        ServiceLane s = new ServiceLane();

        for (int width_i = 0; width_i < n; width_i++) {
            width[width_i] = in.nextInt();
        }

        for (int a0 = 0; a0 < t; a0++) {
            int i = in.nextInt();
            int j = in.nextInt();
            s.serviceLine(width, i, j);
        }
    }

    public void serviceLine(int[] arr, int entry, int exit) {
        int minVal = 100001;

        for (int i = entry; i <= exit; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        System.out.println(minVal);
    }
}
