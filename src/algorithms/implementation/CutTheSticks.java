package algorithms.implementation;


import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] sticks = new int[t];
        for (int i = 0; i < sticks.length; i++) {
            t = in.nextInt();
            sticks[i] = t;
        }

        CutTheSticks s = new CutTheSticks();
        s.cutTheStick(sticks);
    }

    public void cutTheStick(int[] theSticks) {
        Arrays.sort(theSticks);
        int substractor, count = 0;
        while (theSticks[theSticks.length - 1] != 0) {
            if (theSticks[count] != 0) {
                System.out.println(theSticks.length - count);
                substractor = theSticks[count];
                for (int i = count; i < theSticks.length; i++) {
                    theSticks[i] -= substractor;
                }
            }
            count++;
        }
    }
}
