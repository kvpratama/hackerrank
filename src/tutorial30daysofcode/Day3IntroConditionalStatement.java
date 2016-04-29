package tutorial30daysofcode;

import java.util.Scanner;

public class Day3IntroConditionalStatement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String weird = "Weird";
        String notWeird = "Not Weird";
        String ans;

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if (n % 2 == 1) {
            ans = weird;
        }else if (n > 20){
            ans = notWeird;
        }else if (n>=6 && n<=20){
            ans = weird;
        }else{
            ans = notWeird;
        }
        System.out.println(ans);
    }

}
