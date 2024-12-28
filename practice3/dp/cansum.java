package practice3.dp;

public class cansum {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 7 };
        int sum = 7;
        boolean ans = cansum1(arr, sum);
        System.out.println(ans);
    }

    public static boolean cansum1(int[] arr, int sum) {
        if (sum < 0) {
            return false;
        }
        if (sum == 0) {
            return true;
        }
        for (int number : arr) {
            if (sum < number) {
                // sum=sum-number;
                cansum1(arr, sum - number);
            }
            // cansum1(arr, sum);
        }
        return false;

    }
}
