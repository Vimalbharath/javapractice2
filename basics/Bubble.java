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

        if (arr.length < 2) {
            return arr;
        }
        for (int j = arr.length; j > 0; j--) {
            for (int i = 1; i < j; i++) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i, i - 1);
                }
            }

        }
        return arr;

    }

    private static void insertion(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);

                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = temp;
    }
}