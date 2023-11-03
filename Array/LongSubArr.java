package Array;

import java.util.*;

public class LongSubArr {
  public static void main(String[] args) {
    System.out.println("Longest Sub array with k sum");
    int arr[] = { 1, 2, 3, 1, 1, 1, 1 };
    int n = arr.length;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Value of k");
    int k = scan.nextInt();
    // pointer for measuring the sub array length
    int right = 0, left = 0;
    int max = 0;
    int sum = arr[0];
    while (right < n) {
      
      while (sum > k) {
        sum -= arr[left];
        left++;
      }
      if (sum == k) {
        System.out.println(max);
        max = Math.max(max, (right - left) + 1);
      }
      if (right < n) {
        sum += arr[right];
      }

      right++;
    }
    System.out.println("The Longest Sum array is " + max);
  }
}
