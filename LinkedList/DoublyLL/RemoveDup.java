package LinkedList.DoublyLL;

public class RemoveDup {
  public static void main(String[] args) {
    Node head = new Node();
    Node current = head;
    while(current.next != null)
    {
        if(current.data == current.next.data)
        {
            current.next = current.next.next;
        }
        else{
            current = current.next;
        }
    }
    //return head;
  }
}
