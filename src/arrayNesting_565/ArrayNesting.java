package arrayNesting_565;

import java.util.HashSet;
import java.util.Set;

public class ArrayNesting {
    public static void main(String[] args) {
        int[] nums = {5, 4, 0, 3, 1, 6, 2};
        System.out.println(new Solution().arrayNesting(nums));
    }
}

class Solution {
    public int arrayNesting(int[] nums) {
        int n = nums.length, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            if (nums[i] != -1)
                max = Math.max(search(nums, i, set), max);
        }
        return max;
    }

    int search(int[] nums, int i, Set<Integer> set) {
        int tem = nums[i];
        if (!set.contains(tem)&&tem != -1) {
            set.add(tem);
            nums[i] = -1;
            search(nums, tem, set);
        }
        return set.size();
    }
}
class Solution2 {
    public int arrayNesting(int[] nums) {
        int n = nums.length, ans = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0, num = i;
            while (nums[num] != -1){
                cnt ++;
                int tem = num;
                num = nums[tem];
                nums[tem] = -1;
            }
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}