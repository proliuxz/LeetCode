package solution551to600;

import Util.TreeNode;

/**
 * Created by liu.xinzhou on 17/5/2017.
 */
public class Solution563 {
    int result = 0;
    public int findTilt(TreeNode root) {
        if (root == null)
            return 0;
        findTiltHelper(root);
        return result;
    }

    public int findTiltHelper(TreeNode node) {
        if(node == null )
            return 0;
        int left = findTiltHelper(node.left);
        int right = findTiltHelper(node.right);
        result += Math.abs(left - right);
        return left + right+node.val;
    }
}
