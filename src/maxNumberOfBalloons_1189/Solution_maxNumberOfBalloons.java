/**
 * 
 */
package maxNumberOfBalloons_1189;

/**
 * @author W
 *
 */
class Solution_maxNumberOfBalloons {
	public int maxNumberOfBalloons(String text) {
		char[] arr = "balloon".toCharArray();
		char[] text2 = text.toCharArray();
		int n = arr.length;
		int m = text2.length;
		boolean flag = false;
		int i = 0;
		int res = 0;
		while (true) 
		{	//ѭ��balloon�е���ĸ
			for (i = 0; i < n; i++) 
			{
				for (int j = 0; j < m; j++) 
				{//�����ַ������뵥��ƥ�����ĸ
					if (arr[i] == text2[j]) 
					{
						flag = true;
						text2[j] = '0';
						break;//�ҵ����˳�
					}
					//��ĩβ����û�ҵ�
					else if (j == m - 1) 
					{
						flag = false;
						break;
					}
				}
				if (!flag)
					break;
			}
			//����һ�����
			if (i == n)
				res++;
			if (!flag)
				break;
		}
		return res;
	}
}
