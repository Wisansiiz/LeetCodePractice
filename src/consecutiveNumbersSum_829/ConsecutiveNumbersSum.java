package consecutiveNumbersSum_829;

public class ConsecutiveNumbersSum {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(new Solution().consecutiveNumbersSum(n));
    }
}
class Solution {
    public int consecutiveNumbersSum(int n) {
        if (n == 1)
            return 1;
        int ans = 1;
        for (int k = 1; k*k < 2*n; k++){
            if (2*n % k != 0)
                continue;
            if ((2*n/k+1-k)%2==0)
                ans++;
        }
        return ans;
    }
}