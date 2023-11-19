package LinkedList.SinglyLL;

public class CycleInLL {
  public static void main(String[] args) {
    System.out.println("Cycle in linked List");
    Node head = new Node();
    if(head == null || head.next == null) System.out.println(false);
        Node slow = head, fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) System.out.println(true); 
        }
    System.out.println(false);
  }
}
