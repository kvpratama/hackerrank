package algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String N = scan.nextLine();
        int length = N.length();
        int hour = 0;

        if (N.substring(length - 2, length).equals("AM")) {
            hour = Integer.parseInt(N.substring(0, 2));
            if (hour == 12) {
                System.out.println("00" + N.substring(2, N.length() - 2));
            } else {
                System.out.println(N.substring(0, N.length() - 2));
            }
        } else if (N.substring(length - 2, length).equals("PM")) {
            hour = Integer.parseInt(N.substring(0, 2));
            if (hour == 12) {
                System.out.println(N.substring(0, N.length() - 2));
            } else {
                hour += 12;
                System.out.println(hour + N.substring(2, N.length() - 2));
            }
        }
    }
}
