package hrjava.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static int B, H;
    static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        flag = true;
        if (B < 1 || H < 1) {
            flag = false;
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }//end of main

}
