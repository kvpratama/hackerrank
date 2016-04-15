package algorithms.implementation;

import java.util.Scanner;

public class SherlockAndTheBeast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        SherlockAndTheBeast s = new SherlockAndTheBeast();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            s.sherlock(n);
        }
    }

    public void sherlock(int N) {
        int mod3 = 0;
        int count3 = 0, count5 = 0;
        StringBuilder sb;

        if (N < 3) {
            System.out.print(-1);
        } else if (N % 3 == 0) {
            N = N / 3;
            sb = new StringBuilder(N);
            for (int j = 0; j < N; j++) {
                sb.append(555);
            }
            System.out.print(sb);
        } else {
            mod3 = N % 3;
            if (mod3 == 1) {
                count3 = 10;
            } else if (mod3 == 2) {
                count3 = 5;
            }
            if (count3 > N) {
                System.out.print(-1);
            } else {
                count5 = N - count3;
                count3 = count3 / 5;
                count5 = count5 / 3;

                sb = new StringBuilder(N);

                for (int k = 0; k < count5; k++) {
                    sb.append(555);
                }
                for (int l = 0; l < count3; l++) {
                    sb.append(33333);
                }
                System.out.print(sb);
            }
        }
        System.out.println("");
    }
}
