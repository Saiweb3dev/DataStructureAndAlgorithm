package pattern;

public class pattern17 {
  public static void main(String[] args) {
    System.out.println("Pattern 17");
    int n = 5;
    for (int i = 0; i < n; i++) {
      char ch = 'A';
      // left
      for (int j = n; j > i; j--) {
        System.out.print(" ");
      }
      int breakPoint = (2 * i+1)/2;
      // mid
      for (int j = 1; j <= 2*i + 1; j++) {
        System.out.print(ch+" ");
        if(j<=breakPoint)
        {
          ch++;
        }
        else{
          ch--;
        }
      }
      // right
      for (int j = n; j > i; j--) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
