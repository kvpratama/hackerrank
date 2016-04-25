package data_structures.linked_lists;


public class DeleteNode {

    static Node Delete(Node head, int position) {
        if (position == 0) {
            if (head.next != null) {
                return head.next;
            } else {
                return null;
            }
        } else {
            Node prev = InsertNodeNth.getNodeAt(head, --position);
            prev.next = prev.next.next;
            return head;
        }
    }

    static Node DeleteRec(Node head, int position) {
        if (position == 0) {
            return head.next;
        }
        head.next = DeleteRec(head.next, --position);
        return head;
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

        a = DeleteRec(a, 0);
        PrintLinkedList.Print(a);
    }
}
