package Recursion;
import java.util.*;
public class ReverseStack
{
  public static Stack reversedStack(Stack stack,Stack dummy)
  {
    if(stack.isEmpty())
    {
      return dummy;
    }
    dummy.push(stack.pop());
    return reversedStack(stack, dummy);
  }
  public static void main(String[] args) {
    System.out.println("Reverse Stack using Recursion ");
    Integer arr[] = {1,2,3,4,5};
    Stack <Integer>stack = new Stack<>();
    //before
    stack.addAll(Arrays.asList(arr));
    System.out.println("Before reversing");
    while(!stack.isEmpty())
    {
      System.out.println(stack.pop());
    }
     stack.addAll(Arrays.asList(arr));
    Stack <Integer>dummy = new Stack<>();
    stack = reversedStack(stack,dummy); 
    //after
    System.out.println("After reversing");
    while(!stack.isEmpty())
    {
      System.out.println(stack.pop());
    }
  }
}
