package solution101to150;

import java.util.ArrayList;
import java.util.List;

import Util.TreeNode;

public class Solution144
{
	public List<Integer> preorderTraversal(TreeNode root)
	{
		List<Integer> result = new ArrayList<Integer>();
		if (root == null)
			return result;
		result.add(root.val);
		if (root.left != null)
			result.addAll(preorderTraversal(root.left));
		if (root.right != null)
			result.addAll(preorderTraversal(root.right));
		return result;
	}

	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(1);
		Solution144 s144 = new Solution144();
		System.out.println(s144.preorderTraversal(root));
	}

}