/**
 * 
 */
package numEnclaves_1020;

/**
 * @author W
 *
 */
class Solution {
	// �����������㵺������
	int numEnclaves(int[][] grid) {
	    int res = 0;
	    int m = grid.length, n = grid[0].length;
	    for (int j = 0; j < n; j++) {
	        // �ѿ��ϱߵĵ����͵�
	        dfs(grid, 0, j);
	        // �ѿ��±ߵĵ����͵�
	        dfs(grid, m - 1, j);
	    }
	    for (int i = 0; i < m; i++) {
	        // �ѿ���ߵĵ����͵�
	        dfs(grid, i, 0);
	        // �ѿ��ұߵĵ����͵�
	        dfs(grid, i, n - 1);
	    }
	    // ���� grid
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            if (grid[i][j] == 1) {
	            	// ��û���죬��������������
	                res++;
	            }
	        }
	    }
	    return res;
	}

	// �� (i, j) ��ʼ������֮���ڵ�½�ض���ɺ�ˮ
	int dfs(int[][] grid, int i, int j) {
	    int m = grid.length, n = grid[0].length;
	    if (i < 0 || j < 0 || i >= m || j >= n) {
	        // ���������߽�
	        return 0;
	    }
	    if (grid[i][j] == 0) {
	        // �Ѿ��Ǻ�ˮ��
	        return 0;
	    }
	    // �� (i, j) ��ɺ�ˮ
	    grid[i][j] = 0;
	    
	return 
	    dfs(grid, i + 1, j) +
	    dfs(grid, i, j + 1) +
	    dfs(grid, i - 1, j) +
	    dfs(grid, i, j - 1) + 1;
	}
}
