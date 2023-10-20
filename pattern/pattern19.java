package pattern;

public class pattern19 {
  static void top(int n)
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
  static void bottom(int n)
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
    System.out.println("Pattern 19");
    int n = 3;
    top(n);
    bottom(n);
  }
}
