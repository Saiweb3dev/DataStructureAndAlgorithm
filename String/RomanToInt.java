package String;

import java.util.HashMap;

//converting roman numbers to Integer
//the logic is checking if the next num is > than curr then - it in val
public class RomanToInt {
  public static void main(String[] args) {
    System.out.println("Roman to Integer");;
    String s = "MCMXCIV";
     HashMap<Character, Integer> hmap = new HashMap<>();
        hmap.put('I', 1);
        hmap.put('V', 5);
        hmap.put('X', 10);
        hmap.put('L', 50);
        hmap.put('C', 100);
        hmap.put('D', 500);
        hmap.put('M', 1000);
        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && hmap.get(s.charAt(i)) < hmap.get(s.charAt(i + 1))) {
                value -= hmap.get(s.charAt(i));
            } else {
                value += hmap.get(s.charAt(i));
            }
        }
        System.out.println(value);
  }
}
