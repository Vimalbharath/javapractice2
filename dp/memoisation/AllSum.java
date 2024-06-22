package dp.memoisation;

import java.util.ArrayList;
import java.util.List;

public class AllSum {

    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int amount = 5;
        List<List<Integer>> combinations = findCombinations(coins, amount);
        System.out.println("All combinations:");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
        System.out.println(combinations.size());
    }

    private static void findCombinations(int[] coins, int amount, int currentIndex, List<Integer> currentCombination,
            List<List<Integer>> allCombinations) {
        if (amount == 0) {
            // Found a valid combination, add it to the results
            allCombinations.add(new ArrayList<>(currentCombination));
            return;
        }

        if (amount < 0 || currentIndex >= coins.length) {
            // Invalid combination or no more coins to explore
            return;
        }

        // Try including the current coin
        currentCombination.add(coins[currentIndex]);
        findCombinations(coins, amount - coins[currentIndex], currentIndex, currentCombination, allCombinations);

        // Try excluding the current coin (backtracking)
        currentCombination.remove(currentCombination.size() - 1);
        findCombinations(coins, amount, currentIndex + 1, currentCombination, allCombinations);
    }

    public static List<List<Integer>> findCombinations(int[] coins, int amount) {
        List<List<Integer>> allCombinations = new ArrayList<>();
        findCombinations(coins, amount, 0, new ArrayList<>(), allCombinations);
        return allCombinations;
    }
}
