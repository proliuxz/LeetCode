package solution051to100;

import java.util.HashMap;

public class Solution96
{

	public int numTrees(int n)
	{
		HashMap<Integer,Integer> result = new HashMap<Integer,Integer>(); 
		result.put(0, 1);
		result.put(1, 1);
		result.put(2, 2);
		if (n<2)
			return result.get(n);
		else
		{
			for(int i = 2 ; i <= n;i++ )
			{
				int temp = 0; 
				for (int j = 0;j<i;j++)
				{
					temp +=result.get(j)*result.get(i-1-j);
				}
				result.put(i, temp);
			}
		}
		return result.get(n);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution96 s96 = new Solution96();
		int n = 3;
		System.out.println(s96.numTrees(n));
	}

}
