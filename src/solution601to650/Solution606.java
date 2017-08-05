package solution601to650;

import Util.TreeNode;

/**
 * Created by Liu XZ on 2017/6/4.
 */
public class Solution606 {
    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        helper(sb, t);
        return sb.toString();
    }

    private void helper(StringBuilder sb, TreeNode node) {
        if (node != null) {
            sb.append(node.val);
            if (node.left != null || node.right != null) {
                sb.append("(");
                helper(sb, node.left);
                sb.append(")");
            }
            if (node.right != null) {
                sb.append("(");
                helper(sb, node.right);
                sb.append(")");
            }
        }
    }
}
