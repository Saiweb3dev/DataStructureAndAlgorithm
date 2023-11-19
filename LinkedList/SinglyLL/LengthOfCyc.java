package LinkedList.SinglyLL;
//finding the length of the loop by finding the collision and then running another loop till it meet the collision point to measure the length
public class LengthOfCyc {
  public static void main(String[] args) {
    System.out.println("Length of the loop");
    Node head = new Node();
    //if(head == null || head.next == null) return 0;
        Node slow = head,fast = head;
        int length = 1;
        while(fast != null && fast.next != null)
        {
         slow = slow.next;
         fast = fast.next.next;
         if(slow == fast)
         {
             Node curr = slow;
             while(curr.next != slow)
             {
                 length++;
                 curr = curr.next;
             }
             //return length;
         }
        }
        //return 0;
  }
}
