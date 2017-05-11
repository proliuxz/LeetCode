package solution151to200;

import java.util.Stack;

public class Solution155
{
	Stack<Integer> s = new Stack<Integer>();
	Stack<Integer> min = new Stack<Integer>();
	public void push(int x)
	{
		if (min.isEmpty() || x <= min.peek())
			min.push(x);
		s.push(x);
	}

	public void pop()
	{
		if (s.peek().equals(min.peek()))
			min.pop();
		s.pop();
	}

	public int top()
	{
		return s.peek();
	}

	public int getMin()
	{
		return min.peek();
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution155 s155 = new Solution155();
		int[] nums = {1,5,6,61,18,9,3,16,46,0};
		for (int i = 0 ; i < nums.length ; i ++)
		{
			s155.push(nums[i]);
		}
		System.out.println(s155.getMin());
		s155.pop();
		System.out.println(s155.getMin());
		System.out.println(s155.top());
	}

}
