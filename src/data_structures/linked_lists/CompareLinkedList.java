package data_structures.linked_lists;

/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not.
*/
public class CompareLinkedList {

    static int CompareLists(Node headA, Node headB) {
        if (headA == null && headB == null){
                return 1;
        }else if (headA == null ^ headB == null){ // ^ = xor "this or that, but not both"
            return 0;
        }
        else if (headA.data == headB.data){
            return CompareLists(headA.next, headB.next);
        }
        return 0;
    }

    public static void main(String[] args) {
        Node a = new Node();Node b = new Node();Node c = new Node();Node d = new Node();Node e = new Node();
        Node v = new Node();Node w = new Node();Node x = new Node();Node y = new Node();Node z = new Node();
        a.data = 1;b.data = 2;c.data = 3;d.data = 4;e.data = 5;
        v.data = 1;w.data = 2;x.data = 3;y.data = 4;z.data = 5;
        a.next = b;b.next = c;c.next = d;d.next = e;
        v.next = w;w.next = x;x.next = y;y.next = z;

        System.out.println(CompareLists(a, v));
    }
}
