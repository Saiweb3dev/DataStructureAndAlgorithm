package String;
//Two strings s and t are isomorphic if the characters in s can be replaced to get t. eg aab = xxy and aab != xyz
import java.util.*;
public class Isomorphic {
  public static void main(String[] args) {
    System.out.println("Isomorphic String");
    String str1 = "aab";
    String str2 = "xuy";
    int n = str1.length();
    int m = str2.length();
    if(n!=m) System.out.println("Isomorphic is not possible");
    HashMap<Character,Character> hm1 = new HashMap<>();
    HashMap<Character,Character> hm2 = new HashMap<>();
    int flag = 0;
    for(int i=0;i<n;i++)
    {
      char c1 = str1.charAt(i);
      char c2 = str2.charAt(i);
      if(!hm1.containsKey(c1)) hm1.put(c1,c2);
      else if(hm1.get(c1) != c2)
      {
        System.out.println("They are not Isomorphic");
        flag = 1;
      }
      if(!hm2.containsKey(c2)) hm1.put(c2,c1);
      else if(hm1.get(c2) != c1)
      {
        System.out.println("They are not Isomorphic");
        flag = 1;
      }
    }
  if(flag == 0) System.out.println("It is an Isomorphic String");
  }
}
