package dp;

import java.util.HashMap;
import java.util.Map;

public class stairs {
    public int climbStairs(int n) {
        int[] array = new int[45];
        array[0] = 1;
        array[1] = 2;
        for (int i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n - 1];
    }

    private static Map<Integer, Integer> memo = new HashMap<>();

    public int climbStairs2(int n) {
        if (n == 0)
            return 1;
        if (n < 2) {
            return n;
        }
        // Return cached result if it exists
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Compute and cache the result if it's not already in the cache

        int result = climbStairs2(n - 2) + climbStairs2(n - 1);
        memo.put(n, result);
        return result;
    }

}
