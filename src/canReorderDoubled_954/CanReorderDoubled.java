package canReorderDoubled_954;

import java.util.*;

public class CanReorderDoubled {
    public static void main(String[] args) {
        int[] arr = {4,-2,2,-4};
        System.out.println(new Solution2().canReorderDoubled(arr));
    }
}

class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Map<Integer, Integer> ans = new HashMap<>();
        for (int i : arr)
            ans.put(i, ans.getOrDefault(i, 0) + 1);
        if (ans.getOrDefault(0, 0) % 2 != 0)
            return false;
        List<Integer> vals = new ArrayList<Integer>();
        for (int x : ans.keySet()) {
            vals.add(x);
        }
        vals.sort((a, b) -> Math.abs(a) - Math.abs(b));

        for (int x : vals) {
            // 无法找到足够的 2x 与 x 配对
            if (ans.getOrDefault(2 * x, 0) < ans.get(x)) {
                return false;
            }
            ans.put(2 * x, ans.getOrDefault(2 * x, 0) - ans.get(x));
        }
        return true;
    }
}
//未完成
class Solution2 {
    public boolean canReorderDoubled(int[] arr) {
        Map<Integer, Integer> ans = new HashMap<>();
        for (int x : arr)
            ans.put(x, ans.getOrDefault(x, 0) + 1);
        if (ans.getOrDefault(0, 0) % 2 != 0)
            return false;
        for(int x : ans.keySet()){
            if (x == 0)
                continue;
            boolean flag = false;
            for(int y : ans.keySet()){
                if (x == y) continue;
                if (y == 0) continue;
                if(x == y * 2 && ans.get(x) > 0 && ans.get(y) > 0) {
                    ans.put(x, ans.getOrDefault(y, 0) - 1);
                    ans.put(y, ans.getOrDefault(y, 0) - 1);
                    flag = true;
                    break;
                }
                else if(2 * x == y && ans.get(x) > 0 && ans.get(y) > 0){
                    ans.put(x, ans.getOrDefault(y, 0) - 1);
                    ans.put(y, ans.getOrDefault(y, 0) - 1);
                    flag = true;
                    break;
                }
                if(ans.get(y) < 0)
                    return false;
            }
            if (!flag)
                return false;
        }
        return true;
    }
}