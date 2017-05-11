package solution101to150;

import Util.ListNode;

import java.util.HashMap;

public class Solution141
{
	public boolean hasCycle(ListNode head)
	{
		if (head==null)
			return false;
		HashMap hm = new HashMap();
		while (head.next!=null)
		{
			if (hm.containsKey(head))
				return true;
			hm.put(head, head.next);
			head = head.next;
		}
		return false;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution141 s141 = new Solution141();
		ListNode head = new ListNode(0);
		head.next = head;
		System.out.println(s141.hasCycle(head));
	}

}
