package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Union {
  public static void main(String[] args) {
    System.out.println("Union of two array");
    int a[] = {1,2,3,4,5};
    int n = a.length;
    int b[] = {6,7,8,9,10};
    int m =b.length;
    Set set = new TreeSet<>();
    for(int nums : a)
    {
      set.add(nums);
    }
    for(int nums : b)
    {
      set.add(nums);
    }
    List <Integer>finList = new ArrayList(set);
    for(int i=0;i<finList.size();i++)
    {
      System.out.print(finList.get(i));
    }
  }
}
