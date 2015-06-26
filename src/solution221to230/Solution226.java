package solution221to230;

import Util.TreeNode;

public class Solution226
{

	public TreeNode invertTree(TreeNode root)
	{
		if (root == null)
		{
			return null;
		}
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		if(root.left!=null)
		{
			root.left = invertTree(root.left);
		}
		if(root.right!=null)
		{
			root.right = invertTree(root.right);
		}
		return root;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution226 s226 = new Solution226();
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = null;
		root.left = left;
		root.right = right;
		TreeNode result = s226.invertTree(root);
		System.out.println(result.val);
		System.out.println(result.right.val);
	}

}
