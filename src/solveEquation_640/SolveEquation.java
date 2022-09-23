package solveEquation_640;

public class SolveEquation {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solveEquation(String equation) {
        int factor = 0, val = 0;
        int index = 0, n = equation.length();
        boolean flag = true;
        while (index < n) {
            if (equation.charAt(index) == '=') {
                flag = false;
                index++;
            }
            int number = 0;
            while (index < n && Character.isDigit(equation.charAt(index))) {
                number = number * 10 + equation.charAt(index);
                index++;
            }
            number = number == 0 ? 1 : number;
            if (equation.charAt(index) == 'x') {
                if (flag) factor += number;
                else factor -= number;
            }
            else {
                if (flag) val += number;
                else val -= number;
            }
            index++;
        }
        return "x=" + (val / factor);
    }
}