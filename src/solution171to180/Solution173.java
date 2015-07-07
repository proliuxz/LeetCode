package solution171to180;

import java.util.Stack;

import Util.TreeNode;

public class Solution173
{
	Stack<TreeNode> stack;

	public void BSTIterator(TreeNode root)
	{
		stack = new Stack<TreeNode>();
		while (root != null)
		{
			stack.push(root);
			root = root.left;
		}
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext()
	{
		return !stack.isEmpty();
	}

	/** @return the next smallest number */
	public int next()
	{
		TreeNode node = stack.pop();
		int result = node.val;
		if (node.right != null)
		{
			node = node.right;
			while (node != null)
			{
				stack.push(node);
				node = node.left;
			}
		}
		return result;
	}
}
