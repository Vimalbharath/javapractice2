package recursion.sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        bubblesort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubblesort(int[] arr, int r, int c) {
        if (c > r) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubblesort(arr, r, c + 1);
        }
        // bubblesort(arr, r - 1, 0);
    }
}
