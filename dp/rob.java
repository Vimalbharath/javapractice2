package dp;

public class rob {
    public int rob1(int[] nums) {
        int rob = 0;
        int norob = 0;
        for (int i = 0; i < nums.length; i++) {
            int newRob = norob + nums[i];
            int newNoRob = Math.max(norob, rob);
            rob = newRob;
            norob = newNoRob;
        }
        return Math.max(rob, norob);
    }
}
