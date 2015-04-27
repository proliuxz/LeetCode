package solution1to10;

import java.util.Arrays;

public class Solution8
{
	public int myAtoi(String str)
	{
		if (str == null || str.length() == 0)
			return 0;
		int minCount = 0;
		int plusCount = 0;
		String sResult ="";
		String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
		for (int i = 0; i < str.length(); i++)
		{
			if (sResult.length()==0&&(minCount+plusCount)<0&&str.charAt(i)=='0')
			{
				
			}
			else if ((sResult.length()!=0||(minCount+plusCount!=0))&&str.charAt(i)==' ')
			{
				break;
			}
			else if (str.charAt(i)==' ')
			{
				
			}
			else if (str.charAt(i)=='-')
			{
				minCount++;
			}
			else if (str.charAt(i)=='+')
			{
				plusCount++;
			}
			else if (BinarySearch(numbers,String.valueOf(str.charAt(i))))
			{
				sResult = sResult + str.charAt(i);
			}
			else
			{
				break;
			}
		}
		if (sResult == null || sResult.length() == 0)
			return 0;
		if ((minCount+plusCount)>1)
			return 0 ;
		double dResult = Double.valueOf(sResult);
		
		if (minCount%2==0)
		{
			if (dResult>2147483647)
				return 2147483647;
			else 
				return (int) dResult;
		}
		else
		{
			if (0-dResult<-2147483648)
				return -2147483648;
			else 
				return (int) (0-dResult);
		}
	}

	public static boolean BinarySearch(String[] arr, String targetValue)
	{
		int a = Arrays.binarySearch(arr, targetValue);
		if (a >= 0)
		{
			return true;
		} else
		{
			return false;
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution8 s8 = new Solution8();
		String str = "   - 321";
		System.out.println(s8.myAtoi(str));
	}

}
