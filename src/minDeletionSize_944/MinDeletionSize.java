package minDeletionSize_944;

public class MinDeletionSize {
    public static void main(String[] args) {
        String [] strings = {"egguij","gjsnnk","lstgon","ztzrqv"};
        System.out.println(new Solution().minDeletionSize(strings));
    }
}
class Solution {
    public int minDeletionSize(String[] strs) {
        int ans = 0;
        int len = strs.length;
        int m = strs[0].length();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < len - 1; j++){
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}