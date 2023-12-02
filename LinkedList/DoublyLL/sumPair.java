package LinkedList.DoublyLL;
// two method to solve this problem
// 1) hashset in this  time is 0(n) and space is 0(n) much flexible for other cases
// 2) sorting and pointer in start and end in this time is 0(n logn) and space is 0(1) better fot this but not for other cases
import java.util.HashSet;

public class sumPair {
  public static void main(String[] args) {
    Node head= new Node();
    int k = 10;
    HashSet <Integer>hset = new HashSet<>();
    Node current = head;
    while(current != null)
    {
        hset.add(current.data);
        current = current.next;
    }
    current = head;
    while(current != null )
    {
        int rem = k -current.data;
       // if(hset.contains(rem)) return true;
        current = current.next;
    }
    //return false;
  }
}
