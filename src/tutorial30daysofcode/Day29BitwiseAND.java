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
        mainloop: //loop declaration to break from nested loop
        //since Set S start with 1, declare i = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                int tmp = i & j;
                if (tmp > max && tmp < K) {
                    max = tmp;
                    if (max == K - 1) {//maximum possible value
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

    Task
    Given set S = {1,2,3,...N} . Find two integers,  A and B  (where A < B), from set  such that the value of A&B is the maximum possible and also less than a given integer, K. In this case, & represents the bitwise AND operator.

    Input Format

    The first line contains an integer, T , the number of test cases.
    Each of the T subsequent lines defines a test case as 2 space-separated integers,  N and K , respectively.

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
*/
