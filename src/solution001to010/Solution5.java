package solution001to010;

public class Solution5
{
	public String longestPalindrome(String s)
	{
		int result = 0;
		String sResult = new String();
		for (int i = 0; i<s.length() ; i++)
		{
			int wide = 0;
			
			while((i-wide)>=0&&(i+wide)<s.length()&&(s.charAt(i-wide)==s.charAt(i+wide)))
			{	
				wide++;
			}
			wide--;
			if (result < (2*wide+1))
			{
				result = 2*wide+1;
				sResult = s.substring(i-wide,i+wide+1);
			}
			
			wide = 0;
			while((i-wide)>=0&&(i+wide+1)<s.length()&&(s.charAt(i-wide)==s.charAt(i+wide+1)&&(s.charAt(i)==s.charAt(i+1))))
			{	
				wide++;
			}
			wide--;
			if (result < (2*(wide+1)))
			{
				result = 2*(wide+1);
				sResult = s.substring(i-wide,i+wide+2);
			}
		}
		return sResult;
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution5 s5 = new Solution5();
		String s = "bananas";
		System.out.println(s5.longestPalindrome(s));
	}

}
