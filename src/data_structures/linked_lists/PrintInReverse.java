package data_structures.linked_lists;

public class PrintInReverse {

    static void ReversePrint(Node head) {
        if (head != null) {
            ReversePrint(head.next);
            System.out.println(head.data);
        }
    }

    public static void main(String[] args) {
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        Node d = new Node();
        Node e = new Node();
        a.data = 1;
        b.data = 2;
        c.data = 3;
        d.data = 4;
        e.data = 5;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        ReversePrint(a);
    }
}
