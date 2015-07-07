package solution071to080;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution78
{

	public List<List<Integer>> subsets(int[] nums)
	{
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> tmp = new ArrayList<Integer>();
		Arrays.sort(nums);
		res.add(tmp);
		dfs(res, tmp, nums, 0);
		return res;
	}

	public void dfs(List<List<Integer>> res, List<Integer> tmp, int[] S, int pos)
	{
		for (int i = pos; i <= S.length - 1; i++)
		{
			tmp.add(S[i]);
			res.add(new ArrayList<Integer>(tmp));
			dfs(res, tmp, S, i + 1);
			tmp.remove(tmp.size() - 1);
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution78 s78 = new Solution78();
		int[] nums = { 2, 9, 4, 6 };
		Util.Show.showListListInt(s78.subsets(nums));
	}

}
