package solution011to020;

public class Solution13
{
	public int romanToInt(String s)
	{
		int result = 0;
		int iCount = 0;
		int vCount = 0;
		int xCount = 0;
		int lCount = 0;
		int cCount = 0;
		int dCount = 0;
		int mCount = 0;
		int ivCount = 0;
		int ixCount = 0;
		int xlCount = 0;
		int xcCount = 0;
		int cdCount = 0;
		int cmCount = 0;

		for (int i = 0; i < s.length();i++)
		{
			if (s.charAt(i) == 'I')
			{
				iCount++;
				if (i + 1 != s.length())
				{
					if (s.charAt(i + 1) == 'V')
						ivCount++;
					if (s.charAt(i + 1) == 'X')
						ixCount++;
				}

			} else if (s.charAt(i) == 'V')
			{
				vCount++;
			} else if (s.charAt(i) == 'X')
			{
				xCount++;
				if (i + 1 != s.length())
				{
					if (s.charAt(i + 1) == 'L')
						xlCount++;
					if (s.charAt(i + 1) == 'C')
						xcCount++;
				}
			} else if (s.charAt(i) == 'L')
			{
				lCount++;
			} else if (s.charAt(i) == 'C')
			{
				cCount++;
				if (i + 1 != s.length())
				{
					if (s.charAt(i + 1) == 'D')
						cdCount++;
					if (s.charAt(i + 1) == 'M')
						cmCount++;
				}
			} else if (s.charAt(i) == 'D')
			{
				dCount++;
			} else if (s.charAt(i) == 'M')
			{
				mCount++;
			}
		}
		result = iCount + 5 * vCount + 10 * xCount + 50 * lCount + 100 * cCount
				+ 500 * dCount + 1000 * mCount - 2*ivCount - 2* ixCount - 20*xlCount-20*xcCount
				- 200* cdCount - 200*cmCount;
		return result;
	}

	public static void main(String[] args)
	{
		Solution13 s13 = new Solution13();
		String target = "XL";
		System.out.println(s13.romanToInt(target));
	}

}
