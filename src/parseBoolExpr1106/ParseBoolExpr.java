package parseBoolExpr1106;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ParseBoolExpr {
    public static void main(String[] args) {
        System.out.println(new Solution().parseBoolExpr("&(t,f)"));
    }
}

class Solution {
    public boolean parseBoolExpr(String expression) {
        //一个栈存放布尔，一个栈存放运算符
        Deque<Character> bool = new ArrayDeque<>(), operator = new ArrayDeque<>();
        int n = expression.length();
        for (char c : expression.toCharArray()) {
            if (c == ',') continue;
            if (c == 'f' || c == 't') bool.push(c);
            if (c == '&' || c == '|' || c == '!') operator.push(c);
            //一个“(”一个标识符“-”
            if (c == '(') bool.push('-');
            if (c == ')') {
                char op = operator.pop();
                if (op == '&') {
                    boolean ans = true;
                    while (!bool.isEmpty() && bool.peek() != '-') {
                        char b = bool.pop();
                        ans = ans && (b != 'f');
                    }
                    //将标识符“-”移除
                    if (!bool.isEmpty())
                        bool.pop();
                    bool.push(!ans ? 'f' : 't');
                }
                if (op == '|') {
                    boolean ans = false;
                    while (!bool.isEmpty() && bool.peek() != '-') {
                        char b = bool.pop();
                        ans = ans || (b != 'f');
                    }
                    if (!bool.isEmpty())
                        bool.pop();
                    bool.push(!ans ? 'f' : 't');
                }
                if (op == '!') {
                    if (!bool.isEmpty() && bool.peek() != '-') {
                        char b = bool.pop();
                        if (!bool.isEmpty())
                            bool.pop();
                        bool.push((b != 'f') ? 'f' : 't');
                    }
                }
            }
        }
        return bool.pop() != 'f';
    }
}