package findLUSlength_521;

public class FindLUSlength {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String a = "abc", b = "abc";
		System.out.print(new Solution().findLUSlength(a, b));
	}

}
class Solution {
    public int findLUSlength(String a, String b) {
    	if(!a.equals(b))
    		return a.length() > b.length() ? a.length():b.length();
    	return -1;
    }
}