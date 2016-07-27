package hrjava.strings;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder(A);
        StringBuilder reverse = new StringBuilder(A).reverse();
        //System.out.println(sb + " " + reverse);
        if (sb.toString().equals(reverse.toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
