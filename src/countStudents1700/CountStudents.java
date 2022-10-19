package countStudents1700;

public class CountStudents {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 0, 0, 1};
        int[] b = {1, 0, 0, 0, 1, 1};
        System.out.println(new Solution().countStudents(a, b));
    }
}

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] arr = new int[2];
        for (int i : students) arr[i]++;
        for (int i = 0; i < sandwiches.length; i++) {
            if (arr[sandwiches[i]]-- == 0) {
                return sandwiches.length - i;
            }
        }
        return 0;
    }
}