package duplicateZeros_1089;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,1,0,0};
                //{1,0,2,3,0,4,5,0};
        new Solution().duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
class Solution {
    public void duplicateZeros(int[] arr) {
        for (int j=0;j<arr.length;j++){
            if (arr[j] == 0){
                for (int i = arr.length-1; i>j; i--){
                    arr[i] = arr[i-1];
                }
                arr[++j] = 0;
            }
        }
    }
}