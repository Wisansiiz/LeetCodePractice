package checkPermutation;

import java.util.Arrays;

public class CheckPermutation {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";
        System.out.println(new Solution().CheckPermutation(s1, s2));
    }
}

class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 != n2)
            return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
}