package solution021to030;


public class Solution24
{
	public ListNode swapPairs(ListNode head)
	{
		ListNode left = head;
		ListNode right = head;
		if (head == null||head.next==null)
			return head;
		else
		{
			left = head.next;
			right = head.next.next;
			left.next = head;
			head.next = swapPairs(right);
			return left;
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution24 s24 = new Solution24();
		ListNode ln11 = new ListNode(11);
		ListNode ln12 = new ListNode(12);
		ListNode ln13 = new ListNode(13);
		ln11.next = ln12;
		ln12.next = ln13;
		ListNode result = s24.swapPairs(ln11);
		while (result != null)
		{
			System.out.println(result.val);
			result = result.next;
		}
	}

}
