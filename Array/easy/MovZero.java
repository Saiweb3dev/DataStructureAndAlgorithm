package easy;

import java.util.ArrayList;

public class MovZero {
  public static void main(String[] args) {
    System.out.println("Moving Zero to the end");
    int arr[] = {1,2,3,0,2,3,0,0,1,2,1,0};
    int n  = arr.length;
    //printing the array before changes
    System.out.println("Before Logic");
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]);
    }
    int j =0;
    //moving the value other than 0 
    for(int i=0;i<n;i++)
    {
      if(arr[i] != 0)
      arr[j++] = arr[i];
    } 
    //filling remaining with 0
    for(;j<n;j++) arr[j] = 0;
    
    //printing the value
    System.out.println("After the Logic");
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]);
    }
  }
}
