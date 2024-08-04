package gfg.google.arrays;

import java.util.ArrayList;

public class sliding {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> ans = subarraySum(arr, 5, 5);
        System.out.println(ans);
    }

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if (s == 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    ans.add(i + 1); // 1-based index
                    ans.add(i + 1); // 1-based index
                    return ans;
                }
            }
            ans.add(-1);
            return ans;
        }
        int start = 0;
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            // int sum=arr[i];
            currentSum = currentSum + arr[i];
            while (currentSum > s && start <= i) {
                currentSum = currentSum - arr[start];
                start = start + 1;

            }

            if (currentSum == s) {
                ans.add(start + 1);
                ans.add(i + 1);
                return ans;
            }

        }

        ans.add(-1);
        return ans;
    }
}
