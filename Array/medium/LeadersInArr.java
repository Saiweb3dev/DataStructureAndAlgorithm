package medium;

import java.util.*;

//A element is called superior if it is greater than all the element in its left and the last element is always superior
public class LeadersInArr
{
  public static void main(String[] args) {
    System.out.println("Leaders in Array");
    int arr[] = {1,2,5,3,2,1};
    int n  = arr.length;
    List <Integer>ans = new ArrayList<>();
    int max = arr[n-1];
    ans.add(max);
    for(int i=n-2;i>=0;i--)
    {
      if(arr[i] > max)
      {
        ans.add(arr[i]);
        max = arr[i];
      }
    }
    //output
    for(int i=0;i<ans.size();i++)
    {
      System.out.print(ans.get(i)+" ");
    }
  }
}