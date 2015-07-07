package solution101to110;

import Util.TreeNode;

public class Solution108
{

	public TreeNode sortedArrayToBST(int[] nums)
	{
		if (nums.length == 0)
			return null;
		return build(nums, 0, nums.length - 1);
	}

	public TreeNode build(int[] x, int start, int end)
	{
		if (start > end)
			return null;
		int mid = (start + end)/2;
		TreeNode result = new TreeNode(x[mid]);
		result.left = build(x, start, mid-1);
		result.right = build(x,mid+1, end);
		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution108 s108 = new Solution108();
		int[] nums = { 26, 5, 4, 69, 46, 646, 468, 1, 0 };
		TreeNode result = s108.sortedArrayToBST(nums);
		result.show();
	}
}
