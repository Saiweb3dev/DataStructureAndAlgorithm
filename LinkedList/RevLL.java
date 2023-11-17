package LinkedList;

public class RevLL {
  public static void main(String[] args) {
    System.out.println("Reversing a Linked List");
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
    Node prev = null;
    Node next = null;
    while(current != null)
    {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    head = prev;
  }
}
