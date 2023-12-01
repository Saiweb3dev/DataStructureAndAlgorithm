package Recursion;
//if n is positive multiply or if negative divide
public class PowerN {
  public static double Power(double num , int n)
  {
    if(n == 0) return 1;
    if(n < 0)
    {
      return 1/num*Power(num, -(n+1));
    }
    else{
      double half = Power(num,n/2);
      return n%2 == 0 ? half*half : half*half*num;

    }
  }
  public static void main(String[] args) {
  System.out.println("Power N");
  int num = 3;
  int n = 2;
  double result = Power(num,n);
  System.out.println(result);
  }
}
