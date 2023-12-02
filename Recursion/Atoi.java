package Recursion;
//important
//converting string to integer with some conditions
//remove the unnecessary gap
//check the val is positive or negative
//end the return when it meets a symbol or any other than integer
//if val is greater than 2^31 or Integer.MAX_VALUE OR MIN return the Max val
public class Atoi {
  public static int AtoiFilter(String str, int i, double num , int sign)
  {
    if(i>=str.length() || str.charAt(i) < '0' || str.charAt(i) > '9')
    {
      num *=sign;
      if(num > Integer.MAX_VALUE)
      {
        return Integer.MAX_VALUE;
      }
      else if(num < Integer.MIN_VALUE)
      {
        return Integer.MIN_VALUE;
      }
      else 
      {
        return (int)num;
      }
    }
      num = num*10+(str.charAt(i) - '0');
      return AtoiFilter(str, i+1, num, sign);
  }
  public static void main(String[] args) {
    System.out.println("Atoi function using recursion");
    String str = "123A34";
    //removing unnecessary gap
    str = str.trim();
    int i = 0;
    int sign = 1;
    if(str.charAt(i) == '+')
    {
      sign = 1;
      i++;
    }
    else if(str.charAt(i) == '-')
  {
    sign = -1;
    i++;
  }
  int result = AtoiFilter(str,i,0,sign);
  System.out.println(result);
  }
}
