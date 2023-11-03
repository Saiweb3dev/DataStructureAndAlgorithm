package hashing;
//revision need for this concept
import java.util.List;

import java.util.*;

public class LinearProb {
    public static void main(String[] args) {
        ArrayList<Integer> keys = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> ans = linearProbing(keys);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> linearProbing(ArrayList<Integer> keys) {
        int n = keys.size();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        ArrayList<Boolean> check = new ArrayList<>(Collections.nCopies(n, false));

        for (int i = 0; i < n; i++) {
            int index = keys.get(i) % n;
            while (check.get(index)) {
                index = (index + 1) % n;
            }
            ans.set(index, keys.get(i));
            check.set(index, true);
        }
        return ans;
    }
}

