package solution21to30;

import java.util.Stack;

public class Solution25
{
	public ListNode reverseKGroup(ListNode head, int k)
	{
		if (head==null||head.next==null)
			return head;
		ListNode result = new ListNode(0);
		ListNode fakeHead = result;
		Stack<ListNode> stack = new Stack<ListNode>();
		Stack<ListNode> stack2 = new Stack<ListNode>();
		while(head!=null)
		{
			stack.push(head);
			head = head.next;
			if (stack.size()==k)
			{	
				while(!stack.isEmpty())
				{
					result.next = stack.pop();
					result = result.next;
					result.next=null;
				}
			}
		}
		while(!stack.isEmpty())
		{
			stack2.push(stack.pop());
		}
		if(!stack2.isEmpty())
		result.next = stack2.pop();
		return fakeHead.next;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution25 s25 = new Solution25();
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
//		ListNode ln3 = new ListNode(3);
//		ListNode ln4 = new ListNode(4);
//		ListNode ln5 = new ListNode(5);
		ln1.next = ln2;
//		ln2.next = ln3;
//		ln3.next = ln4;
//		ln4.next = ln5;
		ListNode result = s25.reverseKGroup(ln1, 1);
		while (result != null)
		{
			System.out.println(result.val);
			result = result.next;
		}
	}

}
