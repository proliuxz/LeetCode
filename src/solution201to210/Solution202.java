package solution201to210;

import java.util.HashSet;

public class Solution202
{
	public boolean isHappy(int n)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		if (n < 1)
			return false;
		int sum = 0;
		while(hs.add(sum))
		{
			String s = Integer.toString(n);
			sum = getSum(s);
			n = sum;
		}
		if (sum==1)
			return true;
		return false;
	}

	public int getSum(String s)
	{
		double sum = 0;
		for (int i = 0; i < s.length(); i++)
		{
			sum = (sum + Math.pow(s.charAt(i) - 48, 2));
		}
		return (int) sum;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution202 s202 = new Solution202();
		int n = 19;
		System.out.println(s202.isHappy(n));
	}

}
