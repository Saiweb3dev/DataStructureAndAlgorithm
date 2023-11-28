package LinkedList.DoublyLL;
//deleting all the occurrence of k in the LL
public class delOcc {
  public static void main(String[] args) {
    Node head = new Node();
    int k = 10;
    Node dummy = new Node();
         dummy.next = head;
        Node prev = dummy , curr = head;
        while(curr != null)
        {
            if(curr.data == k)
            {
                prev.next = curr.next;
            }
            else{
                prev = curr;
            }
            curr = curr.next;
        }
       // return dummy.next;
  }
}
