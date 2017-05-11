package solution101to150;

import Util.TreeNode;

public class Solution101
{

	public boolean isSymmetric(TreeNode root)
	{
		if (root==null)
			return true;
		return isMatch(root.left,root.right);
	}
	public boolean isMatch(TreeNode left,TreeNode right)
	{
		if (left==null&&right!=null)
			return false;
		if (left!=null&&right==null)
			return false;
		if (left==null&&right==null)
			return true;
		if (left.val!=right.val)
			return false;
		if (!isMatch(left.left, right.right))
			return false;
		if (!isMatch(left.right, right.left))
			return false;
		return true;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution101 s101 = new Solution101();
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(2);
		TreeNode tn4 = new TreeNode(3);
		TreeNode tn5 = new TreeNode(3);
		tn1.left = tn2;
		tn1.right = tn3;
		tn2.left = tn4;
		tn3.right = tn5;
		System.out.println(s101.isSymmetric(tn1));
	}

}
