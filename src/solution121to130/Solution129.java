package solution121to130;

import Util.TreeNode;

public class Solution129
{

	public int sumNumbers(TreeNode root)
	{
		if (root == null)
			return 0;
		return getSum(root, 0);
	}

	public int getSum(TreeNode root, int saved)
	{

		if (root == null)
			return 0;
		int result = saved * 10 + root.val;
		if (root.left == null && root.right == null)
			return result;
		else
			return getSum(root.left, result) + getSum(root.right, result);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution129 s129 = new Solution129();
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		n1.left = n2;
		n1.right = n3;
		System.out.println(s129.sumNumbers(n1));
	}

}
