package recursion.sorting;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quicksort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;

        while (s <= e) {
            while (arr[e] > arr[mid]) {
                // swap(arr, e, s);
                e--;
            }
            while (arr[s] < arr[mid]) {
                // swap(arr, s, e);
                s++;
            }
            if (s <= e) {
                swap(arr, s, e);
                e--;
                s++;
            }
        }
        quicksort(arr, low, e);
        quicksort(arr, s, high);
    }

    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
