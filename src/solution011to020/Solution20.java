package solution011to020;

import java.util.Stack;

public class Solution20
{
	public boolean isValid(String s)
	{
		Stack<Character> sk = new Stack<Character>();
		
		if (s.length() % 2 == 1)
			return false;
		
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == '('||s.charAt(i) == '['||s.charAt(i) == '{')
			{
				sk.push(s.charAt(i));
			}
			if (s.charAt(i) == ')')
			{
				if (!sk.isEmpty() && sk.pop() == '(')
					continue;
				else
					return false;
			}
			if (s.charAt(i) == ']')
			{
				if (!sk.isEmpty() && sk.pop() == '[')
					continue;
				else
					return false;
			}
			if (s.charAt(i) == '}')
			{
				if (!sk.isEmpty() && sk.pop() == '{')
					continue;
				else
					return false;
			}
		}
		if (sk.isEmpty())
			return true;
		else
			return false;
	}

	public static void main(String[] args)
	{
		Solution20 s20 = new Solution20();
		String target = "[({(())}[()])]";
		System.out.println(s20.isValid(target));
	}

}
