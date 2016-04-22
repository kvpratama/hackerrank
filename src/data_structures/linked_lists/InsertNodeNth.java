package data_structures.linked_lists;

/*
  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
public class InsertNodeNth {
    static Node InsertNth(Node head, int data, int position) {
        if (position != 0) {
            Node target = getNodeAt(head, --position);
            Node temp = target.next;
            Node theNew = new Node();
            theNew.data = data;
            theNew.next = temp;
            target.next = theNew;
        }else{
            Node temp = head;
            head = new Node();
            head.data = data;
            head.next = temp;
        }
        return head;
    }

    static Node getNodeAt(Node head, int position) {
        if (position == 0) {
            return head;
        }
        return getNodeAt(head.next, --position);
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

//        Node target = getNodeAt(a, 3);
        a = InsertNth(a, 99, 1);
//        System.out.println(target.data);
        PrintLinkedList.Print(a);
    }
}
