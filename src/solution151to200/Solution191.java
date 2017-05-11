package solution151to200;

public class Solution191
{
	public int hammingWeight(int n)
	{
		int result = 0;
		String s = Integer.toBinaryString(n);
		for(int i = 0 ;i < s.length(); i++)
		{
			if (s.charAt(i)=='1')
				result++;
		}
		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n = 11;
		Solution191 s191 = new Solution191();
		System.out.println(s191.hammingWeight(n));
	}

}
