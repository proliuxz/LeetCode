package solution021to030Done;

import Util.ListNode;
import java.util.ArrayList;

public class Solution23
{
	
	public ListNode mergeKLists(ListNode[] lists) {
	    if(lists==null || lists.length==0)
	        return null;
	    ArrayList<ListNode> LLists = new ArrayList<ListNode>();
	    for (int i = 0 ; i < lists.length ; i++)
	    {
	    	LLists.add(lists[i]);
	    }
	    return helper(LLists,0,LLists.size()-1);
	}
	private ListNode helper(ArrayList<ListNode> lists, int l, int r)
	{
	    if(l<r)
	    {
	        int m = (l+r)/2;
	        return mergeTwoLists(helper(lists,l,m),helper(lists,m+1,r));
	    }
	    return lists.get(l);
	}
	
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
		Solution23 s23 = new Solution23();
		ListNode ln11 = new ListNode(11);
		ListNode ln12 = new ListNode(12);
		ListNode ln13 = new ListNode(13);
		ListNode ln21 = new ListNode(21);
		ListNode ln22 = new ListNode(22);
		ListNode ln23 = new ListNode(23);
		ListNode ln31 = new ListNode(31);
		ListNode ln32 = new ListNode(32);
		ListNode ln33 = new ListNode(33);
		ln11.next = ln12;
		ln12.next = ln13;
		ln21.next = ln22;
		ln22.next = ln23;
		ln31.next = ln32;
		ln32.next = ln33;
		ListNode[] lists = {ln11,ln21,ln31};
		ListNode result = s23.mergeKLists(lists);
		while (result != null)
		{
			System.out.println(result.val);
			result = result.next;
		}
	}

}
