package solution1to10;

public class Solution2
{
	int flag = 0;

	public ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		ListNode result = new ListNode(0);
		result.val = plus(l1.val,l2.val);
		System.out.println((l1.next==null)&&(l2.next==null));
		if ((l1.next==null)&&(l2.next==null))
		{
				if (flag==1)
				{
					result.next = new ListNode(1);
					flag=0;
				}
				else
				{
					result.next = null;
				}
				return result;
		}
		else
		{
			if (l1.next==null)
			{
				if (flag==1)
				{
					l2.next.val = plus(l2.next.val,0);
				}
				result.next = addTwoNumbers(l2.next,new ListNode(0));
				return result;
			}
			if (l2.next==null)
			{
				if (flag==1)
				{
					l1.next.val = plus(l1.next.val,0);
				}
				result.next = addTwoNumbers(l1.next,new ListNode(0));
				return result;
			}
			else
			{
				result.next = addTwoNumbers(l1.next,l2.next);
				return result;
			}
		}
	}

	public int plus(int a, int b)
	{
			int tempval =  a +  b + flag;
			int calcResult = tempval % 10;
			if (tempval>= 10)
				flag = 1;
			else
				flag=0;
			return calcResult;
	}

	public static void main(String[] args)
	{
		ListNode a1 = new ListNode(2);
		ListNode a2 = new ListNode(4);
		ListNode a3 = new ListNode(3);
		ListNode b1 = new ListNode(5);
		ListNode b2 = new ListNode(6);
		ListNode b3 = new ListNode(4);
		a1.next = a2;
		a2.next = a3;
		b1.next = b2;
		b2.next = b3;

		Solution2 s2 = new Solution2();
		ListNode result = s2.addTwoNumbers(a1, b1);
		System.out.println(result.val);
		System.out.println(result.next.val);
		System.out.println(result.next.next.val);

	}
}

class ListNode
{
	int val;
	ListNode next;

	ListNode(int x)
	{
		val = x;
		next = null;
	}
}
