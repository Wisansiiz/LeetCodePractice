package sortArrayByParity_905;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(new Solution().sortArrayByParity(nums)));
    }
}

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int j = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                ans[j] = num;
                j++;
            }
        }
        for (int num : nums) {
            if (num % 2 == 1) {
                ans[j] = num;
                j++;
            }
        }
        return ans;
    }
}
class Solution2 {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int j = 0, k = n - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                ans[j] = num;
                j++;
            }
            if (num % 2 == 1) {
                ans[k] = num;
                k--;
            }
        }
        return ans;
    }
}