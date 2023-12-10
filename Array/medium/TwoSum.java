package medium;
import java.util.*;
public class TwoSum {
  public static void main(String[] args) {
    System.out.println("Two sum");
    int arr[] = {1,4,5,2,3};
    int target = 5;
    int n = arr.length;
        Arrays.sort(arr);
        int left = 0,right = n-1;
        while(left < right)
        {
            int sum = arr[left] + arr[right];
            if(sum == target)
            {
                 System.out.println(left +" and "+right);
                 break;
            }
            else if(sum < target)
            {
                left++;
            }
            else
            {
                right--;
            }

        }
  }
}
