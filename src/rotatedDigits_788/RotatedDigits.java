package rotatedDigits_788;

public class RotatedDigits {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(new Solution().rotatedDigits(n));
    }
}

class Solution {
    public int rotatedDigits(int n) {
        int ans = 0;
        int[] test = {0, 0, 1, -1, -1, 1, 1, -1, 0, 1};
        for (int i = 0; i <= n; i++) {
            boolean flip = false;
            boolean valid = true;
            String num = i + "";
            for (int j = 0; j < num.length(); j++) {
                int ch = test[num.charAt(j) - '0'];
                if (ch == 1) {
                    flip = true;
                }
                if (ch == -1)
                    valid = false;
            }
            if (valid && flip)
                ans++;
        }
        return ans;
    }
}