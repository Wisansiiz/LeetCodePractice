/**
 * 
 */
package maximumDifference;

/**
 * @author Wisansiiz
 *����һ���±�� 0 ��ʼ���������� nums ��������Ĵ�СΪ n ��
 *������� nums[j] - nums[i] ����õ� ����ֵ ��
 *���� 0 <= i < j < n �� nums[i] < nums[j] ��
 *
���� ����ֵ ���������������Ҫ��� i �� j ������ -1 ��

 */
class Solution {
    public int maximumDifference(int[] nums) {
    	int ans = -1;
    	int n = nums.length, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    	for(int i = 0; i < n; i++)
    	{
    		min = nums[i];
    		for(int j = i + 1; j < n; j++)
    		{
    			max = nums[j];
    			if(min < max && (max - min) > ans)
    			{
    				ans = max - min;
    			}
    		}
    	}
		return ans;
    }
}
