package LinkedList.SinglyLL;

public class DelKthNode {
  public static void main(String[] args) {
    Node head = new Node();
    int K = 2;
    Node first = head;
        Node second = head;
        for (int i = 0; i < K; i++) {
            if (first.next == null) {
                // If count of nodes in the linked list is less than k
                if (i == K - 1) {
                    head = head.next;
                }
                //return head;
            }
            first = first.next;
        }

        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        //return head;
  }
}
