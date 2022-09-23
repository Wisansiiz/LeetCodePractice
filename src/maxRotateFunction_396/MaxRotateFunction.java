package maxRotateFunction_396;

import java.util.Arrays;

public class MaxRotateFunction {
    public static void main(String[] args) {
        int [] nums = {4,3,2,6};
        System.out.println(new Solution().maxRotateFunction(nums));
    }
}
class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += nums[i] * i;
        }
        int all = Arrays.stream(nums).sum();
        int ans = sum;
        for (int i = n - 1; i > 0; i--){
            sum += all - nums[i] * n;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}