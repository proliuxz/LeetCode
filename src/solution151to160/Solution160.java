package solution151to160;

import java.util.HashSet;

import Util.ListNode;

public class Solution160
{

	public ListNode getIntersectionNode(ListNode headA, ListNode headB)
	{
		if (headA==null||headB==null)
			return null;
		HashSet hs = new HashSet();
		while(headA.next!=null)
		{
			hs.add(headA);
			headA=headA.next;
		}
		hs.add(headA);
		
		while(headB.next!=null)
		{
			if (!hs.add(headB))
				return headB;
			headB = headB.next;
		}
		if (!hs.add(headB))
			return headB;
		return null;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode m1 = new ListNode(1);
		ListNode m2 = new ListNode(2);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		m1.next = m2;
		m2.next = n3;
		Solution160 s160 = new Solution160();
		s160.getIntersectionNode(n1, m1).show();
	}

}
