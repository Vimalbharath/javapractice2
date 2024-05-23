package basics;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 6, -2, 5, 4, 3, 2 };
        arr = selectionsort(arr);
        // swap(arr, 1, 2);
        int max = maxindex(arr);
        System.out.println(max);
        System.out.println(Arrays.toString(arr));
    }

    private static int maxindex(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    private static int maxindexx(int[] arr, int j) {
        int max = 0;
        for (int i = 0; i < j; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    private static int[] selectionsort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int max = maxindexx(arr, i);
            swap(arr, max, i);
        }

        return arr;
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
