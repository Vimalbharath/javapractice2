package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class LoudRich {

    List<Integer> lis[];
    int n;
    int dp[];

    public int[] loudAndRich(int[][] richer, int[] quiet) {
        n = quiet.length;
        dp = new int[n];
        lis = new ArrayList[n];
        Arrays.fill(dp, -1);
        int res[] = new int[n];
        for (int i = 0; i < n; i++)
            lis[i] = new ArrayList<>();
        for (int i[] : richer) {
            lis[i[1]].add(i[0]);
        }
        for (int i = 0; i < n; i++) {
            res[i] = dfs(i, quiet);
        }
        return res;
    }

    public int dfs(int ind, int[] quiet) {
        if (dp[ind] != -1)
            return dp[ind];
        int minIndex = ind, minQuiet = quiet[ind];
        for (int i : lis[ind]) {
            int min = dfs(i, quiet);
            if (quiet[min] < minQuiet) {
                minQuiet = quiet[min];
                minIndex = min;
            }
        }
        return dp[ind] = minIndex;
    }

    public int[] loudAndRich1(int[][] richer, int[] quiet) {
        int n = quiet.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] arr : richer) {
            adj.get(arr[1]).add(arr[0]);
        }

        int[] ans = new int[n];
        Arrays.fill(ans, -1); // Initialize all answers to -1
        for (int i = 0; i < n; i++) {
            if (ans[i] == -1) { // If answer for this person is not yet calculated
                dfs(adj, quiet, ans, i);
            }
        }
        return ans;
    }

    private int dfs(ArrayList<ArrayList<Integer>> adj, int[] quiet, int[] ans, int src) {
        if (ans[src] != -1) {
            return ans[src]; // Return if answer for this person is already calculated
        }
        int minQuiet = src; // Initialize with current person
        for (int next : adj.get(src)) {
            int candidate = dfs(adj, quiet, ans, next); // Recursively find the least quiet person among richer
                                                        // acquaintances
            if (quiet[minQuiet] > quiet[candidate]) {
                minQuiet = candidate; // Update minQuiet if a quieter person is found
            }
        }
        ans[src] = minQuiet; // Store the result for current person
        return minQuiet;
    }
}
