package solution401to450;

import Util.TreeNode;

/**
 * Created by Xinzhuo Liu on 10/11/2016.
 */
public class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;
        if ((root.left != null) && (root.left.left == null) && (root.left.right == null)) {
            return root.left.val + sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
