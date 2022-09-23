/**
 * 
 */
package findBall_1706;

/**
 * @author Wisansiiz
 *
 */
class Answer {
    public int[] findBall(int[][] grid) 
    {
        int n = grid[0].length;
        int[] ans = new int[n];
        for (int j = 0; j < n; j++) 
        {
            int col = j;  // ��ĳ�ʼ��
            for (int[] row : grid) 
            {
                int dir = row[col];
                col += dir;  // �ƶ���
                if (col < 0 || col == n || row[col] != dir) 
                {  // �����߻� V ��
                    col = -1;
                    break;
                }
            }
            ans[j] = col;  // col >= 0 Ϊ�ɹ�����ײ�
        }
        return ans;
    }
}
