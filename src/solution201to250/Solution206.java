package solution201to250;

import Util.ListNode;

public class Solution206
{
	public ListNode reverseList(ListNode head)
	{
		if (head == null || head.next == null)
			return head;

		ListNode second = head.next;
		head.next = null;
		ListNode rest = reverseList(second);
		second.next = head;
		return rest;
	}

	public static void main(String[] args)
	{
		Solution206 s206 = new Solution206();
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		s206.reverseList(n1).show();
	}

}
