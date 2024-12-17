package practice3.basics;

import java.util.Arrays;

public class cyclic {
    public static void main(String[] args) {
        int arr[] = { 5, 8, 9, 3, 4, 6, 7, 2, 1 };
        System.out.println(Arrays.toString(arr));
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void cyclicsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            int j = 0;
            while (j < arr.length) {
                int correct = j + 1;
                if (arr[j] != correct) {
                    swap(arr, j, correct);
                }
                j++;
            }

        }

    }

    public static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
