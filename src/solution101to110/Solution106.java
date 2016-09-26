package solution101to110;
import Util.TreeNode;

public class Solution106
{
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if ((inorder==null)||(inorder.length==0)||inorder.length!=postorder.length)
			return null;
		return buildTreeHelper(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
	}

	public TreeNode buildTreeHelper(int[] inorder,int iL,int iR,int[] postorder, int pL,int pR)
	{
		if (iL>iR)
			return null;
		if (iL==iR)
			return new TreeNode(inorder[iL]);
		TreeNode root = new TreeNode(postorder[pR]);
		int i = iL;
		while(inorder[i]!=root.val)
			i++;
		root.left  = buildTreeHelper(inorder,iL,i-1,postorder,pL,pL+i-1-iL);
		root.right = buildTreeHelper(inorder,i+1,iR,postorder,pL+i-iL,pR-1);
		return root;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generatd method stub

	}

}
