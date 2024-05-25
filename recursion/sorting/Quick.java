package recursion.sorting;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        quicksort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void quicksort(int[] arr, int s, int e) {
        if (s < e) {
            return;
        }
        int mid = s + (s - e) / 2;

        while (arr[e] < arr[mid]) {
            swap(arr, e, s);
            e--;
        }
        while (arr[s] > arr[mid]) {
            swap(arr, s, e);
            s++;
        }
        quicksort(arr, s, mid - 1);
        quicksort(arr, mid + 1, e);
    }

    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
