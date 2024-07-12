package daily;

public class Stringab {

    public int maximumGain(String s, int x, int y) {
        // if (s.length() == 0) {
        // return Math.max(x, y);
        // }
        // char ch = s.charAt(0);
        String up = s;
        // String p = "";
        int ans = 0;
        return skipletter(up, x, y, ans);

    }

    public int skipletter(String up, int x, int y, int ans) {
        if (up.isEmpty()) {

            return ans;
        }
        // char ch = up.charAt(0);
        if (up.startsWith("ab")) {

            return skipletter(up.substring(2), x, y, ans + x);
        }
        if (up.startsWith("ba")) {

            return skipletter(up.substring(2), x, y, ans + y);
        }

        return ans;
    }
}

class Solution {
    public int maximumGain(String s, int x, int y) {
        int countA = 0;
        int countB = 0;
        int result = 0;
        int less = Math.min(x, y);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch > 'b') {
                result += Math.min(countA, countB) * less;
                countA = 0;
                countB = 0;
            } else if (ch == 'a') {
                if (x < y && countB > 0) {
                    countB--;
                    result += y;
                } else {
                    countA++;
                }
            } else {
                if (x > y && countA > 0) {
                    countA--;
                    result += x;
                } else {
                    countB++;
                }
            }

        }
        result += Math.min(countA, countB) * less;

        return result;
    }
}