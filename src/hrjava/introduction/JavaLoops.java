package hrjava.introduction;

import java.util.Scanner;

public class JavaLoops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int total;

            total = a + (int)Math.pow(2,0) * b;
            System.out.printf("%d ", total);
            for(int j = 1; j < n; j++){
                total += (int)Math.pow(2,j) * b;
                System.out.print(total + " ");
            }
            System.out.printf("%n");
        }
    }
}
