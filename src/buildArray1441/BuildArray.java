package buildArray1441;

import java.util.ArrayList;
import java.util.List;

public class BuildArray {
    public static void main(String[] args) {
        int[] a = {1, 3};
        System.out.println(new Solution().buildArray(a, 3));
    }
}

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int m = target.length;
        for (int i = 1, j = 0; i <= n && j < m; i++) {
            list.add("Push");
            if (target[j] == i) j++;
            else list.add("Pop");
        }
        return list;
    }
}