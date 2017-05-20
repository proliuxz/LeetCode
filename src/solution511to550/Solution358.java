package solution511to550;

import Util.TreeNode;

/**
 * Created by Xinzhuo Liu on 5/11/2017.
 */
public class Solution358 {
    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }

    public void convert(TreeNode node) {
        if (node == null) return;
        convert(node.right);
        node.val += sum;
        sum = node.val;
        convert(node.left);
    }
}
