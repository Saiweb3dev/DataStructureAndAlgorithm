package String;

import java.util.*;

public class RemOutPar {
  //Remove the outer most parenthesis
  public static void main(String[] args) {
    String str = "(()())(())";
    int n  = str.length();
    List<String> strSets = new ArrayList<>();
    for(int i=1;i<n;i++)
    {
      int initial = i-1;
      int left = 1;
      while(i<n&&left>0)
      {
        if(str.charAt(i) == '(') left++;
        else left--;
        i++;
      }
      strSets.add(str.substring(initial, i));
    }
    StringBuilder sb = new StringBuilder();
    for(String set : strSets)
    {
      sb.append(set.substring(1, set.length()-1));
    }
    System.out.println("The Parenthesis Removes String is -> "+sb.toString());
  }
}
