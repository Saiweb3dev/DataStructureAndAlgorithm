
//printing the value like spiral form

import java.util.*;

public class Spiral {

  public static void main(String[] args) {
    System.out.println("Spiral of matrix");
    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    int n = matrix.length;
    int m= matrix.length;
    List <Integer>list = new ArrayList<>();
    int left =0,right =m-1;
    int top =0,bottom=n-1;
    while(left<=right && top<=bottom)
    {
      for(int i=left;i<=right;i++)
      {
        list.add(matrix[top][i]);
      }
      top++;
      for(int i=top;i<=bottom;i++)
      {
       list.add(matrix[i][right]);
      }
      right--;
      if(top<=bottom)
      {
        for(int i=right;i>=left;i--)
        {
          list.add(matrix[bottom][i]);
        }
        bottom--;
      }
      if(left<=right)
      {
        for(int i=bottom;i>=top;i--)
        {
          list.add(matrix[i][left]);
          left++;
        }
      }
    }
    for(int i=0;i<list.size();i++)
    {
    System.out.print(list.get(i)+" ");
    }
  }
}