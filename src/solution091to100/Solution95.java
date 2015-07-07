package solution091to100;

import java.util.ArrayList;
import java.util.List;

import Util.TreeNode;

public class Solution95
{

	public List<TreeNode> generateTrees(int n)
	{
		return leftToRight(1, n);
	}
	
	public List<TreeNode> leftToRight(int left, int right)
	{
		List<TreeNode> result = new ArrayList<TreeNode>();
		if (left>right)
		{
			result.add(null);
			return result;
		}
		
		for (int i = left; i<=right; i++)
		{
			List<TreeNode> leftList = leftToRight(left, i-1);
			List<TreeNode> rightList = leftToRight(i+1, right);
			
			for (int j = 0 ; j <leftList.size();j++)
			{
				for (int k = 0 ;k<rightList.size();k++)
				{
					TreeNode root = new TreeNode(i);
					root.left = leftList.get(j);
					root.right = rightList.get(k);
					result.add(root);
				}
			}
		}
		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution95 s95 = new Solution95();
		int n = 5;
		List result = s95.generateTrees(n);
		for (int i = 0 ; i < result.size();i++)
		{
			((TreeNode) result.get(i)).show();
		}

	}

}
