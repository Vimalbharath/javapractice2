package practice3.dp;

import java.util.HashMap;

public class cansum {
    public static void main(String[] args) {
        int[] arr = { 7, 14 };
        int sum = 300;
        boolean ans = cansum1(arr, sum);
        System.out.println(ans);
    }

    public static HashMap<Integer, Boolean> memo = new HashMap<>();

    public static boolean cansum1(int[] arr, int sum) {
        if (memo.containsKey(sum)) {
            return memo.get(sum);
        }
        if (sum < 0) {
            return false;
        }
        if (sum == 0) {
            return true;
        }
        for (int number : arr) {
            // if (number <= sum) {
            // sum=sum-number;
            if (cansum1(arr, sum - number) == true) {
                memo.put(sum - number, true);
                return true;
            }
            // }
            // cansum1(arr, sum);
        }
        memo.put(sum, false);
        return false;

    }
}
