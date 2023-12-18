package String.medium;
//Sort by frequency of the Character
import java.util.*;
public class sortByFreq {
  public static void main(String[] args) {
    System.out.println("Sort by frequency");
    String str = "saaiiii";
    int n  = str.length();
    HashMap<Character, Integer> hmap = new HashMap<>();
    for(int i=0; i<n; i++) {
        char c = str.charAt(i);
        hmap.put(c, hmap.getOrDefault(c, 0) + 1);
    }

    List<Character> characters = new ArrayList<>(hmap.keySet());
    Collections.sort(characters, (a, b) -> hmap.get(b).compareTo(hmap.get(a)));

    StringBuilder sb = new StringBuilder();
    for(char c : characters) {
        int occurrences = hmap.get(c);
        for(int i = 0; i < occurrences; i++) {
            sb.append(c);
        }
    }
    System.out.println(sb.toString());
  }
}
