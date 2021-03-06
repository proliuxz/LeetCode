package solution201to250;

import Util.TreeNode;

/**
 * Created by Liu Xinzhuo on 2016/5/19 0019.
 */
public class Solution236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root ==null)
            return null;
        if (root == p||root == q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if (left!=null && right!=null)
            return root;
        return left!=null?left:right;
    }
}
