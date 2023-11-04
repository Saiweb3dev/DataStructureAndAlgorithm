package Binary_Search;
import java.util.*;
//low bound is finding the value greater than target but the minimum in the largest
public class LowBound {
  public static void main(String[] args) {
    System.out.println("Lower Bound");
    int arr[] = {0,1,2,3,4,6,7,8};
    int n = arr.length;
    System.out.println("Enter the value to find lower bound");
    Scanner scan = new Scanner(System.in);
    int target = scan.nextInt();
    int low=0,high=n-1;
    int index = n;
    while(low<=high)
    {
      int mid = (low+high)/2;
     if(arr[mid]>=target)
      {
        high = mid-1;
        index = mid;
      }
      else low = mid + 1;
    }
    System.out.println("The index of lower bound is "+index);
  }
}
