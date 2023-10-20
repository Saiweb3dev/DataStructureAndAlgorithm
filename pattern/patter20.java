package pattern;

public class patter20 {
  static void bottom(int n)
  {
    for(int i=0;i<n;i++)
    {
      //left
      for(int j=n;j>i;j--)
      {
        System.out.print("*");
      }
      //mid
      for(int j=i*2;j>0;j--)
      {
        System.out.print(" ");
      }
      //right
      for(int j=n;j>i;j--)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  static void top(int n)
  {
    for(int i=0;i<n;i++)
    {
      //left
      for(int j=0;j<=i;j++)
      {
        System.out.print("*");
      }
      //mid
      for(int j=n*2-i-2;j>i;j--)
      {
        System.out.print(" ");
      }
      //right
      for(int j=0;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    System.out.println("Pattern 20");
    int n = 5;
   top(n);
   bottom(n);

  }
}
