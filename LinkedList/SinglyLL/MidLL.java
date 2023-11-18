package LinkedList.SinglyLL;
//Given the head of a singly linked list, return the middle node of the linked list.
//If there are two middle nodes, return the second middle node.
public class MidLL {
  public static void main(String[] args) {
    System.out.println("Middle of the linked list");
    Node head = new Node();
    Node current = head;
    int count = 1;
    while(current.next != null)
    {
        count++;
        current = current.next;
    }
    current = head;
    int mid = (int)Math.ceil((float)count/2);
    if(count == 2) //return head = current.next;
    if(count%2 == 0) mid+=1;
    int newCount = 1;
    while(current.next != null)
    {
        if(newCount == mid) //return head = current;
        current = current.next;
        newCount++;
    }
    //return head;
  }
}
