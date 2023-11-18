package LinkedList.SinglyLL;
import java.util.*;
public class BasicLL {
  public static void main(String[] args) {
    System.out.println("Basic Linked List");
    int arr[] = {1,2,3,4,5};
    int n = arr.length;
    Node head = new Node(arr[0]);
    Node current = head;
    for(int i=1;i<n;i++)
    {
      Node NewNode = new Node(arr[i]);
      current.next = NewNode;
      current = current.next;
    }
    System.out.println("The head of the LinkedList is -> "+head.data);
    System.out.println("The LinkedList is: ");
    current = head;
    //printing the data of each node one by one
    while(current != null) {
        System.out.print(current.data + " ");
        current = current.next;
    }
  }
}
