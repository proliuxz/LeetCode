package solution101to150;

import Util.TreeNode;

public class Solution111
{
	public int minDepth(TreeNode root)
	{
		if (root==null)
			return 0;
		return getMinPath(root);
	}
	public int getMinPath(TreeNode root)
	{
		if (root==null)
			return Integer.MAX_VALUE;
		if (root.left==null&&root.right==null)
			return 1;
		return Math.min(getMinPath(root.left), getMinPath(root.right)) +1 ;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution111 s11 = new Solution111();

	}

}
