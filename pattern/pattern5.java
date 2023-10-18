package pattern;

public class pattern5 {
  public static void main(String[] args) {
    System.out.println("Pattern 5");
    int n = 5;
    for(int i=0;i<n;i++)
    {
     for(int j=n;j>i;j--)
     {
      System.out.print("*");
     }
     System.out.println();
    }
  }
}
