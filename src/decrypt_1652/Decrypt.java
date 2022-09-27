package decrypt_1652;

import java.util.Arrays;

public class Decrypt {
    public static void main(String[] args) {
        int[] code = {2, 4, 9, 3};//{5,7,1,4};
        int k = -2;//3;
        System.out.println(Arrays.toString(new Solution().decrypt(code, k)));
    }
}

class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        if (k == 0)
            return ans;
        int i = 0;
        if (k > 0) {
            while (i != n) {
                for (int j = 1; j <= k; j++) {
                    ans[i % n] += code[(i + j) % n];
                }
                i++;
            }
        }
        i = 0;
        if (k < 0) {
            while (i != n) {
                for (int j = 1; j <= -k; j++) {
                    ans[i % n] += code[(n - j + i) % n];
                }
                i++;
            }
        }
        return ans;
    }
}