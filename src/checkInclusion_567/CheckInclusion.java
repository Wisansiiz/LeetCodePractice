package checkInclusion_567;

import java.util.HashMap;

public class CheckInclusion {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s1 = "ab", s2 = "eidbvaooo";
		System.out.println(new Solution().checkInclusion(s1, s2));
	}

}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
    	HashMap<Character, Integer> need = new HashMap<>();
    	HashMap<Character, Integer> window = new HashMap<>();
    	for (int i = 0; i < s1.length(); i++) {
    		//获取指定的key对应的 value 如果找不到key 则返回设置的默认值
            need.put(s1.charAt(i),need.getOrDefault(s1.charAt(i),0)+1);
        }
        int left = 0, right = 0;
        int valid = 0;
        while (right < s2.length()) {
            // c 是将移入窗口的字符
            char c = s2.charAt(right);
            // 右移窗口
            right++;
            // 进行窗口内数据的一系列更新
            if (need.containsKey(c)) {
            	//将当前char c 存入对应的window位置
            	window.put(c,window.getOrDefault(c,0)+1);
                if (window.get(c).equals(need.get(c)))
                    valid++;
            }

            // 判断左侧窗口是否要收缩
            while (right - left >= s1.length()) {
            	// 在这里判断是否找到了合法的子串
                if (valid == need.size())
                    return true;
                // d 是将移出窗口的字符
                char d = s2.charAt(left);
                // 左移窗口
                left++;
                // 进行窗口内数据的一系列更新
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d)))
                        valid--;
                    window.put(d,window.getOrDefault(d,0)-1);
                }                    
            }
        }
        // 返回最小覆盖子串
    	return false;
    }
}