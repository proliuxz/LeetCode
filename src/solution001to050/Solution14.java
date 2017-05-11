package solution001to050;

public class Solution14
{
	public String longestCommonPrefix(String[] strs)
	{
		
		boolean flag = true;
		String result = "";
		int j = 0;
		char origin = ' ';
		int len = 2147483647;
		
		if (strs.length==0)
			return result;
		
		if (strs.length==1)
			return strs[0];
		
		for (int k = 0 ; k < strs.length;k++)
		{
			if(strs[k].length()==0)
				return result;
			len = Math.min(len, strs[k].length());
		}
		
			for (int i = 0 ; i<len&&flag;i++)
			{
				origin = strs[0].charAt(i);
				for (j = 1 ; j < strs.length;j++)
				{
					if (strs[j].charAt(i)!=origin)
						flag = false;
				}
				if (flag==true)
				{
					result = result + origin;
				}
			}
		return result;
	}

	public static void main(String[] args)
	{
		Solution14 s14 = new Solution14();
		String[] strs = new String[2];
		strs[0] = "aa";
		strs[1] = "aa";
		System.out.println(s14.longestCommonPrefix(strs));
	}

}
