package solution401to450;

import Util.TreeNode;

/**
 * Created by Xinzhuo Liu on 10/28/2016.
 */
public class Solution437 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int ret = pathWithRoot(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
        return ret;
    }
    private int pathWithRoot(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int ret = 0;
        if (root.val == sum) {
            ret++;
        }
        ret += pathWithRoot(root.left, sum-root.val) + pathWithRoot(root.right, sum-root.val);
        return ret;
    }
}
