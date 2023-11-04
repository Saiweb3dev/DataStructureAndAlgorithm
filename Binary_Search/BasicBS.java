package Binary_Search;
import java.util.*;
public class BasicBS {
  public static void main(String[] args) {
    System.out.println("Basic Binary Search");
    int arr[] = {1,2,3,4,5,6,7,8,9};
    int n = arr.length;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the value to be found");
    int target = scan.nextInt();
    int low = 0;
    int high = n-1;
    while(low<=high)
    {
      int mid = (low+high)/2;
      if(arr[mid] == target)
      {
System.out.println("The value "+target+" is in the index "+mid);
break;
      } 
      else if(arr[mid]<target) low = mid+1;
      else high = mid-1;
    }
  }
}
