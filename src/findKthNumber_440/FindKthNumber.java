package findKthNumber_440;

public class FindKthNumber {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 1000, k = 15;
		System.out.println(new Solution().findKthNumber(n, k));
	}

}

class Solution {
	static int sum = 0;

	public int findKthNumber(int n, int k) {
		int len = (n + "").length();
		sum += len;
		if (k <= len)
			return (int) Math.pow(10, k - 1);
		while (true) {
			int[] arr = null;
			if (k > sum) {
				arr = get(n);
				for (int i = 0; i < 9; i++) {
					if (arr[i] != 0)
						sum++;
				}
			}
			if (n / 10 > 0)
				n /= 10;
			else {
				n++;
				n = (int) (n*Math.pow(10, len - 1));
			}
			boolean flag = false;
			if (k <= sum) {
				int i = 0;
				for (; i < 9; i++) {
					sum--;
					if (sum == k)
						break;
				}
				return arr[8 - (i + 1)];
			}
			if (flag)
				break;
		}
		return 0;
	}

	int[] get(int n) {
		int len = (n + "").length();
		int[] arr = new int[9];
		for (int i = 1; i <= 9; i++) {
			int a = (int) Math.pow(10, len - 1) + i;
			if (a < 1000)
				arr[i - 1] = a;
		}
		return arr;
	}
}