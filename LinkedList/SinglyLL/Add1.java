package LinkedList.SinglyLL;
public  class Add1 {
  public static Node reverse(Node head) {
    Node p = head, pre = null;

    while (p != null) {
        Node nxt = p.next;
        p.next = pre;

        pre = p;
        p = nxt;
    }

    return pre;
}
  public static void main(String[] args) {
    Node head = new Node();
   // if (head == null)return null;
    

Node p = reverse(head);
head = p;

int sum = p.data + 1;
int val = sum % 10, carry = sum / 10;
p.data = val;

if (carry != 0) {
    Node prev = p;
    p = p.next;

    while (p != null) {
        sum = p.data + carry;
        val = sum % 10;
        carry = sum / 10;
        p.data = val;

        prev = p;
        p = p.next;
    }

    if (carry != 0)
        prev.next = new Node(carry);
}

p = reverse(head);
//return p;
  }
}
