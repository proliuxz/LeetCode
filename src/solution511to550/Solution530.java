package solution511to550;

import Util.Show;
import Util.TreeNode;

/**
 * Created by liu.xinzhou on 18/5/2017.
 */
public class Solution530 {
    int result = Integer.MAX_VALUE;
    TreeNode pre;

    public int getMinimumDifference(TreeNode root) {
        if(root == null)
            return 0;
        getMinimumDifferenceHelper(root);
        return result;
    }
    public void getMinimumDifferenceHelper(TreeNode node) {
        if (node == null)
            return ;
        getMinimumDifferenceHelper(node.left);
        if (pre != null)
            result = Math.min(result, node.val - pre.val);
        pre = node;
        getMinimumDifferenceHelper(node.right);
    }

    public static void main (String[] args) {
        Solution530 s530 = new Solution530();
        TreeNode tr1 = new TreeNode(1);
        TreeNode tr2 = new TreeNode(2);
        TreeNode tr3 = new TreeNode(3);
        tr1.right = tr3;
        tr3.left = tr2;
        System.out.println(s530.getMinimumDifference(tr1));
    }
}
