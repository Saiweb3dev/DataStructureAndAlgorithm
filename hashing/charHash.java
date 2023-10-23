package hashing;

import java.util.Scanner;

public class charHash {
  public static void main(String[] args) {
    System.out.println("Character Hashing");
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the String");
    String str = scan.nextLine();
    int n = str.length();
    //pre-compute
    //256 as per ASCII to find that even the value is sm or big alphabets
    int hash[] = new int[256];
    for(int i=0;i<n;i++)
    {
      hash[str.charAt(i)]++;
    }
    //value output
    System.out.println("Enter the number of query");
    int query = scan.nextInt();
    for(int i=0;i<query;i++)
    {
      System.out.println("Enter the character to find its value");
      //getting char as input
      char ch = scan.next().charAt(0);
      System.out.println("The value" + ch + " is present " + hash[ch] + " times");
    }
  }
}
