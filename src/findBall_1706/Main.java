package findBall_1706;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[][] grid = 
//						{{1,1,1,-1,-1},
//		                {1,1,1,-1,-1},
//		                {-1,-1,-1,1,1},
//		                {1,1,1,1,-1},
//		                {-1,-1,-1,-1,-1}};
				{{1,1,1,1,1,1},
				 {-1,-1,-1,-1,-1,-1},
				 {1,1,1,1,1,1},
				 {-1,-1,-1,-1,-1,-1}};
		System.out.print(new Solution2().findBall(grid));
	}
}
