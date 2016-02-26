package solution111to120;

import Util.TreeLinkNode;

public class Solution117
{

	public void connect(TreeLinkNode root)
	{

		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeLinkNode root = new TreeLinkNode(1);
		TreeLinkNode node1 = new TreeLinkNode(2);
		TreeLinkNode node2 = new TreeLinkNode(3);
		TreeLinkNode node3 = new TreeLinkNode(4);
		TreeLinkNode node4 = new TreeLinkNode(5);
		TreeLinkNode node5 = new TreeLinkNode(7);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.right = node5;
	}

}
