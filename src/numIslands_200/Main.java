package numIslands_200;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		char[][] grid = {
				{'1','1','0','1','1'},
				{'1','0','0','0','0'},
				{'0','0','0','0','1'},
				{'1','1','0','1','1'}
				};
		System.out.println(new Solution().numIslands(grid));
	}

}
