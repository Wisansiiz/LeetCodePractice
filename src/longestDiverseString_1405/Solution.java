package longestDiverseString_1405;

/**
 * @author Wisansiiz
 *����ַ����в������κ� 'aaa'��'bbb' �� 'ccc' 
 *�������ַ�����Ϊ�Ӵ�����ô���ַ�������һ���������ַ�������
������������ a��b ��c�����㷵�� ����һ�� ��������ȫ���������ַ��� s��
s ��һ�������ܳ��Ŀ����ַ�����
s �� ��� ��a ����ĸ 'a'��b ����ĸ 'b'��c ����ĸ 'c' ��
s ��ֻ���� 'a'��'b' ��'c' ������ĸ��
����������������ַ��� s ���뷵��һ�����ַ��� ""��
 */
class Solution {
    public String longestDiverseString(int a, int b, int c) {
    	String str = "";
    	while(true)
    	{
    		if(a >= b && a >= c && isdouble(str))
        	{
        		str = adda(str);
        		a--;
        	}
        	else if(b >= a && b >= c && isdouble(str))
        	{
        		str = addb(str);
        		b--;
        	}
        	else if(c >= a && c >= b && isdouble(str))
        	{
        		str = addc(str);
        		c--;
        	}
        	else if(!isdouble(str))
        	{
        		if(a >= b && a <= c)
        		{
        			str = adda(str);
        			a--;
        		}
        		else if(b >= a && b <= c)
        		{
        			str = addb(str);
        			b--;
        		}
        		else
        		{
        			str = addc(str);
        			c--;
        		}
        	}
    		if((a == 0 && b == 0 && !isdouble(str)) || (a == 0 && c == 0 && !isdouble(str) || (c == 0 && b == 0 && !isdouble(str))))
    			break;
    	}
    	return str;
    }
    String adda(String str)
    {
    	str += 'a';
    	return str;
    }
    String addb(String str)
    {
    	str += 'b';
    	return str;
    }
    String addc(String str)
    {
    	str += 'c';
    	return str;
    }
    boolean isdouble(String str)
    {
    	boolean flag = true;
    	if(str.length() > 1 && str.charAt(str.length()-2) == (str.charAt(str.length()-1)))
    		flag = false;
    	return flag;
    }
}
