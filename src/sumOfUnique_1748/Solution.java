package sumOfUnique_1748;

class Solution {
	/*����һ���������� nums ��������ΨһԪ������Щֻ����
	 * ǡ��һ�� ��Ԫ�ء�
	���㷵�� nums ��ΨһԪ�ص� �� ��
	ʾ�� 1��
	���룺nums = [1,2,3,2]
	�����4
	���ͣ�ΨһԪ��Ϊ [1,3] ����Ϊ 4 ��*/
    public int sumOfUnique(int[] nums) {
    	int sum = 0;
    	int n = nums.length;
    	for(int i = 0; i < n; i++)
    	{
    		int count = -1;
    		for(int j = 0; j < n; j++)
    		{
    			if(nums[i] == nums[j])
    				count ++;
    		}
    		if(count == 0 )
    			sum += nums[i];
    	}
    	//ʱ�临�Ӷ�ΪO(n2),���ں�ʱ
    	return sum;
    }
}