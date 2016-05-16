package tutorial30daysofcode;


import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);

    int divisorSum2(int n);
}

public class Day19Interface implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        int counter = n, i = n;
        while (--i > 0) {
            System.out.println("i: " + i);
            if (n % i == 0) {
                counter += i;
            }
        }
        return counter;
    }

    @Override
    public int divisorSum2(int n) {
        if (n == 1) {
            return n;
        }
        int counter = n, half = n / 2;
        do {
            if (n % half == 0) {
                counter += half;
            }
        }
        while (--half > 0);
        return counter;
    }

}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Day19Interface();
        int sum = myCalculator.divisorSum2(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}
