package hashing;

import java.util.Scanner;

public class numHash {
  public static void main(String[] args) {
    System.out.println("Number Hashing");
    int arr[] = { 1, 3, 1, 2, 2, 3, 1, 1 };
    int n = arr.length;
    Scanner scan = new Scanner(System.in);
    int hash[] = new int[n];
    // pre-compute
    for (int i = 0; i < n; i++) {
      hash[arr[i]]++;
    }
    // output the value
    System.out.println("How many queries are required?");
    int query = scan.nextInt();
    System.out.println("Enter the query value");
    for (int i = query; i > 0; i--) {
      int num = scan.nextInt();
      System.out.println("The value" + num + " is present " + hash[num] + " times");
    }

  }
}
