package hrjava.strings;


import java.util.Scanner;

public class JavaStringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int maxLength = sc.nextInt();

        int length = s.length() + 1;
        String max = "", min = "z";
        for (int i = 0; i < length - maxLength; i++) {
            if (s.substring(i, i + maxLength).compareTo(min) < 0) {
                min = s.substring(i, i + maxLength);
                //System.out.println("min:" + min);
            }
            if (s.substring(i, i + maxLength).compareTo(max) > 0) {
                max = s.substring(i, i + maxLength);
                //System.out.println("max: " + max);
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
