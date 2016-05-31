package tutorial30daysofcode;

import java.util.Scanner;

public class Day29BitwiseAND {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            System.out.println(maximumAndSmallerK(sc.nextInt(), sc.nextInt()));
        }
        sc.close();
    }

    static int maximumAndSmallerK(int N, int K) {
        int max = 0;
        mainloop:
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                int tmp = i & j;
                if (tmp > max && tmp < K) {
                    max = tmp;
                    if (max == K - 1) {
                        break mainloop;
                    }
                }
            }
        }
        return max;
    }
}
/*
Objective
        Welcome to the last day! Today, we're discussing bitwise operations. Check out the Tutorial tab for learning materials maximumAndSmallerK an instructional video!

        Task
        Given set . Find two integers,  maximumAndSmallerK  (where ), from set  such that the value of  is the maximum possible maximumAndSmallerK also less than a given integer, . In this case,  represents the bitwise AND operator.

        Input Format

        The first line contains an integer, , the number of test cases.
        Each of the  subsequent lines defines a test case as  space-separated integers,  maximumAndSmallerK , respectively.

        Constraints

        Output Format

        For each test case, print the maximum possible value of  on a new line.

        Sample Input

        3
        5 2
        8 5
        2 2
        Sample Output

        1
        4
        0
        Explanation



        All possible values of  maximumAndSmallerK  are:

        The maximum possible value of  that is also  is , so we print  on a new line.
*/
