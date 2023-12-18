package String;
//Maximum Nesting Depth of the Parentheses
public class NestDepth {
  public static void main(String[] args) {
    System.out.println("Nesting Depth");
    String str = "(1)+((2))+(((3)))";
    int maxDepth = 0, currentDepth = 0;
    for(char c : str.toCharArray()) {
        if(c == '(') {
            currentDepth++;
            maxDepth = Math.max(maxDepth, currentDepth);
        } else if(c == ')') {
            currentDepth--;
        }
    }
    System.out.println(maxDepth); 
  }
}
