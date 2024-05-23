package basics;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, -2, 5, 4, 3, 2 };
        arr = bubblesort(arr);
        // swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] bubblesort(int[] arr) {

        int j = arr.length;
        if (j < 2) {
            return arr;
        }
        while (j > 0) {
            for (int i = 1; i < j; i++) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i, i - 1);
                }
            }
            j--;
        }
        return arr;

    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = temp;
    }
}