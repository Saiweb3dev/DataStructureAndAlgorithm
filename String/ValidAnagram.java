package String;
//It is valid if all the character matches both the string if not then it is not anagram
public class ValidAnagram
{
  public static void main(String[] args) {
    System.out.println("Valid Anagram");
    String str1 = "rasp";
    String str2 = "spar";
    int n = str1.length();
    int m = str2.length();
    if(n!=m) System.out.println("It is not a valid Anagram");
    int hash[] = new int[256];
    for(int i=0;i<n;i++)
    {
      hash[str1.charAt(i)]++;
      hash[str2.charAt(i)]--;
    }
    for(int i=0;i<hash.length;i++)
    {
      if(hash[i] != 0)
      {
System.out.println();
break;
      } 
    }
    System.out.println("It is a valid Anagram");
  }
}