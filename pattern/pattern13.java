package pattern;

public class pattern13 {
  public static void main(String[] args) {
    System.out.println("pattern 13");
    int n = 5;
    int val = 1;
    for(int i =0;i<n;i++)
    {
      
      for(int j=0;j<=i;j++)
      {
        System.out.print(val+" ");
        val +=1;
      }
      System.out.println();
    }
  }
}
