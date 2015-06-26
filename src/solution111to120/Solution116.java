package solution111to120;

import Util.TreeLinkNode;

public class Solution116
{

	public void connect(TreeLinkNode root) {
		
		if (root==null)
			return;
		
		if (root.left!=null)
		{
			root.left.next=root.right;
		}
		if (root.right!=null)
		{
			if (root.next==null)
				root.right.next=null;
			else
			{
				root.right.next=root.next.left;
			}
		}
		
		connect(root.left);
		connect(root.right);
        
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution116 s116 = new Solution116();
		TreeLinkNode root = new TreeLinkNode(1);
		TreeLinkNode n21 = new TreeLinkNode(2);
		TreeLinkNode n22 = new TreeLinkNode(3);
		root.left = n21;
		root.right = n22;
	}

}
