/**
 * 
 */
package findBall_1706;


/**
 * @author Wisansiiz
 *��һ����СΪ m x n �Ķ�ά���� grid ��ʾһ�����ӡ�
 *���� n �������ӵĶ����͵ײ����ǿ��ŵġ�

�����е�ÿ����Ԫ����һ���Խ��ߵ��壬�����Ԫ��������ǣ�
���Խ������������Ҳࡣ

�������Ҳ�ĵ��������ϽǺ����½ǣ����������� 1 ��ʾ��
���������ĵ��������ϽǺ����½ǣ����������� -1 ��ʾ��
������ÿһ�еĶ��˸���һ����ÿ���򶼿��ܿ�����������
�ײ��������������ǡ�ÿ������鵲��֮��� "V" ��ͼ����
���߱�һ�鵲�������ӵ�����һ����ϣ��ͻῨס��

����һ����СΪ n ������ answer ������ answer[i] 
������ڶ����ĵ� i �к�ӵײ�����������һ�ж�Ӧ���±꣬
������ں�����򷵻� -1 ��
 */
/*ִ�н����
ͨ��
��ʾ����
��ӱ�ע

ִ����ʱ��
0 ms
, ������ Java �ύ�л�����
100.00%
���û�
�ڴ����ģ�
42.8 MB
, ������ Java �ύ�л�����
11.45%
���û�
ͨ������������
63 / 63
 * */
class Solution2 {
    public int[] findBall(int[][] grid) {
    	int n = grid[0].length;
    	int[] res = new int [n];
    	for(int i = 0; i < n; i++)
    	{
    		int distance = grid[0][i];
    			res[i] = iscan(distance, grid, 0, i);
    	}
    	return res;
    }
    int k = 0;
    int iscan(int distance, int[][] grid, int m, int n)
    {	
		if(distance == 1)
		{
			if(n + 1 < grid[0].length)
			{
				if(grid[m][++n] == distance)
				{
					if(m + 1 < grid.length)
					{	
						int d = grid[++m][n];
						iscan(d, grid, m, n);
					}
					else
						k = n;
				}
				else
					k = -1;
			}
			else
				k = -1;
		}
		else
		{
			if(n - 1 >= 0)
			{
				if(grid[m][--n] == distance)
				{	if(m + 1< grid.length)
					{
						int d = grid[++m][n];
						iscan(d, grid, m, n);
					}
					else
						k = n;
				}
				else
					k = -1;
			}
			else
				k = -1;
		}
		return k;
    }
}
