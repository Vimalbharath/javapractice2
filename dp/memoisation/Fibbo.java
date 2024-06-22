package dp.memoisation;

import java.util.HashMap;
import java.util.Map;

public class Fibbo {

    public static void main(String[] args) {
        long ans = fibbo(50);
        System.out.println(ans);
    }

    private static Map<Integer, Long> memo = new HashMap<>();

    private static long fibbo(int i) {
        if (i < 2) {
            return i;
        }
        // Return cached result if it exists
        if (memo.containsKey(i)) {
            return memo.get(i);
        }

        // Compute and cache the result if it's not already in the cache

        long result = fibbo(i - 2) + fibbo(i - 1);
        memo.put(i, result);
        return result;
    }
}
