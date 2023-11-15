package String;
//Largest Odd Number In a String
public class LOddNumInStr {
  public static void main(String[] args) {
    System.out.println("Largest Odd  number In String");
    String str = "1234";
    int n = str.length();
    int i = n-1;
    while(i>=0 && (str.charAt(i) - 0)%2 ==0)
    {
      i--;
    }
    String FinalNum = i>=0 ? str.substring(0, i+1) : "No Odd Number";
    System.out.println(FinalNum);
  }
}
