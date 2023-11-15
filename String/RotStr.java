package String;
public class RotStr
{
  public static void main(String[] args) {
    System.out.println("Rotated String");
    String str = "abcde";
    String goal = "cdeab";
    String hold = str+str;
    if(hold.contains(goal)) System.out.println("The String Rotation consist the goal");
    else System.out.println("It doesn't contains");
  }
}