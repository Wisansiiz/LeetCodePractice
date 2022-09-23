package findLongestChain_646;

import java.util.Arrays;
import java.util.Comparator;

public class FindLongestChain {
    public static void main(String[] args) {
        int[][] pairs = {{-10, -8}, {8, 9}, {-5, 0}, {6, 10}, {-6, -4}, {1, 7}, {9, 10}, {-4, 7}};
        //{{1,2},{5,6},{2,3},{3,4}};
        System.out.println(new Solution().findLongestChain(pairs));
    }
}

class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[0]));
        int n = pairs.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (pairs[i][0] > pairs[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[n - 1];
    }
}
//        for (int i = 0, j = 0; j < pairs.length; j++) {
//            if (pairs[i][1] < pairs[j][0]) {
//                ans++;
//                i = j;
//            }
//        }