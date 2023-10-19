package pattern;

public class pattern12 {
  public static void main(String[] args) {
    System.out.println("Pattern 12");
     int n = 4;
     for(int i =1;i<=n;i++)
     {
      //left
      for(int j=1;j<=i;j++)
      {
        System.out.print(j);
      }
      //mid
      for(int j=n*2-i;j>i;j--)
      {
        System.out.print(" ");
      }
      //right
      for(int j = i;j>=1;j--)
      {
        System.out.print(j);
      }
      System.out.println();
     }
  }
}
