package pattern;

public class pattern18 {
  public static void main(String[] args) {
    System.out.println("Pattern 18");
    int n = 3;
     char ch = 64;
     ch+=n;
     char temp = ch;
     for(int i=0;i<n;i++)
     {
      ch = temp;
      for(int j=0;j<=i;j++)
      {
        System.out.print(ch);
        ch++;
      }
      System.out.println();
     }
   





    /* This code is for the complex problem of  
     * E
     * DE
     * CDE
     * BCDE
     * ABCDE
    */
     
//     for(int i =1;i<=n;i++)
//     {
// char ch = 65;
//      int flag = 0;
//       for(int j = n-i;j<n;j++)
//       {
//         if(flag == 0)
//         {
//           ch+=j;
//         }
//         System.out.print(ch);
//         ch++;
//         flag = 1;
//       }
//       System.out.println();
//     }
  }
}
