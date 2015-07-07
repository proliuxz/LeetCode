package solution081to090;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution90
{
	public List<List<Integer>> subsetsWithDup(int[] nums)
	{
		if (nums == null)
			return null;

		Arrays.sort(nums);

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<List<Integer>> prev = new ArrayList<List<Integer>>();

		for (int i = nums.length - 1; i >= 0; i--)
		{

			if (i == nums.length - 1 || nums[i] != nums[i + 1]
					|| prev.size() == 0)
			{
				prev = new ArrayList<List<Integer>>();
				for (int j = 0; j < result.size(); j++)
				{
					prev.add(new ArrayList<Integer>(result.get(j)));
				}
			}

			for (List<Integer> temp : prev)
			{
				temp.add(0, nums[i]);
			}

			if (i == nums.length - 1 || nums[i] != nums[i + 1])
			{
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(nums[i]);
				prev.add(temp);
			}

			for (List<Integer> temp : prev)
			{
				result.add(new ArrayList<Integer>(temp));
			}
		}

		result.add(new ArrayList<Integer>());

		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution90 s90 = new Solution90();
		int[] nums = { 1, 2, 2 };
		Util.Show.showListListInt(s90.subsetsWithDup(nums));
	}

}
