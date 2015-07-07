package solution101to110;

import Util.ListNode;
import Util.TreeNode;

public class Solution109
{
	static ListNode h;
	public TreeNode sortedListToBST(ListNode head)
	{
		if(head==null)
			return null;
		int len = getLen(head);
		h = head;
		return leftToRight(0, len-1);
	}
	
	public TreeNode leftToRight(int left, int right)
	{
		if (left>right)
			return null;
		int mid = (left+right)/2;
		TreeNode leftNode = leftToRight(left, mid - 1);
		TreeNode root = new TreeNode(h.val);
		h = h.next;
		TreeNode rightNode = leftToRight(mid+1, right);
		root.left = leftNode;
		root.right = rightNode;
		return root;
	}

	public int getLen(ListNode head)
	{
		int result = 0;
		if (head == null)
			return result;
		while (head != null)
		{
			result++;
			head = head.next;
		}
		return result;
	}

	public static void main(String[] args)
	{
		Solution109 s109 = new Solution109();
		// TODO Auto-generated method stub
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ListNode ln5 = new ListNode(5);
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		s109.sortedListToBST(ln1).show();
		
		
	}

}
