package gfg.google.arrays;

import java.util.ArrayList;

public class sliding {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int start = 0;
        int currentSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // int sum=arr[i];
            if (arr[i - 1] == s) {
                ans.add(arr[i]);
                break;
            }
            currentSum = currentSum + arr[i];
            if (currentSum == s) {
                ans.add(start);
                ans.add(i);
                break;
            }
            if (currentSum > s) {
                currentSum = currentSum - arr[start];
                start++;
            }
        }

        return ans;
    }
}
