package tutorial30daysofcode;

import java.util.Scanner;

public class Day6Review {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        StringBuilder even, odd;

        for (int i = 0; i < N; i++) {
            even = new StringBuilder();
            odd = new StringBuilder();
            char c[] = in.next().toCharArray();
            int len = c.length;
            for (int j = 0; j < len; j++) {
                if (j % 2 == 0) {
                    even.append(c[j]);
                } else {
                    odd.append(c[j]);
                }
            }
            System.out.println(even + " " + odd);
        }
        in.close();
    }
}
