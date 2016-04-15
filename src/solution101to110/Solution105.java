package solution101to110;
import Util.TreeNode;
/**
 * Created by Liu Xinzhuo on 2016/4/14 0014.
 */
public class Solution105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder==null||preorder.length==0||preorder.length!=inorder.length)
            return null;
        return  build(preorder,inorder,0,preorder.length-1,0);
    }
    public TreeNode build(int[] preorder, int[] inorder, int left, int right,int p)
    {
        if (left>right)
            return null;
        TreeNode treeNode = new TreeNode(preorder[p]);
        int pos = 0;
        for (int i = left; i <= right; ++i) {
            if(preorder[p] == inorder[i])
            {
                pos = i;
                break;
            }
        }
        treeNode.left = build(preorder,inorder,left,pos-1,p+1);
        treeNode.right = build(preorder,inorder,pos+1,right,p+pos-left+1);
        return treeNode;
    }
}
