package pattern;

public class pattern3 {
  public static void main(String[] args) {
    System.out.println("pattern 3 created");
    int n = 5;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
