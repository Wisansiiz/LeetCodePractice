package reformat_1417;

public class Reformat {
    public static void main(String[] args) {
        String s = "covid202123";
        System.out.println(new Solution().reformat(s));
    }
}

class Solution {
    public String reformat(String s) {
        int nums = 0, words = 0;
        char[] num = new char[501], word = new char[501];
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                word[words] = c;
                words++;
            } else {
                num[nums] = c;
                nums++;
            }
        }
        StringBuilder str = new StringBuilder();
        if (words - nums == 1) {
            for (int i = 0; i < words; i++) {
                str.append(word[i]).append(num[i]);
            }
            return str.substring(0, str.length()-1);
        }
        if (words == nums) {
            for (int i = 0; i < words; i++) {
                str.append(word[i]).append(num[i]);
            }
            return str.toString();
        }
        if (nums - words == 1) {
            for (int i = 0; i < nums; i++) {
                str.append(num[i]).append(word[i]);
            }
            return str.substring(0, str.length()-1);
        }
        return "";
    }
}