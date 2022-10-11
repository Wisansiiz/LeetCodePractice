package areAlmostEqual_1790;

public class AreAlmostEqual {
    public static void main(String[] args) {
        System.out.println(new Solution().areAlmostEqual("blnmk", "blank"));
    }
}
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int diff = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)){
                diff++;
                sb.append(s1.charAt(i)).append(s2.charAt(i));
            }
        }
        if (diff == 2){
            return sb.charAt(0) == sb.charAt(3) && sb.charAt(1) == sb.charAt(2);
        }
        else return diff == 0;
    }
}