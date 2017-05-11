package solution051to100;

import java.util.HashMap;

public class Solution70
{
	public int climbStairs(int n)
	{
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		hm.put(0, 0);
		hm.put(1, 1);
		hm.put(2, 2);
		for (int i = 3;i<= n;i++)
		{
			hm.put(i,hm.get(i-1)+hm.get(i-2));
		}
		return hm.get(n);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution70 s70 = new Solution70();
		int x = 5;
		System.out.println(s70.climbStairs(x));
	}

}
