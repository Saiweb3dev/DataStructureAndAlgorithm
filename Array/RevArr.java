package Array;

import java.util.Scanner;

public class RevArr {
  public static void main(String[] args) {
    System.out.println("Reversing an array to k position");
  
    int arr[] = {1,2,3,4,5};
    int n = arr.length;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the value of k");
    int k = scan.nextInt();
    k = k % n;
    System.out.println("Array before");
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]);
    }
    System.out.println();
    // storing element in temp Array till k value
    int TempArr[] = new int[k];
    for(int i=0;i<k;i++)
    {
      TempArr[i] = arr[i];
    }
    //Moving element in array
    for(int i=k;i<n;i++)
    {
      arr[i-k] = arr[i];
    }
    //Adding the Temp array to the main Array
    for(int i=n-k;i<n;i++)
    {
     arr[i] = TempArr[i-(n-k)];
    }
    //Output
    System.out.println("Final Array");
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]);
    }
  }
}
