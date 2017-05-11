package solution101to150;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Solution136
{
	public int singleNumber(int[] nums)
	{
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++)
		{
			if (hm.containsKey(nums[i]))
			{
				hm.remove(nums[i]);
			} else
			{
				hm.put(nums[i], i);
			}
		}
		Iterator iterator = hm.keySet().iterator();
		Set set = hm.entrySet() ;
		java.util.Iterator it = hm.entrySet().iterator();
		java.util.Map.Entry entry = (java.util.Map.Entry)it.next();
		return (int) entry.getKey();
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 2, 2, 3, 3, 4, 5, 4, 5, 7, 9, 7 };
		Solution136 s136 = new Solution136();
		System.out.println(s136.singleNumber(nums));
	}

}
