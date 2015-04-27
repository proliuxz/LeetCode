package solution21to30;

import java.util.ArrayList;
import java.util.List;

public class Solution22
{
	public List<String> generateParenthesis(int n)
	{
		if (n <= 0)
			return null;
		ArrayList<String> list = new ArrayList<String>();
		String str = new String();
		dfs(list, str, n, n);
		return list;
	}

	private void dfs(ArrayList<String> list, String str, int left, int right)
	{
		if (left > right)
			return;
		if (left == 0 && right == 0)
		{
			list.add(str);
		}
		if (left > 0)
			dfs(list, str + "(", left - 1, right);
		if (right > 0)
			dfs(list, str + ")", left, right - 1);
	}

	public static void main(String[] args)
	{
		Solution22 s22 = new Solution22();
		int n = 3;
		List<String> result = s22.generateParenthesis(n);
		for (int i = 0; i < result.size(); i++)
		{
			System.out.println(result.get(i));
		}
	}

}
