package solution211to220;

import java.util.HashMap;

public class Solution219
{

	public boolean containsNearbyDuplicate(int[] nums, int k)
	{
		if (nums.length<2||nums==null)
			return false;
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0 ; i < nums.length ; i ++)
		{
			if (!hm.containsKey(nums[i]))
			{
				hm.put(nums[i], i);
			}
			else
			{
				int j = hm.get(nums[i]);
				if (i-j<=k)
					return true;
				hm.remove(nums[i]);
				hm.put(nums[i], i);
			}
		}
		return false;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] nums = {1,0,1,1};
		int k = 1;
		Solution219 s219 = new Solution219();
		System.out.println(s219.containsNearbyDuplicate(nums, k));
	}

}
