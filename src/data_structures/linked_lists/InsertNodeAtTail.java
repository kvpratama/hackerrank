package data_structures.linked_lists;

/*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
public class InsertNodeAtTail {

    static Node insert (Node head, int data){
        Node tail = new Node();
        tail.data = data;
        if (head == null){
            return tail;
        }else{
            if (head.next == null){
                head.next = tail;
            }else{
                insert(head.next, data);
            }
            return head;
        }
    }

    static void Print(Node head) {
        if (head == null) return;
        System.out.println(head.data);
        Print(head.next);
    }

   static Node insert2(Node head,int data) {
        Node tail = new Node();
        tail.data = data;
        tail.next = null;

        if (head == null){
            head = tail;
            return head;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = tail;
        return head;
    }
}
