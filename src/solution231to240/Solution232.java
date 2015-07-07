package solution231to240;

import java.util.Stack;

public class Solution232
{
	Stack<Integer> head = new Stack<Integer>();
	Stack<Integer> till = new Stack<Integer>();

	// Push element x to the back of queue.

	private void moveStack1ToStack2()
	{
		while (!head.isEmpty())
			till.push(head.pop());
	}

	public void push(int x)
	{
		head.push(x);
	}

	// Removes the element from in front of queue.
	public void pop()
	{
		if (!till.isEmpty())
			till.pop();
		else
		{
			this.moveStack1ToStack2();
			till.pop();
		}
	}

	// Get the front element.
	public int peek()
	{
		if (!till.isEmpty())
			return till.peek();
		else
		{
			this.moveStack1ToStack2();
			return till.peek();
		}
	}

	// Return whether the queue is empty.
	public boolean empty()
	{
		return (head.isEmpty()) && (till.isEmpty());
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution232 s232 = new Solution232();
		int[] a = {1,6,8,5,8,4,3,8,6,899,6,5,7};
		for (int i = 0 ; i < a.length ; i++)
		{
			s232.push(a[i]);
		}
		s232.pop();
		System.out.println(s232.peek());
	}

}
