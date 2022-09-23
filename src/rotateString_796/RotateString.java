package rotateString_796;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(new Solution().rotateString(s, goal));
    }
}

class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if (n != goal.length())
            return false;
        return (s + s).contains(goal);
    }
}