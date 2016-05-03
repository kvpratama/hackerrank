package data_structures.trees;

public class PostorderTraversal {

    void postOrder(Node root) {
        if (root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
}