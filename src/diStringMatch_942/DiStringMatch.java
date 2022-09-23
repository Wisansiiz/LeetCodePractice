package diStringMatch_942;

import java.util.Arrays;

public class DiStringMatch {
    public static void main(String[] args) {
        String s = "IDID";
        System.out.println(Arrays.toString(new Solution().diStringMatch(s)));
    }
}
class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length(), left = 0, right = n;
        int [] ans = new int[n + 1];
        for (int i = 0; i < n; i++) {
            ans[i] = s.charAt(i) == 'I' ? left++ : right--;
        }
        ans[n] = left;
        return ans;
    }
}