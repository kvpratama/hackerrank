package tutorial30daysofcode;

import java.util.Scanner;

public class Day16Exceptions {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try {
            System.out.println(Integer.parseInt(s));
        }catch (NumberFormatException n){
            System.out.println("Bad String");
        }
        sc.close();
    }


}
