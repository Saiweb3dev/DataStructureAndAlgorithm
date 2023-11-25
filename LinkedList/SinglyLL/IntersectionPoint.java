package LinkedList.SinglyLL;
//basically equalling the seize to find the intersection point
public class IntersectionPoint {
  public static void main(String[] args) {
    Node firstHead = new Node();
     Node secondHead = new Node();

    Node a = firstHead;
    Node b = secondHead;
    while(a != b)
    {
        a = a == null ? secondHead : a.next;
        b = b == null ? firstHead : b.next;
    }
    //return a.data;
  }
}
