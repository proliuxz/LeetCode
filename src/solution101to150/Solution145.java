package solution101to150;

import java.util.ArrayList;
import java.util.List;

import Util.TreeNode;

public class Solution145
{

	public List<Integer> postorderTraversal(TreeNode root)
	{
		List<Integer> result = new ArrayList<Integer>();
		if (root == null)
			return result;
		if (root.left != null)
			result.addAll(postorderTraversal(root.left));
		if (root.right != null)
			result.addAll(postorderTraversal(root.right));
		result.add(root.val);
		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution145 s145 = new Solution145();
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		tn1.right = tn2;
		tn2.left = tn3;
		tn1.show();
	}

}
