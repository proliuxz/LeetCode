package solution001to050;

import Util.ListNode;

public class Solution21
{
	public ListNode mergeTwoLists(ListNode l1, ListNode l2)
	{
		ListNode result = new ListNode(0);
		ListNode head = result;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		while (l1 != null && l2 != null)
		{
			if (l1.val <= l2.val)
			{
				result.next = l1;
				l1 = l1.next;
			} else
			{
				result.next = l2;
				l2 = l2.next;
			}
			result = result.next;
		}
		if (l1 == null)
			result.next = l2;
		if (l2 == null)
			result.next = l1;
		return head.next;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution21 s21 = new Solution21();
		ListNode ln11 = new ListNode(11);
		ListNode ln12 = new ListNode(12);
		ListNode ln13 = new ListNode(13);
		ListNode ln21 = new ListNode(21);
		ListNode ln22 = new ListNode(22);
		ListNode ln23 = new ListNode(23);
		ln11.next = ln12;
		ln12.next = ln13;
		ln21.next = ln22;
		ln22.next = ln23;
		ListNode result = s21.mergeTwoLists(ln11, ln21);
		while (result != null)
		{
			System.out.println(result.val);
			result = result.next;
		}
	}

}
