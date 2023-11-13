package String;

import java.util.Arrays;

//Longest Common Prefix in the String Array
public class LComPrefix {
  public static void main(String[] args) {
    System.out.println("Longest Common Prefix");
    String str[] = {"abc","abe","abd"};
    int n = str.length;
    Arrays.sort(str);
    int i = 0;
    String first = str[0],last = str[n-1];
    while(i<first.length() && i<last.length())
    {
      if(first.charAt(i) == last.charAt(i)) i++;
      else break;
    }
    String LargeComPre = i==0 ? "No Large Prefix" : first.substring(0,i);
    System.out.println("The Longest Common Prefix is -> "+ LargeComPre);
  }
}
