package solution001to010;


public class Solution6
{
	public String convert(String s, int nRows)
	{
		if (nRows==1)
			return s;
		String[] result = new String[nRows];
		for (int m = 0 ; m < nRows; m ++)
		{
			result[m] = "";
		}
		String sResult ="";
		int j = 0;
		int group = 2*(nRows-1);
		System.out.println(group);
		for (int i = 0 ;i<s.length();i++)
		{
				result[j] = result[j]+s.charAt(i);
				if ((i%group)<(group/2))
				{
					j++;
				}
				else
				{
					j--;
				}
		}
		for(int k = 0; k < nRows; k++)
		{
				sResult = sResult + result[k];
		}
		return sResult;
	}

	public static void main(String[] args)
	{
		Solution6 s6 = new Solution6();
		String s = "ABC";
		int nRows = 1;
		System.out.println(s6.convert(s, nRows));
	}
}
