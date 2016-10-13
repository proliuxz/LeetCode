package solution021to030Done;

public class Solution28
{
	public int strStr(String haystack, String needle)
	{
		if ((haystack == null && needle == null)
				|| (haystack.length() == 0 && needle.length() == 0))
		{
			return 0;
		}
		if (haystack == null || haystack.length() == 0)
		{
			return -1;
		}
		if (needle == null || needle.length() == 0)
		{
			return 0;
		}
		if (haystack.length() < needle.length())
		{
			return -1;
		}
		for (int i = 0; i < haystack.length(); ++i)
		{
			if (haystack.charAt(i) != needle.charAt(0))
				continue;
			else if (haystack.length() - i >= needle.length())
			{
				for (int j = 0, k = i; j < needle.length(); ++j, ++k)
				{
					if (haystack.charAt(k) != needle.charAt(j))
						break;
					if (j == needle.length() - 1)
						return i;
				}
			}
			else
			return -1;
		}
		return -1;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution28 s28 = new Solution28();
		String haystack = "a";
		String needle = "a";
		System.out.println(s28.strStr(haystack, needle));
	}

}
