package recursion.sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        selectionsort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionsort(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[max] < arr[c]) {
                selectionsort(arr, r, c + 1, c);
            } else {
                selectionsort(arr, r, c + 1, max);
            }
        }
        swap(arr, max, c);
        selectionsort(arr, r - 1, 0, 0);

    }

    private static void swap(int[] arr, int max, int c) {
        int temp = arr[max];
        arr[max] = arr[c];
        arr[c] = temp;
    }
}
