package solution081to090;

import Util.ListNode;

public class Solution83
{

	public ListNode deleteDuplicates(ListNode head)
	{
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		ListNode start = head;
		ListNode end = head.next;
		while (end != null)
		{
			if (end.val == start.val)
			{
				start.next = end.next;
				end = end.next;

			} else
			{
				start = end;
				end = end.next;
			}
		}
		return head;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ListNode ln1 = new ListNode(0);
		ListNode ln2 = new ListNode(0);
		ListNode ln3 = new ListNode(0);
		ListNode ln4 = new ListNode(1);
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		Solution83 s83 = new Solution83();
		s83.deleteDuplicates(ln1).show();
	}
}
