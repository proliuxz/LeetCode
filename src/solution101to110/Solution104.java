package solution101to110;

import Util.TreeNode;


public class Solution104
{
	public int maxDepth(TreeNode root)
	{
		if (root == null)
		{
			return 0;
		}
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		return Math.max(left, right)+1;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		TreeNode sub1 = new TreeNode(4);
		TreeNode sub2 = new TreeNode(3);
		root.left = sub1;
		sub1.left = sub2;
		Solution104 s104 = new Solution104();
		System.out.println(s104.maxDepth(root));
	}

}
