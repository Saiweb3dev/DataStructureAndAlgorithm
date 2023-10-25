package String;
//Reversing the strings in a sentence without changing the character inside the String
public class RevSentence {
  public static String RevString(String str)
  {
    String[] words = str.split(" ");
    StringBuilder revStr = new StringBuilder();
    for(int i=words.length-1;i>=0;i--)
    {
    revStr.append(words[i]+" ");
    System.out.println(words[i]);
    }
    return revStr.toString().trim();
  }
  public static void main(String[] args) {
    System.out.println("Strings reversing in a sentence");
    String str = "Hello My Name is Sai Kumar";
    System.out.println(RevString(str));
  }
}
