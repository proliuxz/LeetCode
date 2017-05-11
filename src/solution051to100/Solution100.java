package solution051to100;

import Util.TreeNode;

public class Solution100
{
	public boolean isSameTree(TreeNode p, TreeNode q)
	{
		if (p == null && q == null)
			return true;
		else if (p == null && q != null)
			return false;
		else if (p != null && q == null)
			return false;
		else
		{
			if (p.left == null && q.left == null && p.right == null
					&& q.right == null && p.val == q.val)
				return true;
			else
			{
				if (p.val == q.val)
					return (isSameTree(p.left, q.left))
							&& (isSameTree(p.right, q.right));
				else
					return false;
			}
		}

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(1);
		TreeNode t3 = new TreeNode(2);
		Solution100 s100 = new Solution100();
		System.out.println(s100.isSameTree(t1, t2));
		System.out.println(s100.isSameTree(t1, t3));
	}

}
