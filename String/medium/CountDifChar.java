package String.medium;

import java.util.Arrays;
// Count With K Different Characters
//Revision needed
public class CountDifChar{
  public static void main(String[] args) {
    System.out.println("Count different character in k");
    String str = "aacfssa";
    int k = 3;
    int result = 0;

		// Array to store count of characters.
		int[] count = new int[26];

		// All substrings.
		for (int i = 0; i < str.length(); i++) {
			int distinctChars = 0;

			// Initializing count array with zero for every iteration.
			Arrays.fill(count, 0);

			for (int j = i; j < str.length(); j++) {

				if (count[str.charAt(j) - 'a'] == 0) {
					distinctChars++;
				}

				// Increment count of current character.
				count[str.charAt(j) - 'a']++;

				if (distinctChars == k) {
					result++;
				}
			}
		}

		System.out.println(result); 
  }
}