package solution011to020;

import java.util.HashMap;

public class Solution19
{
	public ListNode removeNthFromEnd(ListNode head, int n)
	{
		HashMap<Integer, ListNode> hm = new HashMap<Integer, ListNode>();
		ListNode temp = head;
		do
		{
			hm.put(hm.size(), temp);
			temp = temp.next;
		}
		while(temp!=null);
		
		if (hm.size()-n>0)
		{
			hm.get(hm.size()-n-1).next = hm.get(hm.size()-n).next;
		}
		else if(hm.size()-n==0)
		{
			head = hm.get(1);
		}
		else
		{
			return head;
		}
		
		return head;
	}

	public static void main(String[] args)
	{
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ListNode ln5 = new ListNode(5);
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		int n = 2;
		Solution19 s19 = new Solution19();
		ListNode result = s19.removeNthFromEnd(ln1, n);
		while (result != null)
		{
			System.out.println(result.val);
			result = result.next;
		}
	}

}

class ListNode
{
	int val;
	ListNode next;

	ListNode(int x)
	{
		val = x;
	}
}