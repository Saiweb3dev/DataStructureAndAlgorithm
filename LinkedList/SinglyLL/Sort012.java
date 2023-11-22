package LinkedList.SinglyLL;

public class Sort012 {
  public static void main(String[] args) {
    Node head = new Node();
    //if(head == null || head.next == null) return head;
    Node oneL = new Node(0), zeroL = new Node(0), twoL = new Node(0);
    Node one = oneL,zero = zeroL,two = twoL;
    Node current = head;
    while(current != null)
    {
        if(current.data == 0)
        {
            zero.next = current;
            zero = zero.next;
        }
        else if(current.data == 1)
        {
            one.next = current;
            one = one.next;
        }
        else
        {
            two.next = current;
            two = two.next;
        }
        current = current.next;
    }
    zero.next = (oneL.next != null) ? oneL.next : twoL.next;
    one.next = twoL.next;
    two.next = null;
    //return zeroL.next;
  }
}
