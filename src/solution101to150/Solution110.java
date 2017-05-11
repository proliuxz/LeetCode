package solution101to150;

import Util.TreeNode;

public class Solution110
{
	public boolean isBalanced(TreeNode root)
	{
		if (root==null)
			return true;
		if (getHeight(root)==-1)
			return false;
		return true;
	}

	public int getHeight(TreeNode root)
	{
		if (root == null)
			return 0;

		int left = getHeight(root.left);
		int right = getHeight(root.right);

		if (left == -1 || right == -1)
			return -1;

		if (Math.abs(left - right) > 1)
		{
			return -1;
		}

		return Math.max(left, right) + 1;

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution110 s110 = new Solution110();
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		TreeNode tn4 = new TreeNode(4);
		TreeNode tn5 = new TreeNode(5);
		tn1.left = tn2;
		tn1.right = tn3;
		tn2.left = tn4;
		tn2.right = tn5;
		System.out.println(s110.isBalanced(tn1));
		
	}

}
