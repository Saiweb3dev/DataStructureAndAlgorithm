
public class Rot90Deg {

  public static void main(String[] args) {
    System.out.println("Rotating array 90 degree");
    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    int n = matrix.length;
    int m = matrix[0].length;
    //Transpose the matrix or swapping element by [i][j] to [j][i] triangle swapping
    for(int i=0;i<n;i++)
    {
     for(int j=i;j<n;j++)
     {
      int temp = matrix[j][i];
      matrix[j][i] = matrix[i][j];
      matrix[i][j] = temp;
     }
    }
    System.out.println("transpose matrix");
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        System.out.print(matrix[i][j]+" ");
    }
    System.out.println();
  }
    //swapping element in row like normal reverse array till half of row and not changing anything to column
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m/2;j++)
      {
        int temp = matrix[i][j];
        //to get element from the last 
        matrix[i][j] = matrix[i][m-j-1];
        matrix[i][m-j-1] = temp;
      }
    }
    //output
    System.out.println("output");
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