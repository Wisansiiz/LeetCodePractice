package countHighestScoreNodes_2049;

import java.util.*;

public class CountHighestScoreNodes {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] parents = {-1,2,0,2,0};
		System.out.print(new Solution().countHighestScoreNodes(parents));
	}

}

class Solution {
	long maxScore = 0;
	int cnt = 0;
	int n;
	List<Integer>[] children;

	public int countHighestScoreNodes(int[] parents) {
		n = parents.length;
		children = new List[n];
		for (int i = 0; i < n; i++) {
			children[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < n; i++) {
			int p = parents[i];
			if (p != -1) {
				children[p].add(i);
			}
		}
		dfs(0);
		return cnt;
	}

	public int dfs(int node) {
		long score = 1;
		int size = n - 1;
		for (int c : children[node]) {
			int t = dfs(c);
			score *= t;
			size -= t;
		}
		if (node != 0) {
			score *= size;
		}
		if (score == maxScore) {
			cnt++;
		} else if (score > maxScore) {
			maxScore = score;
			cnt = 1;
		}
		return n - size;
	}
}