package LinkedList.SinglyLL;
//L1 = entry to cycle
//L2 = cycle to slow
//nC = fast to slow meet (twice the length of l2)
//slow = L1 + L2
//fast = L1 + L2 + nC
//2(L1 + L2) = L1 + L2 + nC
//L1 + L2 = nc
//L1 = nC - L2
//entry = fast - slow

public class EntryCycLL {
  public static void main(String[] args) {
    System.out.println("Entry of the cycle");
    Node head = new Node();
    Node slow=head,fast=head,entry=head;
    while(fast != null && fast.next != null)
    {
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast)
        {
            while(entry != null)
            {
                if(entry == slow) //return entry;
                entry = entry.next;
                slow = slow.next;  
            }  
        }
    }
    // return null;
  }
}
