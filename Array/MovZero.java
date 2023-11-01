package Array;

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
    //creating a list 
    ArrayList <Integer>TempArr = new ArrayList<>();
    //adding the non zero element to the List
    for(int i=0;i<n;i++)
    {
      if(arr[i]!=0)
      {
        TempArr.add(arr[i]);
      }
    }
    //adding 0 to last by filling remaining size of tempArr till n
    int m = TempArr.size();
    for(int i=m;i<n;i++)
    {
      TempArr.add(0);
    }
    //printing the value
    System.out.println("After the Logic");
    for(int i=0;i<n;i++)
    {
      System.out.print(TempArr.get(i));
    }
  }
}
