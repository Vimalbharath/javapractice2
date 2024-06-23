package dp.tabulation;

public class CanSum {

    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        boolean ans = coinChange(coins, 11);
        System.out.println(ans);

    }

    public static boolean coinChange(int[] coins, int amount) {
        boolean[] table = new boolean[amount + 1];
        table[0] = true;
        for (int i = 0; i < table.length; i++) {
            if (table[i] == true) {
                for (int b : coins) {
                    table[i + b] = true;
                }

            }
        }
        return table[amount];

    }
}
