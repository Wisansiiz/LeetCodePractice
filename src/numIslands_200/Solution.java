package numIslands_200;

class Solution {
	// �����������㵺������
	int numIslands(char[][] grid) {
	    int res = 0;
	    int m = grid.length, n = grid[0].length;
	    // ���� grid
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            if (grid[i][j] == '1') {
	                // ÿ����һ�����죬����������һ
	                res++;
	                // Ȼ��ʹ�� DFS ����������
	                dfs(grid, i, j);
	            }
	        }
	    }
	    return res;
	}

	// �� (i, j) ��ʼ������֮���ڵ�½�ض���ɺ�ˮ
	void dfs(char[][] grid, int i, int j) {
	    int m = grid.length, n = grid[0].length;
	    if (i < 0 || j < 0 || i >= m || j >= n) {
	        // ���������߽�
	        return;
	    }
	    if (grid[i][j] == '0') {
	        // �Ѿ��Ǻ�ˮ��
	        return;
	    }
	    // �� (i, j) ��ɺ�ˮ
	    grid[i][j] = '0';
	    // ��û�������ҵ�½��
	    dfs(grid, i + 1, j);
	    dfs(grid, i, j + 1);
	    dfs(grid, i - 1, j);
	    dfs(grid, i, j - 1);
	}
}
