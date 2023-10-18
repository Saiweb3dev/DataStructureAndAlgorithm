package pattern;

public class pattern9 {
   static void top(int n)
  {
   for(int i=0;i<n;i++)
   {
    //left
    for(int j=0;j<n-i;j++)
    {
      System.out.print(" ");
    }
    //mid
    for(int j=0;j<=i*2;j++)
    {
      System.out.print("*");
    }
    //right
    for(int j=0;j<n-i;j++)
    {
      System.out.print(" ");
    }
    System.out.println();
   }
  }
  public static void main(String[] args) {
    System.out.println("Pattern 9");
    int n = 5;
    top(n);

  }
}
