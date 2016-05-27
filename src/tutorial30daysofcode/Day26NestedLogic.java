package tutorial30daysofcode;

import java.util.Scanner;

public class Day26NestedLogic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputLine1 = sc.nextLine().split(" ");
        String[] inputLine2 = sc.nextLine().split(" ");
        int[] actualReturn = new int[3];
        int[] expectedReturn = new int[3];
        for (int i = 0; i < 3; i++) {
            actualReturn[i] = Integer.parseInt(inputLine1[i]);
            expectedReturn[i] = Integer.parseInt(inputLine2[i]);
        }

        if (actualReturn[2] > expectedReturn[2]) {
            System.out.println(1000);
        } else if (actualReturn[1] > expectedReturn[1]) {
            System.out.println((actualReturn[1] - expectedReturn[1]) * 500);
        } else if (actualReturn[0] > expectedReturn[0]) {
            System.out.println((actualReturn[0] - expectedReturn[0]) * 15);
        } else {
            System.out.println("0");
        }
    }
}