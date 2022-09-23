package minMutation_433;

import java.util.*;

public class MinMutation {
    public static void main(String[] args) {
        String start = "AACCGGTT", end = "AACCGGTA";
        String[] bank = {"AACCGGTA","AACCGCTA"};
        System.out.println(new Solution().minMutation(start,end,bank));
    }
}
class Solution {
    public int minMutation(String start, String end, String[] bank) {
        Queue<String> queue = new ArrayDeque<>();
        Set<String> set = new HashSet<>();
        char [] chars = {'A', 'T', 'C', 'G'};
        for (String s : bank){
            set.add(s);
        }
        if (!set.contains(end))
            return -1;
        if (start.equals(end))
            return 0;
        Set<String> stringSet = new HashSet<>();
        queue.offer(start);
        stringSet.add(start);
        int step = 1;
        //这里有点没看懂
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int j = 0; j < len; j++){
                String curr = queue.poll();
                //这里差不多写得出来
                for (int i = 0; i < 8; i++){
                    for (char c : chars){
                        if (curr.charAt(i) != c){
                            StringBuilder stringBuilder = new StringBuilder(curr);
                            stringBuilder.setCharAt(i, c);
                            String s = stringBuilder.toString();
                            //这里差点
                            if (set.contains(s) && !stringSet.contains(s)){
                                if (s.equals(end)){
                                    return step;
                                }
                                queue.offer(s);
                                stringSet.add(s);
                            }
                        }
                    }
                }
            }
            step++;
        }
        return -1;
    }
}