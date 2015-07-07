package Util;

public class TreeNode
{
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x)
	{
		val = x;
	}

	public void show()
	{
		if (this.left != null)
			this.left.show();
		System.out.println(this.val);
		if (this.right != null)
			this.right.show();
	}
}
