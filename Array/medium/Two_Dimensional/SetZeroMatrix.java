package medium.Two_Dimensional;
public class SetZeroMatrix {
  public static void main(String[] args) {
    System.out.println("Set Zero matrix");
    int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
    int m = matrix.length;
    int n = matrix[0].length;
    boolean firstRowZero = false;
    boolean firstColZero = false;
    // Check if first row or first column has a zero
    for (int i = 0; i < m; i++) {
        if (matrix[i][0] == 0) {
            firstColZero = true;
            break;
        }
    }
    for (int j = 0; j < n; j++) {
        if (matrix[0][j] == 0) {
            firstRowZero = true;
            break;
        }
    }
    // Use first row and first column as markers
    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }
    // Set elements to zero based on markers in first row and first column
    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0;
            }
        }
    }
    // Set first row and first column to zero based on earlier stored information
    if (firstRowZero) {
        for (int j = 0; j < n; j++) {
            matrix[0][j] = 0;
        }
    }
    if (firstColZero) {
        for (int i = 0; i < m; i++) {
            matrix[i][0] = 0;
        }
    }
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        System.out.print(matrix[i][j]+" ");
    }
    System.out.println();
  }
}
}
