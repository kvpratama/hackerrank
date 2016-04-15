package algorithms.implementation;

import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        String[] inputLine1 = sc.nextLine().split(" ");
        String[] inputLine2 = sc.nextLine().split(" ");
        LibraryFine solution = new LibraryFine();
        System.out.print(solution.libraryFine(
                new int[]{Integer.parseInt(inputLine1[0]), Integer.parseInt(inputLine1[1]),
                        Integer.parseInt(inputLine1[2])},
                new int[]{Integer.parseInt(inputLine2[0]), Integer.parseInt(inputLine2[1]),
                        Integer.parseInt(inputLine2[2])}));
    }

    public int libraryFine(int[] actual, int[] expected) {
        int fine = 0, hackos = 0;

        if (actual[2] > expected[2]) {
            return 10000;
        } else if (actual[2] == expected[2]) {
            if (actual[1] > expected[1]) {
                hackos = 500;
                return hackos * (actual[1] - expected[1]);
            } else if (actual[1] == expected[1]) {
                hackos = 15;
                if (actual[0] <= expected[0]) {
                    return 0;
                } else {
                    return hackos * (actual[0] - expected[0]);
                }
            }
        }
        return fine;
    }
}
