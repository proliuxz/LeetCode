package solution011to020;

import java.util.ArrayList;
import java.util.List;

public class Solution17
{

	public List<String> letterCombinations(String digits)
	{
		List<String> result = new ArrayList<String>();
		for (int i = 0 ; i < digits.length();i++)
		{
			int x = Integer.valueOf(digits.charAt(i)+"");
			System.out.println(x);
			if (x>9||x<2)
				return new ArrayList<String>();
			else
				result = addOne(result, x);
		}
		return result;
	}
	
	public List<String> addOne(List<String> nowString,int x)
	{
		List<String> result = new ArrayList<String>();
		String tran[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		if (nowString.size()==0)
		{
			for (int k = 0 ; k < tran[x].length();k++)
			{
				result.add(tran[x].charAt(k)+"");
			}
		}
		for (int i = 0 ; i < nowString.size();i++)
		{
			for(int j = 0; j < tran[x].length();j++)
			{
				result.add(nowString.get(i)+tran[x].charAt(j));
			}
		}
		return result;
	}

	public static void main(String[] args)
	{
		Solution17 s17 = new Solution17();
		String digits = "23";
		System.out.println(s17.letterCombinations(digits).size());
	}

}
