package algorithms.string;

import java.util.Scanner;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        char[] c = S.toCharArray();
        int error = 0, i = 0;

        while (i < S.length()) {
            error = (c[i] != 'S') ? ++error : error;
            error = (c[i + 1] != 'O') ? ++error : error;
            error = (c[i + 2] != 'S') ? ++error : error;
            i += 3;
        }
        System.out.println(error);
    }
}
