package solution501to550;

import Util.TreeNode;

/**
 * Created by liu.xinzhou on 8/6/2017.
 */
public class Solution543 {
    int max = -1;
    public int diameterOfBinaryTree(TreeNode root) {
        findDeepth(root);
        return max;
    }

    private int findDeepth(TreeNode tree) {
        if (tree == null) return 0;
        int left = findDeepth(tree.left);
        int right = findDeepth(tree.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}
