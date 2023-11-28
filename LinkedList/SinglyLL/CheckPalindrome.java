package LinkedList.SinglyLL;
public class CheckPalindrome
{
  public static Node reverseList(Node head)
  {
      Node pre = null,next =null;
      while(head != null)
      {
          next = head.next;
          head.next = pre;
          pre = head;
          head = next;
      }
      return pre;
  }
  public static void main(String[] args) {
    Node head = new Node();
    //if(head == null || head.next == null) return true;
       Node slow = head,fast = head;
       while(fast.next != null && fast.next.next != null)
       {
           slow = slow.next;
           fast = fast.next.next;
       }
       slow.next = reverseList(slow.next);
       slow = slow.next;
       while(slow!=null)
       {
           //if(head.data != slow.data) return false;
           head = head.next;
           slow = slow.next;

       }
   //    return true; 
  }
}