package solution141to150;

import Util.ListNode;

import java.util.HashSet;

public class Solution142
{

	public ListNode detectCycle(ListNode head)
	{
		ListNode left = head;
		ListNode right = head;
		while (left != null && right != null)
		{
			left = left.next;
			right = right.next;
			if (right != null)
				right = right.next;
			if (left == right)
				break;
		}

		if (right == null)
			return null;
		while (head != right)
		{
			head = head.next;
			right = right.next;
		}
		return right;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution142 s142 = new Solution142();
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n1;
		System.out.println(s142.detectCycle(n1));
	}

}
