package tutorial30daysofcode;

import java.util.Scanner;

public class Day25RunningTimeComplexity {

    public static boolean isPrime(Double n){
        if (n == 1){
            return false;
        }

        if (n == 2){
            return true;
        }

        Double sqrN = Math.sqrt(n);
        for (int i = 2; i <= sqrN ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            System.out.println(isPrime(sc.nextDouble()) ?  "Prime"  : "Not prime");
        }
    }
}
