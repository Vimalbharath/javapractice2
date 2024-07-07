package daily;

public class Bottle {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0;
        while (numBottles >= numExchange) {
            int ab = numBottles / numExchange;
            ans = ans + ab;
            numBottles = (numBottles % numExchange) + ab;
        }
        return ans;
    }
}