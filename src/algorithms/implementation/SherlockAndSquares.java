package algorithms.implementation;


import java.util.Scanner;

public class SherlockAndSquares {

    public static void main(String[] args) {
        SherlockAndSquares solution = new SherlockAndSquares();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a, b = 0;

        for (int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            solution.sherlockSquare3(a, b);
        }
    }

    public void sherlockSquare3(int a, int b) {
        double sqrta = Math.sqrt(a);
        double sqrtb = Math.sqrt(b);

        double count = Math.floor(sqrtb) - Math.ceil(sqrta) + 1;
        System.out.println((int) count);

    }

    public void sherlockSquare2(int a, int b) {
        double sqrt = 0;
        int count = 0;

        while (a <= b) {
            sqrt = Math.sqrt(a);
            if (sqrt % 1 == 0) {
                count++;
            }
            a++;
        }
        System.out.println(count);
    }
}
