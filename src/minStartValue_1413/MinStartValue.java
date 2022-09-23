package minStartValue_1413;

public class MinStartValue {
    public static void main(String[] args) {
        int[] nums = {-3,2,-3,4,2};
        System.out.println(new Solution().minStartValue(nums));
    }
}
class Solution {
    public int  minStartValue(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i : nums){
            sum += i;
            if (sum < min){
                min = sum;
            }
        }
        if (min < 0) return Math.abs(min)+1;
        else return 1;
    }
}