package solution201to250;

import java.util.HashSet;

public class Solution217
{
	public boolean containsDuplicate(int[] nums)
	{
		if (nums==null||nums.length==0)
			return false;
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i = 0 ; i < nums.length;i++)
		{
			if (!hs.add(nums[i]))
				return true;
		}
		return false;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution217 s217 = new Solution217();
		int[] nums = {1,4,6,1,5,687,278,67,6872,4,6,67,678,76};
		System.out.println(s217.containsDuplicate(nums));
	}

}
