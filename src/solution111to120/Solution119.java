package solution111to120;

import java.util.ArrayList;
import java.util.List;

public class Solution119
{
	public List<Integer> getRow(int rowIndex)
	{
		List<Integer> result = new ArrayList<Integer>();
		result.add(1);
		if (rowIndex==0)
			return result;
		int count = 0;
		while(count<rowIndex)
		{
			result = calcNextLevel(result);
			count++;
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
		int numRows = 3;
		Solution119 s119 = new Solution119();
		Util.Show.showListInt(s119.getRow(numRows));
	}

}
