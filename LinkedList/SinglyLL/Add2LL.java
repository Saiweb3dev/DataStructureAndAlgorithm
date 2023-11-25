package LinkedList.SinglyLL;

public class Add2LL {
  public static void main(String[] args) {
    Node l1 = new Node(), l2 = new Node();
   Node  New = new Node(0);
        Node h1 = New;
        int carry = 0;
        while(l1 != null || l2 != null || carry == 1)
        {
            int sum = 0;
            if(l1 != null)
            {
                sum += l1.data;
                l1 = l1.next;
            }
            if(l2 != null)
            {
                sum += l2.data;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10;
            Node node = new Node(sum%10);
            h1.next = node;
            h1 = h1.next;
        }
      //  return New.next;
  }
}
