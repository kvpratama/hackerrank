package algorithms.implementation;

import java.util.Scanner;

public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ChocolateFeast s = new ChocolateFeast();
        for (int i = 0; i < t; i++) {
            s.chocolateFeast(in.nextInt(), in.nextInt(), in.nextInt());
        }
    }

    public void chocolateFeast(int N, int C, int M) {
        int chocolate = 0;
        chocolate = N / C;

        if (chocolate < M) {
            System.out.println(chocolate);
        } else if (chocolate == M)
            System.out.println(chocolate + 1);
        else if (chocolate > M) {
            int dv = 0, md = 0, add = 0, ch2 = 0;

            dv = chocolate / M;
            add += dv;
            md = chocolate % M;

            while (dv + md >= M) {
                ch2 = dv + md;
                dv = ch2 / M;
                add += dv;
                md = ch2 % M;
            }
            System.out.println(chocolate + add);
        }
    }
}
