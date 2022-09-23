package minMoves2_462;

import java.util.Arrays;

public class MinMoves2 {
    public static void main(String[] args) {
        int[] nums = {1,2,9,10};
        System.out.println(new Solution().minMoves2(nums));
    }
}
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length/2];
        int ans = 0;
        for (int num : nums) {
            ans += Math.abs(num - mid);
        }
        return ans;
    }
}