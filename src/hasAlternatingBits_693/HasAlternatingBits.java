package hasAlternatingBits_693;

public class HasAlternatingBits {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int n = 7;
		System.out.println(new Solution().hasAlternatingBits(n));
	}

}

class Solution {
	public boolean hasAlternatingBits(int n) {
		int tem = n % 2;
		n = n / 2;
		while(tem != n % 2) {
			tem = n % 2;
			n = n / 2;
		}
		if(n <= 0)
			return true;
		return false;
	}
}