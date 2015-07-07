package solution121to130;

import java.util.HashSet;

public class Solution128
{
	public int longestConsecutive(int[] nums)
	{
		int result = 0;
		if (nums == null || nums.length == 0)
			return result;
		if (nums.length == 1)
			return 1;
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0; i < nums.length; i++)
		{
			hs.add(nums[i]);
		}

		for (int i = 0; i < nums.length; i++)
		{
			if (hs.contains(nums[i]))
			{
				int next = nums[i] - 1;
				int count = 1;
				hs.remove(nums[i]);
				while (hs.contains(next))
				{
					hs.remove(next);
					next--;
					count++;
				}
				next = nums[i] + 1;
				while (hs.contains(next))
				{
					hs.remove(next);
					next++;
					count++;
				}
				result = Math.max(result, count);
			}
		}
		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution128 s128 = new Solution128();
		int[] nums = { 0,-1 };
		System.out.println(s128.longestConsecutive(nums));
	}

}
