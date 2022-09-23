package checkInclusion_567;

import java.util.HashMap;

public class CheckInclusion {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String s1 = "ab", s2 = "eidbvaooo";
		System.out.println(new Solution().checkInclusion(s1, s2));
	}

}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
    	HashMap<Character, Integer> need = new HashMap<>();
    	HashMap<Character, Integer> window = new HashMap<>();
    	for (int i = 0; i < s1.length(); i++) {
    		//��ȡָ����key��Ӧ�� value ����Ҳ���key �򷵻����õ�Ĭ��ֵ
            need.put(s1.charAt(i),need.getOrDefault(s1.charAt(i),0)+1);
        }
        int left = 0, right = 0;
        int valid = 0;
        while (right < s2.length()) {
            // c �ǽ����봰�ڵ��ַ�
            char c = s2.charAt(right);
            // ���ƴ���
            right++;
            // ���д��������ݵ�һϵ�и���
            if (need.containsKey(c)) {
            	//����ǰchar c �����Ӧ��windowλ��
            	window.put(c,window.getOrDefault(c,0)+1);
                if (window.get(c).equals(need.get(c)))
                    valid++;
            }

            // �ж���ര���Ƿ�Ҫ����
            while (right - left >= s1.length()) {
            	// �������ж��Ƿ��ҵ��˺Ϸ����Ӵ�
                if (valid == need.size())
                    return true;
                // d �ǽ��Ƴ����ڵ��ַ�
                char d = s2.charAt(left);
                // ���ƴ���
                left++;
                // ���д��������ݵ�һϵ�и���
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d)))
                        valid--;
                    window.put(d,window.getOrDefault(d,0)-1);
                }                    
            }
        }
        // ������С�����Ӵ�
    	return false;
    }
}