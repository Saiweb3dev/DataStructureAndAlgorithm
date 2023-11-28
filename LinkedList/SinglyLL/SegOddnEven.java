package LinkedList.SinglyLL;

public class SegOddnEven {
  public static void main(String[] args) {
    Node head = new Node();
    Node odd = new Node(0);  // dummy head for odd list
    Node even = new Node(0); // dummy head for even list
    Node oddLast = odd, evenLast = even;
    while (head != null) {
        if (head.data % 2 == 0) {
            evenLast.next = head;
            evenLast = head;
        } else {
            oddLast.next = head;
            oddLast = head;
        }
        head = head.next;
    }
    // connect even list to odd list and null terminate end
    evenLast.next = odd.next;
    oddLast.next = null;
   // return even.next;
  }
}
