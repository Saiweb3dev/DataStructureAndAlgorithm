package pattern;

public class pattern10 {
  static void top(int n)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  static void bottom(int n)
  {
    for(int i=1;i<n;i++)
    {
      for(int j=n;j>i;j--)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    System.out.println("Pattern 10");
    int n = 5;
    // top(n);
    bottom(n);
  }
}
