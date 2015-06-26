package solution091to100;

import java.util.ArrayList;
import java.util.List;
import Util.TreeNode;

public class Solution94
{
	public List<Integer> inorderTraversal(TreeNode root)
	{
		List<Integer> result = new ArrayList<Integer>();
		if (root == null)
			return result;
		if (root.left != null)
			result.addAll(inorderTraversal(root.left));
		result.add(root.val);
		if (root.right != null)
			result.addAll(inorderTraversal(root.right));
		return result;
	}

	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(1);
		Solution94 s94 = new Solution94();
		System.out.println(s94.inorderTraversal(root));
	}
}
