package String;
//given a String with even value we need to split it into two and check both has equal number of vowels int it
public class VowelStr
{
  public static void main(String[] args) {
    System.out.println("Equal vowels in two Splitted String");
    String str = "saikumar";
    //our solution
    int n = str.length();
    int mid = n/2;
    int str1=0,str2 =0;
    str = str.toLowerCase();
    for(int i=0;i<mid;i++)
    {
      if("aeiou".contains(String.valueOf(str.charAt(i)))) str1+=1;
    }
    for(int i=mid;i<n;i++)
    {
      if("aeiou".contains(String.valueOf(str.charAt(i)))) str2+=1;
    }
    if(str1 == str2) System.out.println("true");
    else System.out.println("false");
  }
}