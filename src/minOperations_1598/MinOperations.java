package minOperations_1598;

import java.util.Stack;

public class MinOperations {
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        System.out.println(new Solution().minOperations(logs));
    }
}
class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for (String s : logs){
            if (s.equals("../")){
                if (stack.size()!=0)
                    stack.pop();
                continue;
            }
            if (s.equals("./")){
                continue;
            }
            stack.push(s);
        }
        return stack.size();
    }
}