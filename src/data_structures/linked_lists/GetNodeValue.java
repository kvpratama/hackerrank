package data_structures.linked_lists;

/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
*/

public class GetNodeValue {

    static int GetNode(Node head, int n) {
        Node pointer = head;
        int pointerPosition = 0;

        while (head.next != null){
            head = head.next;
            if (pointerPosition < n){
                pointerPosition++;
            }else {
                pointer = pointer.next;
            }
        }

        return pointer.data;
    }

    public static void main(String[] args) {
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        Node d = new Node();
        Node e = new Node();

        a.data = 1;
        b.data = 3;
        c.data = 5;
        d.data = 6;

        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println(GetNode(a, 3));
    }
}
