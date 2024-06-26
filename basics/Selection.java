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

    private static int maxindexx(int[] arr, int last) {
        int max = 0;
        for (int i = 0; i < last; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    private static int[] selectionsort(int[] arr) {
        for (int last = arr.length - 1; last > 0; last--) {
            int max = maxindexx(arr, last);
            swap(arr, max, last);
        }

        return arr;
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
