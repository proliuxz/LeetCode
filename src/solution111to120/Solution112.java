package solution111to120;

import Util.TreeNode;

public class Solution112
{
	public boolean hasPathSum(TreeNode root, int sum)
	{
		if (root==null)
			return false;
		if (root.left==null&&root.right==null)
			return root.val==sum;
		return hasPathSum(root.left, sum-root.val)||hasPathSum(root.right, sum-root.val);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution112 s112 = new Solution112();
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		n1.left = n2;
		n1.right = n3;
		System.out.println(s112.hasPathSum(n1, 1));
	}

}
