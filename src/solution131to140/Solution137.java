package solution131to140;

import java.util.HashMap;

public class Solution137
{
	public int singleNumber(int[] nums)
	{
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for (int i = 0; i < nums.length; i++)
		{
			if (hm.containsKey(nums[i]))
			{
				
			} else
			{
				hm.put(nums[i],0);
			}
		}
			return 0;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution137 s137 = new Solution137();
		int[] nums = { 1, 1, 1, 3, 5, 5, 6, 6, 5, 6 };
		System.out.println(s137.singleNumber(nums));
	}

}
