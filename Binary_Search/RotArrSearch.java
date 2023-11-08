package Binary_Search;

import java.util.Scanner;

public class RotArrSearch {
  public static void main(String[] args) {
    System.out.println("Search in Rotated Sorted Array ");
    int arr[] = { 4, 5, 6, 1, 2, 3 };
    int n = arr.length;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Value to be found");
    int k = scan.nextInt();
    int low = 0, high = n - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (n == 0)
        System.out.println("No value Found");
      ;
      if (n == 1 && arr[0] == k)
        System.out.println(0);
      ;
      if (n == 1 && arr[0] != k)
        System.out.println("No value found");
      ;
      if (arr[mid] == k) {
        System.out.println("The index of value " + k + " is " + mid);
      }
      if(arr[low]<=arr[mid])
      {
        if(arr[low]<=k && k<=arr[mid])
        {
          high = mid -1;
        }
        else{
          low = mid + 1;
        }
      }
      else{
        if(arr[mid]<= k && arr[high] >= k)
        {
          low = mid + 1;
        }
        else{
          high = mid - 1;
        }
      }
    }
  }
}
