package solution201to250;

import java.util.ArrayList;
import java.util.List;

public class Solution228
{
	public List<String> summaryRanges(int[] nums)
	{
		if (nums.length == 0 || nums == null)
			return null;
		List result = new ArrayList();

		int left = nums[0];
		int last = nums[0];

		for (int i = 1; i < nums.length; i++)
		{
			if (nums[i] == last + 1)
			{
				if (i == nums.length - 1)
				{
					result.add(left + "->" + nums[i]);
				}
			} else
			{

				if (i == nums.length - 1)
				{
					result.add(nums[i] + "");
					return result;
				}
				if (left == last)
				{
					result.add(left + "");
				} else
				{
					result.add(left + "->" + last);
				}

				left = nums[i];
			}
			last = nums[i];
		}
		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int nums[] = { 0, 1, 2, 4, 5, 7 };
		Solution228 s228 = new Solution228();
		Util.Show.showListString(s228.summaryRanges(nums));
	}

}
