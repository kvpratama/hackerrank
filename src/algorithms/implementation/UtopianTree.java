package algorithms.implementation;

import java.util.Scanner;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        UtopianTree s = new UtopianTree();
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            s.utopianTree(n);
        }
    }

    public void utopianTree(int cycle) {
        int tree = 1;
        for (int i = 1; i <= cycle; i++) {
            if (i % 2 == 0) {
                tree += 1;
            } else {
                tree += tree;
            }
        }
        System.out.println(tree);
    }
}
