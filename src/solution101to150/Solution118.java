package solution101to150;

import java.util.ArrayList;
import java.util.List;

public class Solution118
{
	public List<List<Integer>> generate(int numRows)
	{
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> first = new ArrayList<Integer>();
		if (numRows==0)
			return result;
		first.add(1);
		result.add(first);
		if (numRows==1)
			return result;
		List<Integer> last = first;
		for (int i = 2 ; i <=numRows;i++)
		{
			List<Integer> now = calcNextLevel(last);
			result.add(now);
			last = now;
		}
		return result;
	}
	public List<Integer> calcNextLevel(List<Integer> lastLevel)
	{
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i<= lastLevel.size();i++)
		{
			if (i==0||i==lastLevel.size())
				result.add(1);
			else
			{
				result.add(lastLevel.get(i-1)+lastLevel.get(i));
			}
		}
		return result;
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int numRows = 5;
		Solution118 s118 = new Solution118();
		Util.Show.showListListInt(s118.generate(numRows));
	}

}
