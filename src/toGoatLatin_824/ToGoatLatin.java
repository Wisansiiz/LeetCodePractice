package toGoatLatin_824;

import java.util.ArrayDeque;
import java.util.Queue;

public class ToGoatLatin {
    public static void main(String[] args) {
        String sentence = "I speak Goat Latin";
        System.out.println(new Solution().toGoatLatin(sentence));
    }
}

class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        Queue<String> queue = new ArrayDeque<>();
        for (char c : sentence.toCharArray()) {
            if (c != ' ') {
                stringBuilder.append(c);
            } else {
                queue.offer(stringBuilder.toString());
                stringBuilder = new StringBuilder();
            }
        }
        queue.offer(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        StringBuilder last = new StringBuilder("a");
        while (queue.size() > 0) {
            String s = queue.poll();
            assert s != null;
            char c = s.charAt(0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                stringBuilder.append(s);
            else {
                s += c;
                stringBuilder.append(s.substring(1));
            }
            stringBuilder.append("ma").append(last);
            last.append("a");
            if (queue.size() > 0)
                stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}