package tutorial30daysofcode;

import java.util.Scanner;

public class Day22BinarySearchTree {
    public static int getHeight(Node root) {
        //Write your code here
        int leftHeight = 0, rightHeight = 0;
        if (root.left == null && root.right == null) {
            return 0;
        }
        if (root.left != null) {
            leftHeight = 1 + getHeight(root.left);
        }
        if (root.right != null) {
            rightHeight = 1 + getHeight(root.right);
        }
        return (leftHeight > rightHeight) ? leftHeight : rightHeight;
    }

    //editorial solution
    public static int getHeight2(Node root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(getHeight2(root.left), getHeight2(root.right));
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
}
