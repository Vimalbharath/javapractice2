package august;

public class twoarray {

    public boolean canBeEqual(int[] target, int[] arr) {

        insertionsort(arr);
        insertionsort(target);
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != target[i])
                return false;

        return true;

    }

    private static void insertionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}