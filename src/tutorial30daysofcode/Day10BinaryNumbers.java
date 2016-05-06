package tutorial30daysofcode;

import java.util.Scanner;

// Binary to Decimal Conversion
// In the same way that
// (840)10 = (8 × 10^2) + (4 × 10^1) + (0 × 10^0) = 800 + 40 + 0 = 840
//
// For example:
// (1011)2 → (?)10 is evaluated as (1 × 2^3)+(0 × 2^2)+(1 × 2^1)+(1 × 2^0) = 8 + 0 + 2 + 1 = (11)10

// Decimal to Binary Conversion
// (4)10 → (?)2
// 4 ÷ 2 = 2 remainder 0 ↑
// 2 ÷ 2 = 1 remainder 0 ↑
// 1 ÷ 2 = 0 remainder 1 ↑
//
// while(n > 0):
//  remainder = n%2;
//  n = n/2;
//  Insert remainder to front of a list or push onto a stack
// Print list or stack


public class Day10BinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        String s = Integer.toBinaryString(n);

        int sLength = s.length(), max1 = 0, counter = 0;
        for (int i = 0; i < sLength; i++) {
            counter = s.charAt(i) == '1' ? counter+1 : 0;
            if (max1 < counter) {
                max1 = counter;
            }
        }

        System.out.println(s);
        System.out.println(max1);
    }
}
