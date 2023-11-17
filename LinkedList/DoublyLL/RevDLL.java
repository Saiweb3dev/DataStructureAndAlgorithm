package LinkedList.DoublyLL;

public class RevDLL {
  public static void main(String[] args) {
    System.out.println("Reversing a Doubly Linked List");
    Node head = null;
    if(head == null || head.next == null)
        System.out.println(head);
    Node current = head;
    Node temp = null;
    while(current != null)
    {
        temp = current.prev;
        current.prev = current.next;
        current.next = temp;
        current = current.prev;
    }
    if(temp != null)
        head = temp.prev;
  }
}
