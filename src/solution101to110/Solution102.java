package solution101to110;

import java.util.ArrayList;
import java.util.List;

import Util.ListNode;
import Util.TreeNode;

public class Solution102
{
	public List<List<Integer>> levelOrder(TreeNode root)
	{
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		result.add(temp);
		if (root==null)
			return result;
		
		temp.add(root.val);
		return result;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution102 s102 = new Solution102();
		TreeNode n1 = new TreeNode(3);
		TreeNode n2 = new TreeNode(9);
		TreeNode n3 = new TreeNode(20);
		TreeNode n4 = new TreeNode(15);
		TreeNode n5 = new TreeNode(7);
		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		n3.right = n5;
		List<List<Integer>> result = s102.levelOrder(n1);
		for(int i = 0 ; i<result.size();i++)
			for(int j = 0 ; j < result.get(i).size();j++)
			{
				System.out.println(result.get(i).get(j));
			}
	}

}
