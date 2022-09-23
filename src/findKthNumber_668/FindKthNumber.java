package findKthNumber_668;

import java.util.Arrays;

public class FindKthNumber {
    public static void main(String[] args) {
        int m = 3, n = 3, k = 5;
        System.out.println(new Solution2().findKthNumber(m, n, k));
    }
}
//超时
class Solution {
    public int findKthNumber(int m, int n, int k) {
        int[] list = new int[m * n];
        int index = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                list[index++] = i * j;
            }
        }
        Arrays.sort(list);
        return list[k - 1];
    }
}
class Solution2 {
    public int findKthNumber(int m, int n, int k) {
        int left = 1, right = m * n;
        while (left < right) {
            int x = left + (right - left) / 2;
            int count = x / n * n;
            for (int i = x / n + 1; i <= m; ++i) {
                count += x / i;
            }
            if (count >= k) {
                right = x;
            } else {
                left = x + 1;
            }
        }
        return left;
    }
}