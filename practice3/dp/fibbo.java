package practice3.dp;

import java.util.HashMap;

public class fibbo {

    static Long result = 0l;
    public static HashMap<Integer, Long> memo = new HashMap<>();

    public static Long fibo(int n) {

        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n <= 1) {
            return 1l;
        }
        result = fibo(n - 1) + fibo(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fibo(45));
    }

}
