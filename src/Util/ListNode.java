package Util;

public class ListNode
{
	public int val;
	public ListNode next;

	public ListNode(int x)
	{
		val = x;
		next = null;
	}
	public void show()
	{
		System.out.println(this.val);
		if (this.next!=null)
			this.next.show();
	}
}
