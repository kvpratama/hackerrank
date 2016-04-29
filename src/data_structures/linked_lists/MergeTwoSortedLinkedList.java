package data_structures.linked_lists;

/*
  Merge two linked lists
  head pointer input could be NULL as well for empty list
*/

public class MergeTwoSortedLinkedList {

    static Node MergeLists(Node headA, Node headB) {
        if (headA == null && headB == null) {
            return null;
        }else if (headA == null) {
            return headB;
        } else if (headB == null) {
            return headA;
        } else {
            if (headA.data > headB.data) {
                headB.next = MergeLists(headA, headB.next);
                return headB;
            } else {
                headA.next = MergeLists(headA.next, headB);
                return headA;
            }
        }
    }

    public static void main(String[] args) {
        Node a = new Node();Node b = new Node();Node c = new Node();Node d = new Node();Node e = new Node();
        Node v = new Node();Node w = new Node();Node x = new Node();Node y = new Node();Node z = new Node();
        a.data = 1;b.data = 3;c.data = 5;d.data = 6;//e.data = 11;
        v.data = 2;w.data = 4;x.data = 7;//y.data = 12;//z.data = 5;
        a.next = b;b.next = c;c.next = d;//d.next = e;
        v.next = w;w.next = x;//x.next = y;//y.next = z;

        PrintLinkedList.Print(MergeTwoSortedLinkedList.MergeLists(a, v));
    }
}