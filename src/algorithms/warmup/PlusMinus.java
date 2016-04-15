package algorithms.warmup;


import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] anarray = new int[N];
        for (int i = 0; i < anarray.length; i++) {
            anarray[i] = scan.nextInt();
        }
        scan.close();

        float positive = 0;
        float negative = 0;
        float zero = 0;

        for (int i = 0; i < anarray.length; i++) {
            if (anarray[i] > 0){
                positive++;
            }else if (anarray[i]<0){
                negative++;
            }else{
                zero++;
            }
        }

        System.out.printf("%.6f", positive/anarray.length);
        System.out.println("");
        System.out.printf("%.6f", negative/anarray.length);
        System.out.println("");
        System.out.printf("%.6f", zero/anarray.length);
    }
}
