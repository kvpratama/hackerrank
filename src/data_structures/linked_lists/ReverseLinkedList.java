package data_structures.linked_lists;

/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element
 */
public class ReverseLinkedList {

    static Node Reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            Node newHead = Reverse(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }

    static Node Reverse2(Node head, Node prev) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            head.next = prev;
            return head;
        } else {
            Node newHead = Reverse2(head.next, head);
            head.next = prev;
            return newHead;
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

        PrintLinkedList.Print(Reverse(a));
    }
}
