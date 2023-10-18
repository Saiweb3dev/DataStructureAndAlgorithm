package pattern;

public class pattern8 {
  public static void main(String[] args) {
    System.out.println("Pattern 8");
    int n =5;
    for(int i=0;i<n;i++)
    {
      //left
      for(int j=0;j<i;j++)
      {
        System.out.print(" ");
      }
       //mid
       for(int j=n*2-i-1;j>i;j--)
       {
        System.out.print("*");
       }
      //right
      for(int j=0;j<i;j++)
      {
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
