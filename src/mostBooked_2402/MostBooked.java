package mostBooked_2402;

import java.util.Arrays;
import java.util.Comparator;

public class MostBooked {
    public static void main(String[] args) {
        int n = 3;
        int[][] meetings = //{{0, 10}, {1, 9}, {2, 8}, {3, 7}, {4, 6}};
                //{{18, 19}, {3, 12}, {17, 19}, {2, 13}, {7, 10}};
                //{{1, 20}, {2, 10}, {3, 5}, {4, 9}, {6, 8}};
                {{10, 11}, {13, 15}, {9, 19}, {0, 12}, {12, 20}};
        System.out.println(new Solution().mostBooked(n, meetings));
    }
}

class Solution {
    public int mostBooked(int n, int[][] meetings) {
        //自定义排序，按开始会议时间从小到大排
        Arrays.sort(meetings, Comparator.comparingInt(o -> o[0]));
        //建立一个二维数组前面放会议时间，后面放举行次数
        int[][] arr = new int[n][2];
        int t = 0;
        for (int i = 0; i < meetings.length; i++) {
            //获取前一场会议的结束时间最小值
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                min = Math.min(min, arr[j][0]);
            }
            int j = 0;
            for (; j < n; j++) {
                if (arr[j][0] <= meetings[i][0]) {
                    arr[j][0] = meetings[i][1];
                    arr[j][1]++;
                    break;
                }
            }
            //延期举行会议
            if (j == n) {
                int num = meetings[i][1] - meetings[i][0];
                meetings[i][0] = min;
                meetings[i][1] = meetings[i][0] + num;
                i--;
            }
        }
        //取最大值
        int max = 0, maxnum = 0;
        for (int i = 0; i < n; i++) {
            if (maxnum < arr[i][1]){
                maxnum = arr[i][1];
                max = i;
            }
        }
        return max;
    }
}