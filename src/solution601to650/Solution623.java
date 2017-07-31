package solution601to650;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liu.xinzhou on 19/6/2017.
 */
public class Solution623 {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        List<TreeNode> cur = new ArrayList<TreeNode>();
        cur.add(root);
        helper(1,d,cur);
        return new TreeNode(1);
    }

    public List<TreeNode> helper(int level,int target, List<TreeNode> cur) {
        if (level == target)
            return cur;
        List next = new ArrayList();
        for (TreeNode node: cur
             ) {
            if (node.left!=null)
                next.add(node.left);

            if (node.right!=null)
                next.add(node.right);
        }
        return helper(level+1, target, next);
    }

    public static void main (String[] args) {
        Solution623 s623 = new Solution623();
        
    }
}
