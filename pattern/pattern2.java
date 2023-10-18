package pattern;

public class pattern2 {
  public static void main(String[] args) {
    System.out.println("pattern 2");
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
