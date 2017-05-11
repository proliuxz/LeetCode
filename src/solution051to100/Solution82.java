package solution051to100;

import Util.ListNode;

public class Solution82
{

	public ListNode deleteDuplicates(ListNode head)
	{
		if (head == null)
			return head;
		if (head.next == null)
			return head;
		ListNode fakeHead = new ListNode(0);
		fakeHead.next = head;
		ListNode left = fakeHead;
		ListNode right = head;
		while (right != null)
		{
			while (right.next != null && left.next.val == right.next.val)
			{
				right = right.next;
			}
			if (left.next == right)
			{
				left = left.next;
			} else
			{
				left.next = right.next;
			}
			right = right.next;
		}
		return fakeHead.next;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution82 s82 = new Solution82();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(4);
		ListNode l7 = new ListNode(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		s82.deleteDuplicates(l1).show();

		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(1);
		ListNode n4 = new ListNode(2);
		ListNode n5 = new ListNode(3);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		s82.deleteDuplicates(n1).show();
	}

}
