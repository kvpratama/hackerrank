package tutorial30daysofcode;

import java.util.Scanner;

public class Day6Review {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        String input[] = new String[N];
        for (int i = 0; i < N; i++) {
            input[i] = in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            char reformat[] = input[i].toCharArray();
            char evenOdd[] = new char[reformat.length];
            int charLength = evenOdd.length;
            int even = 0; int odd = charLength/2;
            if (charLength%2 != 0) {
                odd++;
            }

            int middle = odd;
            for (int j = 0; j < charLength; j++) {
                if (j%2 == 0){
                    evenOdd[even] = reformat[j];
                    even++;
                }else {
                    evenOdd[odd] = reformat[j];
                    odd++;
                }
            }

            for (int j = 0; j < charLength; j++) {
                if (j == middle){
                    System.out.print(" ");
                }
                System.out.print(evenOdd[j]);
            }
            System.out.println();
        }
    }
}
