package tutorial30daysofcode;

public class Day9Recursion {

    // summation 3 = 3 + 2 + 1
    public static int summation(int n) {
        if (n <= 1) { // base case
            return 1;
        } else { // recursive case
            // 3 + summation(2)
            // 3 + 2 + summation(1)
            // 3 + 2 + 1
            return n + summation(n - 1);
        }
    }

    // 3! = 3 * 2 * 1
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            // 3 * factorial(2)
            // 3 * 2 * factorial(1)
            // 3 * 2 * 1
            return n * factorial(n - 1);
        }
    }

    // 5 ^ 3 = 5 * 5 * 5
    public static int exponentiation(int n, int p){
        if (p <= 1){
            return n;
        }else{
            // 5 * exponentiation(5, 2)
            // 5 * 5 * exponentiation(5, 1)
            // 5 * 5 * 5
            return n * exponentiation(n, p-1);
        }
    }


    public static void main(String[] args) {
        System.out.println(summation(4));
        System.out.println(factorial(4));
        System.out.println(exponentiation(5, 4));
    }
}
