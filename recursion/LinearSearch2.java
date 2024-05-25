package recursion;

import java.util.ArrayList;

public class LinearSearch2 {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 8, 2, 9, 0, 2, 1 };
        int target = 2;
        int ans = linear(arr, target, 0);
        System.out.println(list);

    }

    public static ArrayList<Integer> list = new ArrayList<>();

    private static int linear(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            list.add(i);
        }

        return linear(arr, target, i + 1);
    }

}
