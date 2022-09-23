package maxScore_1422;

public class MaxScore {
    public static void main(String[] args) {
        String s = "011101";
        System.out.println(new Solution().maxScore(s));
    }
}
class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int index = 1, max = Integer.MIN_VALUE;
        while(index < n){
            String left = s.substring(0,index);
            String right = s.substring(index,n);
            int lnum = 0, rnum = 0;
            for (char c : left.toCharArray())
                if (c == '0') lnum++;
            for (char c : right.toCharArray())
                if (c == '1') rnum++;
            max = Math.max(max,lnum+rnum);
            index++;
        }
        return max;
    }
}
class Solution2{
    public int maxScore(String s){
        return 0;
    }
}