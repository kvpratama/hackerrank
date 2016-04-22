package data_structures.linked_lists;

/*
  Print elements of a linked list on console
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission.
// You only need to complete this method.

public class PrintLinkedList {

    static void Print(Node head) {
        if (head == null) return;
        System.out.println(head.data);
        Print(head.next);
    }
}
