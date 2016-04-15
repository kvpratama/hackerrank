package algorithms.implementation;

import java.util.Scanner;

/**
 * Created by nv49c on 15/4/16.
 */
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CaesarCipher solution = new CaesarCipher();
        solution.caesarCipher(Integer.parseInt(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine()));
    }

    public void caesarCipher(int length, String text, int rotate) {
        if (rotate > 26) {
            rotate = rotate % 26;
        }
        for (int i = 0; i < length; i++) {
            char chars = text.charAt(i);
            int ascii = (int) chars;
            if (ascii >= 65 && ascii <= 90) {
                ascii += rotate;
                if (ascii > 90) {
                    ascii = ascii - 90 + 65 - 1;
                }
            } else if (ascii >= 97 && ascii <= 122) {
                ascii += rotate;
                if (ascii > 122) {
                    ascii = ascii - 122 + 97 - 1;
                }
            }

            System.out.print((char) ascii);
        }
    }
}
