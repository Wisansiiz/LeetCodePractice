package maxProduct_1464;

import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        System.out.println(new Solution().maxProduct(nums));
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return (nums[n-1]-1)*(nums[n-2]-1);
    }
}