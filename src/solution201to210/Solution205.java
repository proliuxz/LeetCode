package solution201to210;

import java.util.HashMap;

public class Solution205
{

	public boolean isIsomorphic(String s, String t)
	{
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		if (s.length() != t.length())
			return false;
		for (int i = 0; i < s.length(); i++)
		{
			if (hm.containsKey(s.charAt(i))==false&&hm.containsValue(t.charAt(i))==false)
			{
				hm.put(s.charAt(i), t.charAt(i));
			} else
			{
				if (hm.get(s.charAt(i))==null)
					return false;
				if (t.charAt(i) != hm.get(s.charAt(i)))
				{
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s = "ab";
		String t = "aa";
		Solution205 s205 = new Solution205();
		System.out.println(s205.isIsomorphic(s, t));
	}

}
