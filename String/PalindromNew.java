package String;
//to check the String is a Palindrome and should ignore any symbols or white space other than char and integer
public class PalindromNew {
  public static void main(String[] args) {
    System.out.println("String Palindrome with new changes");
    String str = "c1 O$d@eeD o1c";
    //it replace all other than in the regex with the replacement
    String filterStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    String strRev = new StringBuilder(filterStr).reverse().toString();
    if(filterStr.equals(strRev)) System.out.println("It is a palindrome. The String is "+filterStr);
    else System.out.println(("It is not a palindrome. The String is "+filterStr));
  }
}
