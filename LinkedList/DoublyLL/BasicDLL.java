package LinkedList.DoublyLL;

public class BasicDLL {
  public static void main(String[] args) {
    System.out.println("Basic Doubly Linked List");
    int arr[] = {1,2,3,4,5};
    int n = arr.length;
    Node head = new Node(arr[0]);
    Node current = head;
    for(int i=1;i<n;i++)
    {
      Node newNode = new Node(arr[i]);
      current.next = newNode;
      newNode.prev = current;
      current = current.next;
    }
    current = head;
    while(current != null)
    {
      System.out.print(current.data+"<->");
      current = current.next;
    }
  }
}
