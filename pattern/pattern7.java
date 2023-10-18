package pattern;

public class pattern7 {
  public static void main(String[] args) {
    System.out.println("pattern 7");
    int n = 5;
    for (int m = 1; m <= n; m++) {
      // left
      for (int j = n; j > m; j--) {
        System.out.print(" ");
      }

      // mid
      for (int j = 1; j < m * 2; j++) {
        System.out.print("*");
      }
      // right
      for (int j = n; j > m; j--) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
